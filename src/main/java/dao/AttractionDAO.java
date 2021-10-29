package dao;

import java.sql.SQLException;

import model.Attraction;

public interface AttractionDAO extends GenericDAO<Attraction> {
	
	public abstract Attraction getLastAttraction() throws SQLException;
	
}