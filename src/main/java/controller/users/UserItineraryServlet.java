package controller.users;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import manager.ItineraryManager;
import manager.UserManager;
import model.Attraction;
import model.Promotion;
import model.User;

@WebServlet("/views/users/itinerary.do")
public class UserItineraryServlet extends HttpServlet implements Servlet {

	private static final long serialVersionUID = -2345910712520396086L;
	private UserManager userManager;
	private ItineraryManager itineraryManager;

	@Override
	public void init() throws ServletException {
		super.init();
		this.userManager = new UserManager();
		this.itineraryManager = new ItineraryManager();

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Integer id = Integer.parseInt(req.getParameter("id"));

		User user = userManager.findById(id);
				
		
		List<Promotion> promotions = itineraryManager.getListPromotions(user);
		List<Attraction> attractions = itineraryManager.getLisAttraction(user);

		System.out.println(promotions.toString());
		System.out.println(attractions.toString());

		req.setAttribute("client", user);
		req.setAttribute("promotions", promotions);
		req.setAttribute("attractions", attractions);

		user.calcular();

		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/views/users/userItinerary.jsp");
		dispatcher.forward(req, resp);
	}
}
