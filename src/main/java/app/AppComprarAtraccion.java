package app;

import manager.AttractionManager;
import manager.PurchaseManager;
import manager.UserManager;
import model.Attraction;
import model.User;

public class AppComprarAtraccion {
	
	public static void main(String[] args) {

	boolean rta;
		
	UserManager userManager = new UserManager();
	AttractionManager attractionManager = new AttractionManager();
	PurchaseManager purchaseManager = new PurchaseManager(); 
	
	User userTemp = userManager.findById(1);
	
	Attraction attractionTemp = attractionManager.findById(2);
	
	
	
	//rta = purchaseManager.buyAttraction(userTemp, attractionTemp);
	
	//System.out.println(rta);
	
	}
	
}
