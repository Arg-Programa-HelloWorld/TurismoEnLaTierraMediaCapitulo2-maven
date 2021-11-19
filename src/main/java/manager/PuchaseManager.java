package manager;

import model.Attraction;
import model.Promotion;
import model.User;
import service.AttractionService;
import service.PromotionService;
import service.UserService;

public class PuchaseManager {
	
	UserService userService = new UserService();
	AttractionService attractionService = new AttractionService();
	PromotionService promotionService = new PromotionService();
	
	
	public void buyAttraction(User user, Attraction attraction) {
		
			if (userService.haveMoneyForAttraction(user, attraction) && // si tiene dinero suficiente
			    userService.haveTimeForAttraction(user, attraction) &&  // si tiene tiempo suficinte
			    !userService.hasTheAttraction(user, attraction) && // si no posee la atraccion
			    attractionService.haveQuota(attraction) // si la atraccion tiene cupo
			    ) { 
				
				userService.buyAttraction(user, attraction); // agrega compra al itinerario
				attractionService.consumeQuota(attraction); // consume una quota de atraccion
				userService.consumeTimeForAttraction(user, attraction); // consume tiempo de usuario
				userService.payAttraction(user, attraction); // consume plata de usuario
				
			}
		
	}	
	
	public void buyPromotion(User user, Promotion promotion) {
		
		if (userService.haveMoneyForPromotion(user, promotion) && // si tiene dinero suficiente
			userService.haveTimeForPromotion(user, promotion) && // si tiene tiempo suficiente
			!userService.hasThePromotion(user, promotion) && // si no tiene la promocion
			promotionService.haveQuota(promotion) // si la promocion tiene cupo
			) {
			
			userService.buyPromotion(user, promotion); // agrega compra al itinerario
			promotionService.consumeQuota(promotion); // consume una quota de atraccion
			userService.consumeTimeForPromotion(user, promotion); // consume tiempo de usuario
			userService.payPromotion(user, promotion); // consume plata de usuario
			
		}
		
	}
	
}
