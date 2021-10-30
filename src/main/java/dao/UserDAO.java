package dao;

import java.sql.SQLException;

import model.Attraction;
import model.User;

public interface UserDAO extends GenericDAO<User> {
	
	public abstract User getLastUser() throws SQLException;
	public abstract int buyAttraction(User user, Attraction attraction) throws SQLException;

}