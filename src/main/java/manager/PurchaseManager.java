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

//	public boolean buyAttraction(User user, Attraction attraction) {
//
//		boolean state = false;
//		
//		if (userService.hasMoneyToPayForTheAttraction(user, attraction) && // si tiene dinero suficiente
//				userService.hasTimeForTheAttraction(user, attraction) && // si tiene tiempo suficinte
//				!userService.hasTheAttraction(user, attraction) && // si no posee la atraccion dentro de sus atracciones
//				!userService.hasTheAttractionOfThePromotionList(user, attraction) &&
//				attractionService.hasQuota(attraction) // si la atraccion tiene cupo
//		) {
//
//			userService.buyAttraction(user, attraction); // agrega compra al itinerario
//			attractionService.consumeQuota(attraction); // consume una quota de atraccion
//			userService.consumeUserTimeToBuyTheAttraction(user, attraction); // consume tiempo de usuario
//			userService.payTheAttraction(user, attraction); // consume plata de usuario
//			
//			state = true;
//
//		}
//		
//		return state;
//
//	}

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

		if (errors.isEmpty()) {
			userService.buyAttraction(user, attraction);
			attractionService.consumeQuota(attraction);
			userService.consumeUserTimeToBuyTheAttraction(user, attraction);
		}
		return errors;
	}

//	public boolean buyPromotion(User user, Promotion promotion) {
//
//		boolean state = false;
//		
//		if (userService.hasMoneyToPayForThePromotion(user, promotion) && // si tiene dinero suficiente
//				userService.hasTimeForThePromotion(user, promotion) && // si tiene tiempo suficiente
//				!userService.hasThePromotion(user, promotion) && // si no tiene la promocion
//				!userService.hasTheAttractionOfThePromotion(user, promotion) && // si no tiene ningunas de las atracciones
//																				// de la promocion
//				promotionService.haveQuota(promotion) // si la promocion tiene cupo
//		) {
//
//			userService.buyPromotion(user, promotion); // agrega promocion al itinerario
//			promotionService.consumeQuota(promotion); // consume una quota de atraccion
//			userService.consumeUserTimeToBuyThePromotion(user, promotion); // consume tiempo de usuario
//			userService.payPromotion(user, promotion); // consume plata de usuario
//			
//			state = true;
//
//		}
//		
//		return state;
//
//	}

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

		if (errors.isEmpty()) {
			userService.buyPromotion(user, promotion);
			promotionService.consumeQuota(promotion);
			userService.consumeUserTimeToBuyThePromotion(user, promotion);
		}
		return errors;
	}

}
