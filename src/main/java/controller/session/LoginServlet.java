package controller.session;

import java.io.IOException;

import dao.DAOFactory;
import dao.UserDAO;
import jakarta.servlet.RequestDispatcher;
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
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		User user = loginService.login(username, password);
						
		if (user != null) {
			//req.getSession().setAttribute("user", user);
			//resp.sendRedirect("/index.jsp");
			System.out.println(user);
		} else {
			System.out.println(user);
			//RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("inc/login.jsp");
			//dispatcher.forward(req, resp);
		}
	
	}
	
	
}
