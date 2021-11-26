package service;

import static org.junit.Assert.*;

import org.junit.Test;

import dao.AttractionDAO;
import dao.DAOFactory;
import dao.UserDAO;
import manager.PurchaseManager;
import model.Attraction;
import model.Promotion;
import model.User;

public class ManagerTest {

	@Test
	public void buyAttractionTest() {		
				
		PurchaseManager puchase = new PurchaseManager();
				
		User userTest = puchase.userService.userDAO.findById(15);
		Attraction attractionTest = puchase.attractionService.attractionDAO.findById(2);
		
		puchase.buyAttraction(userTest, attractionTest);
		
		assertTrue(puchase.userService.hasTheAttraction(userTest, attractionTest));		
		
	}
	
	@Test
	public void buyPromotionTest() {		
				
		PurchaseManager puchase = new PurchaseManager();
				
		User userTest = puchase.userService.userDAO.findById(15);
		Promotion promotionTest = puchase.promotionService.promotionDAO.findById(3);
		
		puchase.buyPromotion(userTest, promotionTest);
		
		assertTrue(puchase.userService.hasThePromotion(userTest, promotionTest));
		
		for (Attraction attraction : promotionTest.getAttractionsList()) {
			assertTrue(puchase.userService.hasTheAttraction(userTest, attraction));
		}
		
	}
	
	@Test
	public void buyPromotionWithPuchasedAttractionTest() {		
				
		PurchaseManager puchase = new PurchaseManager();
				
		User userTest = puchase.userService.userDAO.findById(15);
		Attraction attractionTest = puchase.attractionService.attractionDAO.findById(7);
		Promotion promotionTest = puchase.promotionService.promotionDAO.findById(3);
		
		puchase.buyAttraction(userTest, attractionTest);
		
		puchase.buyPromotion(userTest, promotionTest);
		
		assertTrue(puchase.userService.hasTheAttraction(userTest, attractionTest));
		assertFalse(puchase.userService.hasThePromotion(userTest, promotionTest));
		
	}

}
