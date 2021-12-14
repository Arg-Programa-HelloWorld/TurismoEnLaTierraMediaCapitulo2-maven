package controller.attractions;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import manager.AttractionManager;
import model.Attraction;

@WebServlet("/views/attractions/delete.do")
public class DeleteAttractionServlet extends HttpServlet {

	private static final long serialVersionUID = 1537949074766873118L;
	private AttractionManager attractionManager;

	@Override
	public void init() throws ServletException {
		super.init();
		this.attractionManager = new AttractionManager();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer id = Integer.parseInt(req.getParameter("id"));

		// Eliminacion real de la BDD
		// attractionManager.deleteByID(id);
		
		// Eliminacion logica de la BDD
		
		Attraction attractionTemp = attractionManager.findById(id); 
		
		attractionManager.unsubscribe(attractionTemp);

		resp.sendRedirect("/TurismoEnLaTierraMediaCapitulo2-maven/views/attractions/index.do");
	}


}
