package controller.promotions;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import manager.PromotionManager;
import model.Attraction;
import model.Promotion;

@WebServlet("/views/promotions/delete.do")
public class DeletePromotionServlet extends HttpServlet {

	private static final long serialVersionUID = 1537949074766873118L;
	private PromotionManager promotionManager;

	@Override
	public void init() throws ServletException {
		super.init();
		this.promotionManager = new PromotionManager();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer id = Integer.parseInt(req.getParameter("id"));

		// Eliminacion real de la BDD
		// attractionManager.deleteByID(id);
		
		// Eliminacion logica de la BDD
		
		Promotion promotionTemp = promotionManager.findById(id); 
		
		promotionManager.unsubscribe(promotionTemp);

		resp.sendRedirect("/TurismoEnLaTierraMediaCapitulo2-maven/views/promotions/index.do");
	}


}
