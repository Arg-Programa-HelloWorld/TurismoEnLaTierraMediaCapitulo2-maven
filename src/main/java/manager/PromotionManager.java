package manager;

import java.util.List;

import dao.DAOFactory;
import dao.PromotionDAO;
import model.Promotion;

public class PromotionManager {

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

	public Promotion getLastPromotion() {

		return promotionDAO.getLastPromotion();

	}

	public int unsubscribe(Promotion promotion) {

		return promotionDAO.unsubscribe(promotion);

	}

	public int subscribe(Promotion promotion) { // I

		return promotionDAO.subscribe(promotion);

	}

}
