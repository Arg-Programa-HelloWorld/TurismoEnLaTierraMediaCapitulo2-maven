package services;

import dao.UserDAO;
import dao.UserDAOImpl;
import model.Attraction;
import model.Promotion;
import model.User;

public class UserService {
	
	private UserDAO userDAO = new UserDAOImpl();
	
	
	public int buyAttraction(User user, Attraction attraction) {
		
		return userDAO.buyAttraction(user, attraction);
		
	}
	
	public int buyPromotion(User user, Promotion promotion) {
		
		return userDAO.buyPromotion(user, promotion);
		
	}
	
	public double hasMoney(User user) {
		
		return userDAO.hasMoney(user);
		
	}
	
	public double hasMoneyByID(int id) {
		
		return userDAO.hasMoneyByID(id);
		
	}
	
	public double hasTime(User user) {
		
		return userDAO.hasTime(user);
		
	}
	
	public double hasTimeByID(int id) {
		
		return userDAO.hasTimeByID(id);
		
	}
	
	public Boolean hasTheAttraction(User user, Attraction attraction) {
		
		return userDAO.hasTheAttraction(user, attraction);
		
	}
	
	public Boolean hasThePromotion(User user, Promotion promotion) {
		
		return userDAO.hasThePromotion(user, promotion);
		
	}

}
