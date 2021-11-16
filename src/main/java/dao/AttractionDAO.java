package dao;

import java.util.List;

import model.Attraction;
import model.Promotion;
import model.User;

public interface AttractionDAO extends GenericDAO<Attraction> {
	
	public abstract Attraction getLastAttraction();
	public abstract List<Attraction> findAttractionByUser(User user);
	public abstract List<Attraction> searchAttractionsOfAPromotionByPromotion(Promotion promotion);
	public abstract List<Attraction> searchAttractionsOfAPromotionByID(int ID);
	
	
}