package controller.users;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import manager.UserManager;

@WebServlet("/views/users/add.do")
public class SuscribeUserServlet extends HttpServlet implements Servlet {

	private static final long serialVersionUID = 47562755040579718L;
	private UserManager userManager;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init();
		this.userManager = new UserManager();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer id = Integer.parseInt(req.getParameter("id"));
		
		userManager.subscribeAnUserById(id);
		
		resp.sendRedirect("/TurismoEnLaTierraMediaCapitulo2-maven/views/users/index.do");
	}
}
