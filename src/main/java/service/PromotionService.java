package service;

import dao.AttractionDAO;
import dao.DAOFactory;
import dao.PromotionDAO;
import dao.UserDAO;
import model.Attraction;
import model.Promotion;

public class PromotionService {

	UserDAO userDAO = DAOFactory.getUserDAO();
	AttractionDAO attractionDAO = DAOFactory.getAttractionDAO();
	PromotionDAO promotionDAO = DAOFactory.getPromotionDAO();

	public boolean haveQuota(Promotion promotion) {

		Promotion promotionTemp = promotionDAO.findById(promotion.getId());

		int falseCount = 0;
		boolean result;

		// no se me ocurrio otra forma de hacer esto
		for (Attraction attraction : promotionTemp.getAttractionsList()) {

			if (attraction.getQuota() <= 0) {

				falseCount++;

			}
		}

		if (falseCount > 0) {

			result = false;

		} else {

			result = true;

		}

		return result;
	}

	public void consumeQuota(Promotion promotion) {

		Promotion promotionTemp = promotionDAO.findById(promotion.getId());

		for (Attraction attraction : promotionTemp.getAttractionsList()) {

			attraction.setQuota(attraction.getQuota() - 1);
			attractionDAO.update(attraction);
		}
	}

}
