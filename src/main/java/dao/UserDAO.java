package dao;

import model.Attraction;
import model.Promotion;
import model.User;

public interface UserDAO extends GenericDAO<User> {
	
	public abstract User getLastUser();
	public abstract int buyAttraction(User user, Attraction attraction);
	public abstract int buyPromotion(User user, Promotion promotion);
	public abstract double haveMoney(User user);
	public abstract double haveMoneyByID(int id);
	public abstract double haveTime(User user);
	public abstract double haveTimeByID(int id);
	public abstract int hasTheAttraction(User user, Attraction attraction);
	public abstract int hasThePromotion(User user, Promotion promotion);
		
}