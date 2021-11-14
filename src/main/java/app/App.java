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
		
		System.out.println("Operaciones realizadas dentro de la clase Promocion");
		System.out.println();
		
		Promotion promotionTemp = promotionDAO.findById(3);
				
		System.out.println("------------------------------");
		System.out.println();
		
		System.out.println(promotionTemp.getName());
		
		System.out.println("Tiempo de la promocion hs:" + promotionTemp.getTime());
		System.out.println("Descuento absoluto de la promocion $:" + promotionTemp.getCost());
		System.out.println("Costo a pagar luego de aplicar el descuento $:" + promotionTemp.getDiscount());
		System.out.println("Ahorro de $" + promotionTemp.getSaving_money());

	}
		
}
