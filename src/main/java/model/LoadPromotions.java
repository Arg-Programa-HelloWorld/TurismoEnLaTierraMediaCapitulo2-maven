package model;

import java.util.ArrayList;

import dao.DAOFactory;
import dao.MissingDataException;
import dao.PromotionDAO;

public class LoadPromotions {

	private static ArrayList<Promotion> promotionsList = new ArrayList<Promotion>();
	
	public static boolean readPromotionsBDD() {

		try {
			
			PromotionDAO promotionDAO = DAOFactory.getPromotionDAO();
						
			for (Promotion promotion : promotionDAO.findAll()) { 
					
				setPromotionList(promotion);
									
			}
		
			return true;
		
		} catch (Exception e) {
			
			throw new MissingDataException(e);
			
		}
			
			

	}

	public static ArrayList<Promotion> getPromotionList() {
		
		return promotionsList;
		
	}

	public static void setPromotionList(Promotion promotion) {
	
		promotionsList.add(promotion);
		
	}
		
}