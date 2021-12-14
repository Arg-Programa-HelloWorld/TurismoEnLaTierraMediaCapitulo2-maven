package controller.promotions;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import manager.AttractionManager;
import manager.PromotionManager;
import model.Attraction;
import model.Promotion;


@WebServlet("/views/promotions/edit.do")
public class EditPromotionServlet extends HttpServlet {

	private static final long serialVersionUID = 7598291131560345626L;
	private PromotionManager promotionManager;

	@Override
	public void init() throws ServletException {
		super.init();
		this.promotionManager = new PromotionManager();
				
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// GET envía los datos usando la URL
		
		Integer id = Integer.parseInt(req.getParameter("id"));

		Promotion promotionTemp = promotionManager.findById(id);
		req.setAttribute("promotion", promotionTemp);

		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/views/promotions/edit.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// POST los envía de forma que no podemos verlos (en un segundo plano u "ocultos" al usuario).
		
		Integer id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		Double time = Double.parseDouble(req.getParameter("time"));
		Integer cost = Integer.parseInt(req.getParameter("cost"));
		Double discount = Double.parseDouble(req.getParameter("discount"));
		Integer promotionTypeID = Integer.parseInt(req.getParameter("promotionTypeID"));

		Promotion promotionTemp = promotionManager.findById(id);
		promotionTemp.setName(name);
		promotionTemp.setTime(time);
		promotionTemp.setCost(cost);
		promotionTemp.setDiscount(discount);
		
		promotionManager.update(promotionTemp);

		if (promotionTemp.isValid()) {
			resp.sendRedirect("/TurismoEnLaTierraMediaCapitulo2-maven/views/promotions/index.do");
		} else {
			req.setAttribute("promotion", promotionTemp);

			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/TurismoEnLaTierraMediaCapitulo2-maven/views/promotions/edit.jsp");
			dispatcher.forward(req, resp);
		}
	}
}
