package service;

import dao.AttractionDAO;
import dao.DAOFactory;
import dao.PromotionDAO;
import model.Attraction;
import model.Promotion;

public class promotionService {

	AttractionDAO attractionDAO = DAOFactory.getAttractionDAO();
	PromotionDAO promotionDAO = DAOFactory.getPromotionDAO();
	
	public boolean haveQuota(Promotion promotion) {
		
		/*Promotion promotionTemp = promotionDAO.findById(promotion.getId());
		
		for (Attraction attraction : promotionTemp.getAttractionsList()) {
			if (attraction.getQuota() <= 0) {
				return false;
			} else {
				return true;
			}
		}
		*/
	}
	
	public void consumeQuota(Promotion promotion) {
		
		Promotion promotionTemp = promotionDAO.findById(promotion.getId());
		
		for (Attraction attraction : promotionTemp.getAttractionsList()) {
			
			attraction.setQuota(attraction.getQuota() - 1);
			attractionDAO.update(attraction);
		}
	}
}
