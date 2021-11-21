package service;

import static org.junit.Assert.*;

import org.junit.Test;

import dao.AttractionDAO;
import dao.DAOFactory;
import dao.UserDAO;
import manager.PuchaseManager;
import model.Attraction;
import model.Promotion;
import model.User;

public class ManagerTest {

	@Test
	public void buyAttractionTest() {		
				
		PuchaseManager puchase = new PuchaseManager();
				
		User userTest = puchase.userService.userDAO.findById(15);
		Attraction attractionTest = puchase.attractionService.attractionDAO.findById(4);
		
		puchase.buyAttraction(userTest, attractionTest);
		
		assertTrue(puchase.userService.hasTheAttraction(userTest, attractionTest));		
		
	}
	
	@Test
	public void buyPromotionTest() {		
				
		PuchaseManager puchase = new PuchaseManager();
				
		User userTest = puchase.userService.userDAO.findById(15);
		Promotion promotionTest = puchase.promotionService.promotionDAO.findById(3);
		
		puchase.buyPromotion(userTest, promotionTest);
		
		assertTrue(puchase.userService.hasThePromotion(userTest, promotionTest));
		
	}

}
