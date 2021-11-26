package manager;

import java.util.List;

import dao.AttractionDAO;
import dao.DAOFactory;
import dao.PromotionDAO;
import model.Promotion;

public class PromotionManager {
	
	AttractionDAO attractionDAO = DAOFactory.getAttractionDAO();
	PromotionDAO promotionDAO = DAOFactory.getPromotionDAO();
	
	public int insert(Promotion promotion) {

		return promotionDAO.insert(promotion);
		
	}

	public int update(Promotion promotion) {

		return promotionDAO.update(promotion);

	}

	public int delete(Promotion promotion) {

		return promotionDAO.delete(promotion);

	}

	public Promotion findById(int promotionID) {

		return promotionDAO.findById(promotionID);

	}

	public List<Promotion> findAll() {

		return promotionDAO.findAll();

	}

	public int countAll() {

		return promotionDAO.countAll();
		
	}

	public Promotion getLastUser() {

		return promotionDAO.getLastPromotion();
		
	}
	
	public void unsubscribeAnUser(Promotion promotion) {
		
		promotionDAO.unsubscribe(promotion);
		
	}
	
	public void subscribeAnUser(Promotion promotion) {
		
		promotionDAO.subscribe(promotion);
		
	}

}
