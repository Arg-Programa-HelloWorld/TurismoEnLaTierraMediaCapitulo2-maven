package controller.promotions;

 import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

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
import model.PromotionAbsolute;
import model.PromotionAyB;
import model.PromotionPercentage;

@WebServlet("/views/promotions/create.do")
public class CreatePromotionServlet extends HttpServlet {

	private static final long serialVersionUID = 1174436265403572047L;
	private PromotionManager promotionManager;
	private AttractionManager attractionManager;
	
	@Override
	public void init() throws ServletException {
		super.init();
		this.promotionManager = new PromotionManager();
		this.attractionManager = new AttractionManager();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// GET envía los datos usando la URL
		/*
		List<Promotion> promotions = promotionManager.findAll();
		req.setAttribute("promotions", promotions);
		*/
		List<Attraction> attractions = attractionManager.findAll();
		req.setAttribute("attractions", attractions);
		
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
		
		Integer idAttraction1 = Integer.parseInt(req.getParameter("idAttraction1")); 
		Integer idAttraction2 = Integer.parseInt(req.getParameter("idAttraction2"));

		Attraction attractionTemp1 = attractionManager.findById(idAttraction1);
		Attraction attractionTemp2 = attractionManager.findById(idAttraction2);
		
		LinkedList<Attraction> attractionsListTemp = new LinkedList<Attraction>();
		
		attractionsListTemp.add(attractionTemp1);
		attractionsListTemp.add(attractionTemp2);
		
		System.out.println(name);
		
		if (promotionTypeID == 1) {
			promotionTemp = new PromotionPercentage(name, time, cost, discount, "", promotionTypeID, attractionsListTemp);
		}
		if (promotionTypeID == 2) {
			promotionTemp = new PromotionAbsolute(name, time, cost, discount, "", promotionTypeID , attractionsListTemp);
		}
		if (promotionTypeID == 3) {
			promotionTemp = new PromotionAyB(name, time, cost, discount, "", promotionTypeID, attractionsListTemp);
		}
		
		promotionTemp.calculatePrice();

		System.out.println(promotionTemp);
		
		promotionManager.insert(promotionTemp);
		
		promotionTemp = promotionManager.getLastPromotion();
		
		promotionManager.relateAttractionToPromotion(promotionTemp, attractionTemp1);
		promotionManager.relateAttractionToPromotion(promotionTemp, attractionTemp2);
		
		if (promotionTemp.isValid()) {
			resp.sendRedirect("/TurismoEnLaTierraMediaCapitulo2-maven/views/promotions/index.do");
			//System.out.println("Es Valida");
		} else {
			//System.out.println("¡NO!, Es Valida");
			req.setAttribute("promotion", promotionTemp);

			RequestDispatcher dispatcher = getServletContext()
					.getRequestDispatcher("/TurismoEnLaTierraMediaCapitulo2-maven/views/promotions/create.jsp");
			dispatcher.forward(req, resp);
		}


	}

}
