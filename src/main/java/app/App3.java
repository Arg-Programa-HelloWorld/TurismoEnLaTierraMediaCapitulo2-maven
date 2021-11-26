package app;

import dao.AttractionDAO;
import dao.DAOFactory;
import dao.PromotionDAO;
import dao.UserDAO;
import manager.AttractionManager;
import manager.UserManager;
import model.Attraction;
import model.User;
import service.UserService;

public class App3 {
	
	public static void main(String[] args) {

	boolean rta;
	
	PromotionDAO promotionDAO = DAOFactory.getPromotionDAO();
	AttractionDAO attractionDAO = DAOFactory.getAttractionDAO(); 
	UserDAO userDAO = DAOFactory.getUserDAO();
	UserManager userManager = new UserManager();
	AttractionManager attractionManager = new AttractionManager();
	UserService userService = new UserService();
	
	User userTemp = userManager.findById(1);
	
	Attraction attractionTemp = attractionManager.findById(8);
	
	rta = userService.hasTheAttractionOfThePromotionList(userTemp, attractionTemp);
	
	System.out.println(rta);
	
	}
	
}
