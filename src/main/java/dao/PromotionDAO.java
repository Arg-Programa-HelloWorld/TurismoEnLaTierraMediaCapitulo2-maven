package dao;

import java.util.List;

import model.Attraction;
import model.Promotion;
import model.User;

public interface PromotionDAO extends GenericDAO<Promotion> {

	public abstract Promotion getLastPromotion();

	public abstract double cost(Promotion promotion);

	public abstract double time(Promotion promotion);

	public abstract List<Promotion> userPromotions(User user);
	
	public abstract int relateAttractionToPromotion(Promotion promotion, Attraction attraction);

}
