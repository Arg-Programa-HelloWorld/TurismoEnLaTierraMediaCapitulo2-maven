package app;

import dao.DAOFactory;
import dao.PromotionDAO;
import dao.UserDAO;
import model.Promotion;

public class App {

	public static void main(String[] args) {
		
		PromotionDAO promotionDAO = DAOFactory.getPromotionDAO();
		
		System.out.println("Operaciones realizadas dentro de la clase Promocion");
		System.out.println();
		
		Promotion promotionTemp = promotionDAO.findById(1);
				
		System.out.println("------------------------------");
		System.out.println();
		
		System.out.println(promotionTemp.getName());
		
		System.out.println("Tiempo de la promocion hs:" + promotionTemp.getTime());
		System.out.println("Descuento absoluto de la promocion $:" + promotionTemp.getCost());
		System.out.println("Costo a pagar luego de aplicar el descuento $:" + promotionTemp.getDiscount());
		System.out.println("Ahorro de $" + promotionTemp.getSaving_money());
		
		System.out.println("------------------------------");
		System.out.println();
		
		UserDAO userDAO = DAOFactory.getUserDAO();
		//User userTemp = userDAO.findById(1);
		//userDAO.haveMoneyByID(10);
		System.out.println(userDAO.haveMoneyByID(1));

	}
		
}
