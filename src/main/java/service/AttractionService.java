package service;

import java.util.List;

import dao.AttractionDAO;
import dao.DAOFactory;
import dao.UserDAO;
import model.Attraction;
import model.Promotion;
import model.User;

public class AttractionService {

	
	/*
	
	UserDAO userDAO = DAOFactory.getUserDAO();
	AttractionDAO attractionDAO = DAOFactory.getAttractionDAO();

	public List<Attraction> findAttractionByUser(User user) {

		return attractionDAO.findAttractionByUser(user);

	}

	public List<Attraction> searchAttractionsOfAPromotionByPromotion(Promotion promotion) {

		return attractionDAO.searchAttractionsOfAPromotionByPromotion(promotion);

	}

	public List<Attraction> searchAttractionsOfAPromotionByID(int ID) {

		return attractionDAO.searchAttractionsOfAPromotionByID(ID);

	}

	public double getCost(Attraction attraction) {

		return attractionDAO.getCost(attraction);

	}

	public double getCostById(int id) {

		return attractionDAO.getCostById(id);

	}

	public double getTime(Attraction attraction) {

		return attractionDAO.getTime(attraction);

	}

	public double getTimeById(int id) {

		return attractionDAO.getTimeById(id);

	}

	public boolean hasQuota(Attraction attraction) {

		return attractionDAO.hasQuota(attraction) > 0;
	}

	public void consumeQuota(Attraction attraction) {

		attraction.setQuota(attraction.getQuota() - 1);
		attractionDAO.update(attraction);
	}
	
	*/
	
}
