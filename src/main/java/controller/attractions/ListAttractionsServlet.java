package controller.attractions;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import manager.AttractionManager;
import model.Attraction;

@WebServlet("/views/attractions/index.do")
public class ListAttractionsServlet extends HttpServlet implements Servlet {

	private static final long serialVersionUID = -8346640902238722429L;
	private AttractionManager attractionManager;

	@Override
	public void init() throws ServletException {
		super.init();
		this.attractionManager = new AttractionManager();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Attraction> attractions = attractionManager.findAll();
		req.setAttribute("attractions", attractions);
		
		//System.out.println(attractions);
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/views/attractions/index.jsp");
		dispatcher.forward(req, resp);

	}

}
