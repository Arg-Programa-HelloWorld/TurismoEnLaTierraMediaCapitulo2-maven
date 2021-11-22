package dao;

import model.Promotion;

public interface PromotionDAO extends GenericDAO<Promotion>{

	public abstract Promotion getLastPromotion();
	public abstract double cost(Promotion promotion);
	public abstract double time(Promotion promotion);
		
}
