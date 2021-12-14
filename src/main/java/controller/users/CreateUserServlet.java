package controller.users;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import manager.UserManager;
import model.User;

@WebServlet("/views/users/create.do")
public class CreateUserServlet extends HttpServlet {

	private static final long serialVersionUID = 310351091277240738L;
	private UserManager userManager;

	@Override
	public void init() throws ServletException {
		super.init();
		this.userManager = new UserManager();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		String password = req.getParameter("password");
		Integer budget = Integer.parseInt(req.getParameter("budget"));
		Double time = Double.parseDouble(req.getParameter("time"));
		Integer preferencesID = Integer.parseInt(req.getParameter("preferencesID"));

		User userTemp = new User(name, password, budget, time, preferencesID);

		userManager.insert(userTemp);

		if (userTemp.isValid()) {
			resp.sendRedirect("/TurismoEnLaTierraMediaCapitulo2-maven/views/users/index.do");
			req.setAttribute("flash", "Se encontraron errores al ingresar los datos del usuario.");
		} else {
			req.setAttribute("flash", "Usuario creado correctamente.");
			RequestDispatcher dispatcher = getServletContext()
					.getRequestDispatcher("/TurismoEnLaTierraMediaCapitulo2-maven/views/users/index.jsp");
			dispatcher.forward(req, resp);
		}

	}

}
