package controller.users;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import manager.UserManager;

@WebServlet("/views/users/delete.do")
public class UnsubscribeUserServlet extends HttpServlet implements Servlet{

	private static final long serialVersionUID = 7052712287231535318L;
	private UserManager userManager;
	
	@Override
	public void init() throws ServletException {
		super.init();
		this.userManager = new UserManager();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer id = Integer.parseInt(req.getParameter("id"));
		
		userManager.unsubscribeAnUserById(id);
		
		resp.sendRedirect("/TurismoEnLaTierraMediaCapitulo2-maven/views/users/index.do");
	}

}
