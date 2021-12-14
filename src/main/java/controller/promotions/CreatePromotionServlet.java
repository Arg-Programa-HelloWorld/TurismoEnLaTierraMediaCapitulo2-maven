package controller.promotions;

 import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import manager.PromotionManager;
import model.Promotion;
import model.PromotionAbsolute;
import model.PromotionAyB;
import model.PromotionPercentage;

@WebServlet("/views/promotions/create.do")
public class CreatePromotionServlet extends HttpServlet {

	private static final long serialVersionUID = 1174436265403572047L;
	private PromotionManager promotionManager;
	
	@Override
	public void init() throws ServletException {
		super.init();
		this.promotionManager = new PromotionManager();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// GET envía los datos usando la URL
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/views/promotions/create.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// POST los envía de forma que no podemos verlos (en un segundo plano u "ocultos" al usuario).
		
		Promotion promotionTemp = null;
		
		String name = req.getParameter("name");
		Double time = Double.parseDouble(req.getParameter("time"));
		Double cost = Double.parseDouble(req.getParameter("cost"));
		Double discount = Double.parseDouble(req.getParameter("discount"));
		Integer promotionTypeID = Integer.parseInt(req.getParameter("promotionTypeID"));

		System.out.println(name);
		
		if (promotionTypeID == 1) {
			promotionTemp = new PromotionPercentage(name, time, cost, discount, "", promotionTypeID);
		}
		if (promotionTypeID == 2) {
			promotionTemp = new PromotionAbsolute(name, time, cost, discount, "", promotionTypeID);
		}
		if (promotionTypeID == 3) {
			promotionTemp = new PromotionAyB(name, time, cost, discount, "", promotionTypeID);
		}

		System.out.println(promotionTemp);
		
		promotionManager.insert(promotionTemp);
		
		if (promotionTemp.isValid()) {
			resp.sendRedirect("/TurismoEnLaTierraMediaCapitulo2-maven/views/promotions/index.do");
			System.out.println("Es Valida");
		} else {
			System.out.println("¡NO!, Es Valida");
			req.setAttribute("promotion", promotionTemp);

			RequestDispatcher dispatcher = getServletContext()
					.getRequestDispatcher("/TurismoEnLaTierraMediaCapitulo2-maven/views/promotions/create.jsp");
			dispatcher.forward(req, resp);
		}


	}

}
