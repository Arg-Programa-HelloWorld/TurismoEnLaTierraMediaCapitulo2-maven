package controller.attractions;

 import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import manager.AttractionManager;
import model.Attraction;

@WebServlet("/views/attractions/create.do")
public class CreateAttractionServlet extends HttpServlet {

	private static final long serialVersionUID = 3455721046062278592L;
	private AttractionManager attractionManager;
	
	@Override
	public void init() throws ServletException {
		super.init();
		this.attractionManager = new AttractionManager();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// GET envía los datos usando la URL
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/views/attractions/create.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// POST los envía de forma que no podemos verlos (en un segundo plano u "ocultos" al usuario).
		
		String name = req.getParameter("name");
		Integer cost = Integer.parseInt(req.getParameter("cost"));
		Double time = Double.parseDouble(req.getParameter("time"));
		Integer quota = Integer.parseInt(req.getParameter("quota"));
		Integer attractionTypeID = Integer.parseInt(req.getParameter("attraction-type"));

		Attraction attractionTemp = new Attraction(name, cost, time, quota, attractionTypeID);
		
		attractionManager.insert(attractionTemp);
		
		if (attractionTemp.isValid()) {
			resp.sendRedirect("/TurismoEnLaTierraMediaCapitulo2-maven/views/attractions/index.do");
		} else {
			req.setAttribute("attraction", attractionTemp);

			RequestDispatcher dispatcher = getServletContext()
					.getRequestDispatcher("/TurismoEnLaTierraMediaCapitulo2-maven/views/attractions/create.jsp");
			dispatcher.forward(req, resp);
		}

	}

}
