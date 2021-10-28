package dao;

import java.sql.SQLException;

import model.User;

public interface UserDAO extends GenericDAO<User> {
	
	public abstract User getLastUser() throws SQLException;

}