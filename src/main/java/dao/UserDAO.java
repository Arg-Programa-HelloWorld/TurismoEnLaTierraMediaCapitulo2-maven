package dao;

import model.Attraction;
import model.Promotion;
import model.User;

public interface UserDAO extends GenericDAO<User> {
	
	public abstract User getLastUser();
	public abstract int buyAttraction(User user, Attraction attraction);
	public abstract int buyPromotion(User user, Promotion promotion);
<<<<<<< HEAD
	public abstract double haveMoney(User user);
	public abstract double haveMoneyByID(int id);
	public abstract double haveTime(User user);
	public abstract double haveTimeByID(int id);
	public abstract boolean hasTheAttraction(User user, Attraction attraction);
	public abstract boolean hasThePromotion(User user, Promotion promotion);
=======
	public abstract double hasMoney(User user);
	public abstract double hasMoneyByID(int id);
	public abstract double hasTime(User user);
	public abstract double hasTimeByID(int id);
	public abstract Boolean hasTheAttraction(User user, Attraction attraction);
	public abstract Boolean hasThePromotion(User user, Promotion promotion);
>>>>>>> branch 'main' of https://github.com/Arg-Programa-HelloWorld/TurismoEnLaTierraMediaCapitulo2-maven.git
		
}