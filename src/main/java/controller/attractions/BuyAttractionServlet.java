package controller.attractions;

import java.io.IOException;
import java.util.Map;

import dao.DAOFactory;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import manager.PurchaseManager;
import model.User;

@WebServlet("/attractions/buy.do")
public class BuyAttractionServlet extends HttpServlet {

	private static final long serialVersionUID = -1823174623597123779L;
	private PurchaseManager purchaseManager;

	@Override
	public void init() throws ServletException {
		super.init();
		this.purchaseManager = new PurchaseManager();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Integer attractionId = Integer.parseInt(req.getParameter("id"));
		User user = (User) req.getSession().getAttribute("user");
		Map<String, String> errors = purchaseManager.buyAttraction(user.getId(), attractionId);
		
		User user2 = DAOFactory.getUserDAO().findById(user.getId());
		req.getSession().setAttribute("user", user2);
		
		if (errors.isEmpty()) {
			req.setAttribute("flash", "¡Gracias por comprar!");
		} else {
			req.setAttribute("errors", errors);
			req.setAttribute("flash", "No ha podido realizarse la compra");
		}

		RequestDispatcher dispatcher = getServletContext()
				.getRequestDispatcher("/views/attractions/index.do");
		dispatcher.forward(req, resp);
	}
}