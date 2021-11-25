package dao;

import java.util.List;

import model.User;

public interface GenericDAO<T> {
	
	public int insert(T t);
	public int update(T t);
	public int delete(T t);
	public T findById(int t);
	public List<T> findAll();
	public int countAll();
	public int unsubscribe(T t);
	public int subscribe(T t);
		
}