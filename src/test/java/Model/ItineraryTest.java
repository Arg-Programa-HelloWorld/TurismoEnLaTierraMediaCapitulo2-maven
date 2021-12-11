package Model;

import static org.junit.Assert.*;

import org.junit.Test;

import dao.AttractionDAO;
import dao.DAOFactory;
import dao.ItineraryDAO;
import dao.PromotionDAO;
import dao.UserDAO;
import model.Attraction;
import model.Itinerary;
import model.Promotion;
import model.User;
import service.UserService;

public class ItineraryTest {

//	@Test
//	public void itineraryTest() {
//		
//		ItineraryDAO itineraryDAO = DAOFactory.getItineraryDAO();
//		UserDAO userDAO = DAOFactory.getUserDAO();
//		PromotionDAO promotionDAO = DAOFactory.getPromotionDAO();
//		AttractionDAO attractionDAO = DAOFactory.getAttractionDAO();
//		Itinerary itinerary = new Itinerary();
//		User user = userDAO.findById(1);
//		Promotion promotion = promotionDAO.findById(1);
//		Attraction attraction = attractionDAO.findById(1);
//		UserService userService = new UserService();
//		
//		userService.buyPromotion(user, promotion);
//		System.out.println("Compra promocion:");
//		System.out.println(promotion.toString());
//		
//		userService.buyAttraction(user, attraction);
//		System.out.println("compra atracion:");
//		System.out.println(attraction.toString());
//		
//		itinerary.setListOfPromotions(itineraryDAO.findAllPromotions(user));
//		itinerary.setListOfAttractions(itineraryDAO.findAllAttractions(user));
//	}

}
