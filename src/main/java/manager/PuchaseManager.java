package manager;

import model.Attraction;
import model.Promotion;
import model.User;
import service.attractionService;
import service.userService;

public class PuchaseManager {
	
	userService userService = new userService();
	attractionService attractionService = new attractionService();
	
	public void buyAttraction(User user, Attraction attraction) {
		
			if (userService.haveMoneyForAttraction(user, attraction) && // si tiene dinero suficiente
			    userService.haveTimeForAttraction(user, attraction) &&  // si tiene tiempo suficinte
			    !userService.hasTheAttraction(user, attraction) && // si no posee la atraccion
			    attractionService.haveQuota(attraction // si la atraccion tiene cupo
			    )) { 
				
				userService.buyAttraction(user, attraction); // agrega compra al itinerario
				attractionService.consumeQuota(attraction); // consume una quota de atraccion
				userService.consumeTimeForAttraction(user, attraction); // consume tiempo de usuario
				userService.payAttraction(user, attraction); // consume plata de usuario
				
			}
		
	}
	
	
	public void buyPromotion(User user, Promotion promotion) {
		if (userService.haveMoneyForPromotion(user, promotion) && // si tiene dinero suficiente
			userService.haveTimeForPromotion(user, promotion) && // si tiene tiempo suficiente
			!userService.hasThePromotion(user, promotion // si no tiene la promocion
			// si la promocion tiene cupo
			)) {
			
			userService.buyPromotion(user, promotion);
		}
	}
}
