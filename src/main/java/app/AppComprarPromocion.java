package app;

import manager.PromotionManager;
import manager.PurchaseManager;
import manager.UserManager;
import model.Promotion;
import model.User;
import service.UserService;

public class AppComprarPromocion {
	
	public static void main(String[] args) {

	boolean rta;
		
	UserManager userManager = new UserManager();
	PromotionManager promotionManager = new PromotionManager();
	
	UserService userService = new UserService();
	PurchaseManager purchaseManager = new PurchaseManager(); 
	
	User userTemp = userManager.findById(1);
	
	Promotion promotionTemp = promotionManager.findById(3);
	
	
	
	rta = purchaseManager.buyPromotion(userTemp, promotionTemp);
	
	System.out.println(rta);
	
	}
	
}
