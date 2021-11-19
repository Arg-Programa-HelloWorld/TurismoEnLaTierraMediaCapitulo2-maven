package service;

import dao.AttractionDAO;
import dao.DAOFactory;
import dao.UserDAO;
import model.Attraction;

public class attractionService {
	
	UserDAO userDAO = DAOFactory.getUserDAO();
	AttractionDAO attractionDAO = DAOFactory.getAttractionDAO();
	
	public boolean haveQuota(Attraction attraction) {
		
		return attractionDAO.quota(attraction) > 0;
	}
	
	public void consumeQuota(Attraction attraction) {
		
		attraction.setQuota(attraction.getQuota() - 1);
		attractionDAO.update(attraction);
	}
}
