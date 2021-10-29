package dao;

import java.sql.SQLException;
import java.util.List;

import model.User;

public interface GenericDAO<T> {
	
	public int insert(T t) throws SQLException;
	public int update(T t) throws SQLException;
	public int delete(T t) throws SQLException;
	public T findById(int t)throws SQLException;
	public List<T> findAll() throws SQLException;
	public int countAll() throws SQLException;
		
}