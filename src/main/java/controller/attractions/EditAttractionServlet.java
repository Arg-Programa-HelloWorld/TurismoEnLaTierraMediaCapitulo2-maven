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

@WebServlet("/views/attractions/edit.do")
public class EditAttractionServlet extends HttpServlet {

	private static final long serialVersionUID = 7598291131560345626L;
	private AttractionManager attractionManager;

	@Override
	public void init() throws ServletException {
		super.init();
		this.attractionManager = new AttractionManager();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer id = Integer.parseInt(req.getParameter("id"));

		Attraction attraction = attractionManager.findById(id);
		req.setAttribute("attraction", attraction);

		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/TurismoEnLaTierraMediaCapitulo2-maven/views/attractions/edit.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		Integer cost = Integer.parseInt(req.getParameter("cost"));
		// Integer cost = req.getParameter("cost").trim() == "" ? null : Integer.parseInt(req.getParameter("cost"));
		Double time = Double.parseDouble(req.getParameter("duration"));
		Integer quota = Integer.parseInt(req.getParameter("capacity"));

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
