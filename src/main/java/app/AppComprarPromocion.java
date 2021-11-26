package app;

import manager.PromotionManager;
import manager.PurchaseManager;
import manager.UserManager;
import model.Promotion;
import model.User;

public class AppComprarPromocion {
	
	public static void main(String[] args) {

	boolean rta;
		
	UserManager userManager = new UserManager();
	PromotionManager promotionManager = new PromotionManager();
	
	PurchaseManager purchaseManager = new PurchaseManager(); 
	
	User userTemp = userManager.findById(1);
	
	Promotion promotionTemp = promotionManager.findById(3);
	
	
	
	rta = purchaseManager.buyPromotion(userTemp, promotionTemp);
	
	System.out.println(rta);
	
	}
	
}
