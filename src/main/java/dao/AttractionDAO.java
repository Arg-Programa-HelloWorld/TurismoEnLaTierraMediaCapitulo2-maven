package dao;

import java.sql.SQLException;
import java.util.List;

import model.Attraction;
import model.Promotion;
import model.User;

public interface AttractionDAO extends GenericDAO<Attraction> {
	
	public abstract Attraction getLastAttraction() throws SQLException;
	public abstract List<Attraction> findAttractionByUser(User user);
	public abstract List<Attraction> searchAttractionsOfAPromotionByPromotion(Promotion promotion);
	public abstract List<Attraction> searchAttractionsOfAPromotionByID(int ID);
	
	
}