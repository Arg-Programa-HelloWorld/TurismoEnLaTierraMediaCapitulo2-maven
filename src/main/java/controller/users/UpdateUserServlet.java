package controller.users;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import manager.AttractionManager;
import manager.UserManager;
import model.Attraction;
import model.User;

@WebServlet("/views/users/edit.do")
public class UpdateUserServlet extends HttpServlet{
	
	private static final long serialVersionUID = 7598291131560345626L;
	private UserManager userManager;

	@Override
	public void init() throws ServletException {
		super.init();
		this.userManager = new UserManager();
				
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// GET envía los datos usando la URL
		
		Integer id = Integer.parseInt(req.getParameter("id"));

		User userTemp = userManager.findById(id);
		req.setAttribute("userTemp", userTemp);

		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/views/users/edit.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// POST los envía de forma que no podemos verlos (en un segundo plano u "ocultos" al usuario).
		
		Integer id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		Double budget = Double.parseDouble(req.getParameter("budget"));
		Double time = Double.parseDouble(req.getParameter("time"));
		Integer preferenceID = Integer.parseInt(req.getParameter("preferencesID"));

		User userTemp = userManager.findById(id);
		userTemp.setId(id);
		userTemp.setName(name);
		userTemp.setPassword(password);
		userTemp.setBudget(budget);
		userTemp.setTime(time);
		userTemp.setPreferencesID(preferenceID);
		
		userManager.update(userTemp);

		if (userTemp.isValid()) {
			resp.sendRedirect("/TurismoEnLaTierraMediaCapitulo2-maven/views/users/index.do");
		} else {
			req.setAttribute("userTemp", userTemp);
			
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/TurismoEnLaTierraMediaCapitulo2-maven/views/users/edit.jsp");
			dispatcher.forward(req, resp);
		}
	}

}
