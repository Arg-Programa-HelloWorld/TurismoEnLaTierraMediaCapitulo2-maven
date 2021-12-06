package app;

import dao.DAOFactory;
import dao.UserDAO;
import model.User;
import utils.Crypt;

public class AppCrearPasswords {

	public static void main(String[] args) {
		
		UserDAO userDAO = DAOFactory.getUserDAO();
		
		User user = new User("testuser", Crypt.hash("1234"), 100, 100, 1);
		
		System.out.println(user.toString());		
		
		userDAO.insert(user);			
		
	}
	
}
