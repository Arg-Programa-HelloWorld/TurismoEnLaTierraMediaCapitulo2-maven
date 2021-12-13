package controller.promotions;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import manager.AttractionManager;
import model.Attraction;


@WebServlet("/views/attractions/edit.do")
public class EditPromotionServlet extends HttpServlet {

	private static final long serialVersionUID = 7598291131560345626L;
	private AttractionManager attractionManager;

	@Override
	public void init() throws ServletException {
		super.init();
		this.attractionManager = new AttractionManager();
				
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// GET envía los datos usando la URL
		
		Integer id = Integer.parseInt(req.getParameter("id"));

		Attraction attractionTemp = attractionManager.findById(id);
		req.setAttribute("attraction", attractionTemp);

		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/views/attractions/edit.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// POST los envía de forma que no podemos verlos (en un segundo plano u "ocultos" al usuario).
		
		Integer id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		Integer cost = Integer.parseInt(req.getParameter("cost"));
		// Integer cost = req.getParameter("cost").trim() == "" ? null : Integer.parseInt(req.getParameter("cost"));
		Double time = Double.parseDouble(req.getParameter("time"));
		Integer quota = Integer.parseInt(req.getParameter("quota"));

		Attraction attractionTemp = attractionManager.findById(id);
		attractionTemp.setName(name);
		attractionTemp.setCost(cost);
		attractionTemp.setTime(time);
		attractionTemp.setQuota(quota);
		
		attractionManager.update(attractionTemp);

		if (attractionTemp.isValid()) {
			resp.sendRedirect("/TurismoEnLaTierraMediaCapitulo2-maven/views/attractions/index.do");
		} else {
			req.setAttribute("attraction", attractionTemp);

			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/TurismoEnLaTierraMediaCapitulo2-maven/views/attractions/edit.jsp");
			dispatcher.forward(req, resp);
		}
	}
}
