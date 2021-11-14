package dao;

import java.sql.SQLException;

import model.Attraction;
import model.Promotion;
import model.User;

public interface UserDAO extends GenericDAO<User> {
	
	public abstract User getLastUser() throws SQLException;
	public abstract int buyAttraction(User user, Attraction attraction) throws SQLException;
	public abstract int buyPromotion(User user, Promotion promotion) throws SQLException;
	public abstract double haveMoney(User user) throws SQLException;
	public abstract double haveMoneyByID(int id) throws SQLException;
	
}