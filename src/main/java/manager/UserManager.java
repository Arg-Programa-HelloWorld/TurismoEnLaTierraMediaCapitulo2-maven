package manager;

import java.util.List;

import dao.AttractionDAO;
import dao.DAOFactory;
import dao.PromotionDAO;
import dao.UserDAO;
import model.User;

public class UserManager {
	
	UserDAO userDAO = DAOFactory.getUserDAO();
	AttractionDAO attractionDAO = DAOFactory.getAttractionDAO();
	PromotionDAO promotionDAO = DAOFactory.getPromotionDAO();
	
	public int insert(User user) {

		return userDAO.insert(user);
		
	}

	public int update(User user) {

		return userDAO.update(user);

	}

	public int delete(User user) {

		return userDAO.delete(user);

	}

	public User findById(int userID) {

		return userDAO.findById(userID);

	}

	public List<User> findAll() {

		return userDAO.findAll();

	}

	public int countAll() {

		return userDAO.countAll();
		
	}

	public User getLastUser() {

		return userDAO.getLastUser();
		
	}
	
	public void unsubscribeAnUser(User user) {
		
		userDAO.unsubscribe(user);
		
	}
	
	public void subscribeAnUser(User user) {
		
		userDAO.subscribe(user);
		
	}
	
	public void setAdmin(User user) {
		
		userDAO.setAdmin(user);
		
	}
	
}
