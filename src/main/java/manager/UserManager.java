package manager;

import java.util.List;

import dao.UserDAO;
import dao.UserDAOImpl;
import model.Attraction;
import model.Promotion;
import model.User;


public class UserManager {

	private UserDAO userDAO = new UserDAOImpl();
	
	
	
	public void insertUse(String name, String password, double budget, double time, int preferencesID) {
		
		User user = new User(name, password, budget, time, preferencesID);
		
		userDAO.insert(user);
		
	}
	
	public int updateUser(User user) {
		
		return userDAO.update(user);
		
	}
	
	public int deleteUser(User user) {
		
		return userDAO.delete(user);
		
	}
	
	public User findByIdUser(int id) {
		
		return userDAO.findById(id);
		
	}	
	
	public List<User> findAllUsers() {
		
		
		return userDAO.findAll();		
		
	}
	
	
	public int countAllUsers() {
		
		return userDAO.countAll();
		
	}
	
	public User getLastUser() {
		
		return userDAO.getLastUser();
		
	}	
	
}
