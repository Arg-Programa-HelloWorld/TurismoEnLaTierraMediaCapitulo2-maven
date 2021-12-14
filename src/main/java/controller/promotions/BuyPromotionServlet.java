package controller.promotions;

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

@WebServlet("/views/promotions/buy.do")
public class BuyPromotionServlet extends HttpServlet {

	private static final long serialVersionUID = 8416851553224895213L;
	private PurchaseManager purchaseManager;

	@Override
	public void init() throws ServletException {
		super.init();
		this.purchaseManager = new PurchaseManager();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Integer promotionId = Integer.parseInt(req.getParameter("id"));
		User user = (User) req.getSession().getAttribute("user");
		Map<String, String> errors = purchaseManager.buyPromotion(user.getId(), promotionId);

		User user2 = DAOFactory.getUserDAO().findById(user.getId());
		req.getSession().setAttribute("user", user2);

		if (errors.isEmpty()) {
			req.setAttribute("success", "�Gracias por comprar!");
		} else {
			req.setAttribute("errors", errors);
			req.setAttribute("flash", "No ha podido realizarse la compra");
		}

		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/views/promotions/index.do");
		dispatcher.forward(req, resp);
	}
}
