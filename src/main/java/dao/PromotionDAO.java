package dao;

import model.Promotion;

public interface PromotionDAO extends GenericDAO<Promotion>{

	public abstract Promotion getLastPromotion();
		
}
