package app;

import dao.AttractionDAO;
import dao.DAOFactory;
import dao.PromotionDAO;
import dao.UserDAO;
import model.Promotion;
import model.User;
import service.UserService;

public class App2 {

	public static void main(String[] args) {
		
		PromotionDAO promotionDAO = DAOFactory.getPromotionDAO();
		AttractionDAO attractionDAO = DAOFactory.getAttractionDAO(); 
		UserDAO userDAO = DAOFactory.getUserDAO();
		
		User userTemp;
		
		userTemp = userDAO.findById(1);
		
		boolean rta = false;
		
		UserService userService = new UserService();
		
		for (Promotion promotion :promotionDAO.userPromotions(userTemp)) {
			
			rta = userService.hasTheAttractionOfThePromotion(userTemp, promotion);
			
		}
		
		if (rta) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
		
}
