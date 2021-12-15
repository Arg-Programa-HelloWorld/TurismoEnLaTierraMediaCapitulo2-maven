package manager;

import java.util.HashMap;
import java.util.Map;

import dao.AttractionDAO;
import dao.DAOFactory;
import dao.PromotionDAO;
import dao.UserDAO;
import model.Attraction;
import model.Promotion;
import model.User;
import service.AttractionService;
import service.PromotionService;
import service.UserService;

public class PurchaseManager {

	public UserService userService = new UserService();
	public AttractionService attractionService = new AttractionService();
	public PromotionService promotionService = new PromotionService();
	public UserDAO userDAO = DAOFactory.getUserDAO();
	public AttractionDAO attractionDAO = DAOFactory.getAttractionDAO();
	public PromotionDAO promotionDAO = DAOFactory.getPromotionDAO();

	public Map<String, String> buyAttraction(Integer userId, Integer attractionId) {

		Map<String, String> errors = new HashMap<String, String>();
		User user = userDAO.findById(userId);
		Attraction attraction = attractionDAO.findById(attractionId);

		if (!attractionService.hasQuota(attraction)) {
			errors.put("attraction", "No hay cupo disponible");
		}
		if (!userService.hasMoneyToPayForTheAttraction(user, attraction)) {
			errors.put("user", "No tienes monedas suficientes");
		}
		if (!userService.hasTimeForTheAttraction(user, attraction)) {
			errors.put("user", "No tienes tiempo suficiente");
		}
		if (userService.hasTheAttraction(user, attraction)) {
			errors.put("user", "Ya posee esa atracción");
		}

		if (errors.isEmpty()) {
			userService.buyAttraction(user, attraction);
			attractionService.consumeQuota(attraction);
			userService.consumeUserTimeToBuyTheAttraction(user, attraction);
		}
		return errors;
	}

	public Map<String, String> buyPromotion(Integer userId, Integer promotionId) {

		Map<String, String> errors = new HashMap<String, String>();
		User user = userDAO.findById(userId);
		Promotion promotion = promotionDAO.findById(promotionId);

		if (!promotionService.haveQuota(promotion)) {
			errors.put("promotion", "No hay cupo disponible");
		}
		if (!userService.hasMoneyToPayForThePromotion(user, promotion)) {
			errors.put("user", "No tienes monedas suficientes");
		}
		if (!userService.hasTimeForThePromotion(user, promotion)) {
			errors.put("user", "No tienes tiempo suficiente");
		}
		if (userService.hasTheAttractionOfThePromotion(user, promotion)) {
			errors.put("user", "Ya posee una de las atracciónes de esa promoción");
		}
		if (userService.hasThePromotion(user, promotion)) {
			errors.put("user", "Ya posee esa promoción");
		}
		if (errors.isEmpty()) {
			userService.buyPromotion(user, promotion);
			promotionService.consumeQuota(promotion);
			userService.consumeUserTimeToBuyThePromotion(user, promotion);
		}
		return errors;
	}

}
