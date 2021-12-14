package service;

import dao.DAOFactory;
import dao.UserDAO;
import model.User;

public class LoginService {

	
	
	public User login(String username, String password) {
	
		UserDAO userDAO = DAOFactory.getUserDAO();
		
		User user = userDAO.findByUsername(username);
		
		//System.out.println(user);
    	
    	if (user == null || !user.checkPassword(password)) {
    		user = null;
    	}
    	    	
		System.out.println(user);
		
    	return user;
	}
	
	public User login(String username) {
	
		UserDAO userDAO = DAOFactory.getUserDAO();
		
		//String name = username.trim().toUpperCase(); 
		String name = username;
		
		System.out.println(name);
		
		User userTemp = userDAO.findByUsername(name);
		
		//System.out.println(user);
    	/*
    	if (user == null || !user.checkPassword(password)) {
    		user = null;
    	}
    	*/
    
		System.out.println(userTemp);
		
    	return userTemp;
	}
}
