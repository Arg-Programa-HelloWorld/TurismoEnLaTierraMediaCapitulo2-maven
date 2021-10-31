package app;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import dao.AttractionDAO;
import dao.DAOFactory;
import dao.PromotionDAO;
import dao.UserDAO;
import model.Attraction;
import model.Promotion;


public class App {

	public static void main(String[] args) throws SQLException {
		
		/*
		UserDAO userDAO = DAOFactory.getUserDAO();
		User userTestUpdate = null;
		
		//buscar un User
		System.out.println(userDAO.findById(10));
		userTestUpdate = userDAO.findById(10);
		*/
		
		//--------------------------------------------------------------
		
		
		/*
		AttractionDAO attractionDAO = DAOFactory.getAttractionDAO();
		
		System.out.println("Ver todas las Atracciones");
		System.out.println(attractionDAO.findAll());
		
		//cuenta cantidad de atraciones
		System.out.println(attractionDAO.countAll());
		*/
		
		
		//List<Attraction> attractions = new LinkedList<Attraction>();
		
		PromotionDAO promotionDAO = DAOFactory.getPromotionDAO(); 
		//AttractionDAO attractionDAO = DAOFactory.getAttractionDAO();
		//UserDAO userDAO = DAOFactory.getUserDAO();
		
		Promotion promotionTemp =  promotionDAO.findById(2);
		
		System.out.println("Antes de modificarla: " + promotionTemp);
		
		//attractions = attractionDAO.searchAttractionsOfAPromotionByPromotion(promotionTemp);
		//attractions = attractionDAO.searchAttractionsOfAPromotionByID(1);
		
		/*
		System.out.println("Ver todos las Attracciones de la Promocion 1");
				
		for (Attraction attractionTemp : attractions) { 
			
			System.out.println(attractionTemp);
		
		}
		*/
		//promotionDAO.update(promotionTemp);
		
		//System.out.println("Luego de modificarla: " +promotionTemp);
		
		//PromotionDAO promotionDAO = DAOFactory.getPromotionDAO();
		
		//System.out.println("Ver todas las Promociones");
		/*
		for (Promotion promotionTemp : promotionDAO.findAll()) { 
			
			System.out.println(promotionTemp);
		
		}*/
		
		//System.out.println(promotionDAO.findAll());  // de esta forma las vemos todas en una sola linea
			
	}
		
}
