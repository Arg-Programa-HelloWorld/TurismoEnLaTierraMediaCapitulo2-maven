package controller.session;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.User;
import service.LoginService;

@WebServlet("/inc/login")
public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private LoginService loginService;
	
	@Override
	public void init() throws ServletException {
		super.init();
		loginService = new LoginService();
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		User user = loginService.login(username, password);
		
		if (user != null) {
			req.getSession().setAttribute("user", user);
			resp.sendRedirect("index.jsp");
		} else {
			
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("inc/login.jsp");
			dispatcher.forward(req, resp);
		}
	
	}
	
	
}
