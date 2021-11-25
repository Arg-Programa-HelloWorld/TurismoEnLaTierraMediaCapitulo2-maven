package manager;

import model.Attraction;
import model.Promotion;
import model.User;
import service.AttractionService;
import service.PromotionService;
import service.UserService;

public class PuchaseManager {
	
	public UserService userService = new UserService();
	public AttractionService attractionService = new AttractionService();
	public PromotionService promotionService = new PromotionService();
	
	
	public void buyAttraction(User user, Attraction attraction) {
		
		if (userService.hasMoneyToPayForTheAttraction(user, attraction) && // si tiene dinero suficiente
		    userService.hasTimeForTheAttraction(user, attraction) &&  // si tiene tiempo suficinte
		    !userService.hasTheAttraction(user, attraction) && // si no posee la atraccion dentro de sus atracciones
		    attractionService.haveQuota(attraction) // si la atraccion tiene cupo
		    ) { 
				
					userService.buyAttraction(user, attraction); // agrega compra al itinerario
					attractionService.consumeQuota(attraction); // consume una quota de atraccion
					userService.consumeUserTimeToBuyTheAttraction(user, attraction); // consume tiempo de usuario
					userService.payTheAttraction(user, attraction); // consume plata de usuario
				
			}
		
		}	
	
	public void buyPromotion(User user, Promotion promotion) {
		
		if (userService.hasMoneyToPayForThePromotion(user, promotion) && // si tiene dinero suficiente
			userService.hasTimeForThePromotion(user, promotion) && // si tiene tiempo suficiente
			!userService.hasThePromotion(user, promotion) && // si no tiene la promocion
			!userService.hasTheAttractionOfPromotion(user, promotion) && // si no tiene ningunas de las atracciones de la promocion
			promotionService.haveQuota(promotion) // si la promocion tiene cupo
			) {
			
			userService.buyPromotion(user, promotion); // agrega promocion al itinerario
			for (Attraction attraction : promotion.getAttractionsList()) {
				userService.buyAttraction(user, attraction); // agrega cada atraccion de la promocion al itinerario
			}
			promotionService.consumeQuota(promotion); // consume una quota de atraccion
			userService.consumeUserTimeToBuyThePromotion(user, promotion); // consume tiempo de usuario
			userService.payPromotion(user, promotion); // consume plata de usuario
			
		}
		
	}
	
}
