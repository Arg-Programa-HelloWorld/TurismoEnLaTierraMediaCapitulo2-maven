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

	// ---------- ATTRACTION ----------

	public void buyAttraction(User user, Attraction attraction) {

		userDAO.buyAttraction(user, attraction);
		this.payTheAttraction(user, attraction);

	}

	public boolean hasTheAttraction(User user, Attraction attraction) {

		return userDAO.hasTheAttraction(user, attraction);

	}

	public boolean hasTheAttractionOfThePromotion(User user, Promotion promotion) {

		boolean result = false;

		for (Attraction attraction : promotion.getAttractionsList()) {

			result = this.hasTheAttraction(user, attraction);

			if (result == true) {

				break;
			}

		}

		return result;

	}

	public boolean hasTheAttractionOfThePromotionList(User user, Attraction attraction) {

		boolean result = false;

		for (Promotion promotion : promotionDAO.userPromotions(user)) {

			//result = hasTheAttractionOfThePromotion(user, promotion);
			
			for (Attraction attractionTemp : promotion.getAttractionsList()) {
				
				if (attraction.getId() == attractionTemp.getId()) {

					result = true;
					
					break;
				}
				
			}

		}

		return result;

	}
	
	public boolean consistencyOfPurchaseAttractionsPromotions(User user) {
		
		boolean result = false;

		for (Promotion promotion : promotionDAO.userPromotions(user)) {

			result = hasTheAttractionOfThePromotion(user, promotion);

			if (result == true) {

				break;
			}

		}

		return result;
		
	}

	public boolean hasMoneyToPayForTheAttraction(User user, Attraction attraction) {

		return userDAO.hasMoney(user) > attractionDAO.getCost(attraction);

	}

	public boolean hasMoneyToPayForTheAttractionByID(int idUser, int idAttraction) {

		return userDAO.hasMoneyByID(idUser) > attractionDAO.getCostById(idAttraction);

	}

	public boolean hasTimeForTheAttraction(User user, Attraction attraction) {

		return userDAO.hasTime(user) > attractionDAO.getTime(attraction);

	}

	public boolean hasTimeForTheAttractionByID(int idUser, int idAttraction) {

		return userDAO.hasTimeByID(idUser) > attractionDAO.getTimeById(idAttraction);

	}

	public void payTheAttraction(User user, Attraction attraction) {

		user.setBudget(user.getBudget() - attraction.getCost());
		userDAO.update(user);

	}

	public void consumeUserTimeToBuyTheAttraction(User user, Attraction attraction) {

		user.setTime(user.getTime() - attraction.getTime());
		userDAO.update(user);

	}

	// ---------- PROMOTION ----------

	public void buyPromotion(User user, Promotion promotion) {

		userDAO.buyPromotion(user, promotion);
		this.payPromotion(user, promotion);

	}

	public boolean hasThePromotion(User user, Promotion promotion) {

		return userDAO.hasThePromotion(user, promotion);
	}

	public boolean hasMoneyToPayForThePromotion(User user, Promotion promotion) {

		return userDAO.hasMoney(user) > promotionDAO.cost(promotion);

	}

	public boolean hasTimeForThePromotion(User user, Promotion promotion) {

		return userDAO.hasTime(user) > promotionDAO.time(promotion);

	}

	public void consumeUserTimeToBuyThePromotion(User user, Promotion promotion) {

		user.setTime(user.getTime() - promotion.getTime());
		userDAO.update(user);

	}

	public void payPromotion(User user, Promotion promotion) {

		user.setBudget(user.getBudget() - promotion.getCost());
		userDAO.update(user);

	}
		
}
