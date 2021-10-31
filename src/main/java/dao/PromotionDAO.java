package dao;

import java.sql.SQLException;

import model.Promotion;

public interface PromotionDAO extends GenericDAO<Promotion>{

	public abstract Promotion getLastPromotion() throws SQLException;
		
}
