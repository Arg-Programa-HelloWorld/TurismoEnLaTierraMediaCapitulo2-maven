package model;

import java.util.ArrayList;

import dao.DAOFactory;
import dao.MissingDataException;
import dao.UserDAO;


public class LoadUsers {

	private static ArrayList<User> userList = new ArrayList<User>();
	
	public static boolean readUsersFile() {
		
		try {
		
			UserDAO userDAO = DAOFactory.getUserDAO();
						
			for (User user : userDAO.findAll()) { 
					
				setUserList(user);
									
			}
		
			return true;
		
		} catch (Exception e) {
			
			throw new MissingDataException(e);
			
		}
						
	}

	public static ArrayList<User> getUserList() {
		return userList;
	}

	public static void setUserList(User user) {
		userList.add(user);
	}

}