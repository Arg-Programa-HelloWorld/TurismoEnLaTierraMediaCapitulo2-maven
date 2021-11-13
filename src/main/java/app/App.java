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
import model.PromotionPercentage;


public class App {

	public static void main(String[] args) throws SQLException {
		
		PromotionDAO promotionDAO = DAOFactory.getPromotionDAO();
		
		System.out.println("Encontrar la Promocion con el 'ID: Nº1'");
	
		Promotion promotionTemp = promotionDAO.findById(1);
				
		System.out.println(promotionDAO.findById(1));
		
		
		Promotion promotionTemp1 = promotionDAO.findById(2);
		
		System.out.println(promotionDAO.findById(2));
		
		
		Promotion promotionTemp2 = promotionDAO.findById(3);
		
		System.out.println(promotionDAO.findById(3));
		
		
	}
		
}
