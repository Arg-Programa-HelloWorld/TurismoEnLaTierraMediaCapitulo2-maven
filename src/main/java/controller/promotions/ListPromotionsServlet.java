package controller.promotions;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import manager.PromotionManager;
import model.Promotion;

@WebServlet("/views/promotions/index.do")
public class ListPromotionsServlet extends HttpServlet implements Servlet {

	private static final long serialVersionUID = -8346640902238722429L;
	private PromotionManager promotionManager;

	@Override
	public void init() throws ServletException {
		super.init();
		this.promotionManager = new PromotionManager();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Promotion> promotions = promotionManager.findAll();
		req.setAttribute("promotions", promotions);
		
		System.out.println(promotions);

		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/views/promotions/index.jsp");
		//RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/views/promotions/promotions.jsp");
		dispatcher.forward(req, resp);

	}

}
