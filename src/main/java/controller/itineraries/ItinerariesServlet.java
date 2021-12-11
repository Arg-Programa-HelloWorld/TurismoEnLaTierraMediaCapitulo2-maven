package controller.itineraries;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import manager.ItineraryManager;
import model.Attraction;
import model.Itinerary;
import model.Promotion;
import model.User;

@WebServlet("/views/itineraries/index.do")
public class ItinerariesServlet extends HttpServlet implements Servlet {

	private static final long serialVersionUID = 8892005185510616593L;	
	private ItineraryManager itineraryManager;
	
	@Override
	public void init() throws ServletException {
		super.init();
		this.itineraryManager = new ItineraryManager();
		
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				
		User user = (User) req.getSession().getAttribute("user");
		
		List<Promotion> promotions = itineraryManager.getListPromotions(user);
		List<Attraction> attractions = itineraryManager.getLisAttraction(user);
		
		System.out.println(promotions.toString());
		System.out.println(attractions.toString());
		
		req.setAttribute("promotions", promotions);
		req.setAttribute("attractions", attractions);
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/views/itineraries/index.jsp");
		dispatcher.forward(req, resp);
	}
}
