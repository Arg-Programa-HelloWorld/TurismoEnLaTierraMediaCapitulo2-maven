package controller.users;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import manager.AttractionManager;
import manager.UserManager;
import model.Attraction;
import model.User;

@WebServlet("/views/users/index.do")
public class ListUsersServlet extends HttpServlet implements Servlet{
	
	private static final long serialVersionUID = 5972424794142013054L;
	private UserManager userManager;

	@Override
	public void init() throws ServletException {
		super.init();
		this.userManager = new UserManager();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<User> users = userManager.findAll();
		req.setAttribute("users", users);
		
		System.out.println(users);
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/views/users/index.jsp");
		dispatcher.forward(req, resp);

	}
}
