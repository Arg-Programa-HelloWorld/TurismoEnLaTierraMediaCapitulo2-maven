package app;

import manager.AttractionManager;
import manager.UserManager;
import model.Attraction;
import model.User;
import service.UserService;

public class AppTengoLaAtraccionDentroDeAlgunaPromo {
	
	public static void main(String[] args) {

	boolean rta;
	
	UserManager userManager = new UserManager();
	AttractionManager attractionManager = new AttractionManager();
	UserService userService = new UserService();
	
	User userTemp = userManager.findById(1);
	
	Attraction attractionTemp = attractionManager.findById(5);
	
	rta = userService.hasTheAttractionOfThePromotionList(userTemp, attractionTemp);
	
	System.out.println(rta);
	
	}
	
}
