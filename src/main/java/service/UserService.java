package service;

import dao.AttractionDAO;
import dao.DAOFactory;
import dao.PromotionDAO;
import dao.UserDAO;
import model.Attraction;
import model.Promotion;
import model.User;

public class UserService {
	
	UserDAO userDAO = DAOFactory.getUserDAO();
	AttractionDAO attractionDAO = DAOFactory.getAttractionDAO();
	PromotionDAO promotionDAO = DAOFactory.getPromotionDAO();

	public void buyAttraction(User user, Attraction attraction) {

		userDAO.buyAttraction(user, attraction);

	}

	public void buyPromotion(User user, Promotion promotion) {

		userDAO.buyPromotion(user, promotion);

	}

	public boolean haveMoneyForAttraction(User user, Attraction attraction) {

		return userDAO.hasMoney(user) > attractionDAO.cost(attraction);

	}

	public boolean haveMoneyByID(int idUser, int idAttraction) {

		return userDAO.hasMoneyByID(idUser) > attractionDAO.costById(idAttraction);

	}

	public boolean haveTimeForAttraction(User user, Attraction attraction) {

		return userDAO.hasTime(user) > attractionDAO.time(attraction);
		
	}

	public boolean haveTimeByID(int idUser, int idAttraction) {

		return userDAO.hasTimeByID(idUser) > attractionDAO.timeById(idAttraction);

	}

	public boolean hasTheAttraction(User user, Attraction attraction) {

		return userDAO.hasTheAttraction(user, attraction);

	}

	public boolean hasThePromotion(User user, Promotion promotion) {

		return userDAO.hasThePromotion(user, promotion);
	}
	
	public void payAttraction(User user, Attraction attraction) {
				
		user.setBudget(user.getBudget() - attraction.getCost());
		userDAO.update(user);
		
	}
	
	public void consumeTimeForAttraction(User user, Attraction attraction) {
				
		user.setTime(user.getTime() - attraction.getTime());
		userDAO.update(user);
		
	}
	
	public boolean haveMoneyForPromotion(User user, Promotion promotion) {

		return userDAO.hasMoney(user) > promotionDAO.cost(promotion);

	}
	
	public boolean haveTimeForPromotion(User user, Promotion promotion) {

		return userDAO.hasTime(user) > promotionDAO.time(promotion);
		
	}
	
	public void consumeTimeForPromotion(User user, Promotion promotion) {
		
		user.setTime(user.getTime() - promotion.getTime());
		userDAO.update(user);
		
	}
	
	public void payPromotion(User user, Promotion promotion) {
		
		user.setBudget(user.getBudget() - promotion.getCost());
		userDAO.update(user);
		
	}
	
}
