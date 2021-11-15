package dao;

public class DAOFactory {
	
	public static UserDAO getUserDAO() {
		
		return new UserDAOImpl();	// Devuelve una implementacion!!!
		
	}
	
	public static AttractionDAO getAttractionDAO() {
		
		return new AttractionDAOImpl();
		
	}
	
	public static PromotionDAO getPromotionDAO() {
		
		return new PromotionDAOImpl();
		
	}
	
	public static ItineraryDAO getItineraryDAO() {
		
		return new ItineraryDAOImpl();
		
	}

}
