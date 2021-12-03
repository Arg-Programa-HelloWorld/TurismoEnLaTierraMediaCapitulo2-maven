package service;

import dao.DAOFactory;
import dao.UserDAO;
import model.User;

public class LoginService {

	public User login(String username, String password) {
		UserDAO userDao = DAOFactory.getUserDAO();
    	User user = userDao.findByUsername(username);
    	
    	if (user == null || !user.checkPassword(password)) {
    		user = null;
    	}
    	return user;
	}
}
