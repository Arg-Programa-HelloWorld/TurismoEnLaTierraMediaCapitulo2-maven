package controller.session;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.User;
import service.LoginService;



@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = -7079897534403410325L;

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
		
		System.out.println(username);
		
		User user = loginService.login(username);
		
		System.out.println(user);
		
		/*
		if (user != null) {
			req.getSession().setAttribute("user", user);
			resp.sendRedirect("/TurismoEnLaTierraMediaCapitulo2-maven/views/index.jsp");
			//System.out.println(user);
		} else {
			System.out.println(user);
			//RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("inc/login.jsp");
			//dispatcher.forward(req, resp);
		}
		*/
	
	}
	
	
}
