package manager;

import java.util.List;

import dao.AttractionDAO;
import dao.DAOFactory;
import dao.UserDAO;
import model.Attraction;

public class AttractionManager {

	UserDAO userDAO = DAOFactory.getUserDAO();
	AttractionDAO attractionDAO = DAOFactory.getAttractionDAO();
	
	public int insert(Attraction attraction) {

		return attractionDAO.insert(attraction);
		
	}

	public int update(Attraction attraction) {

		return attractionDAO.update(attraction);

	}

	public int delete(Attraction attraction) {

		return attractionDAO.delete(attraction);

	}

	public Attraction findById(int attractionID) {

		return attractionDAO.findById(attractionID);

	}

	public List<Attraction> findAll() {

		return attractionDAO.findAll();

	}

	public int countAll() {

		return attractionDAO.countAll();
		
	}

	public Attraction getLastUser() {

		return attractionDAO.getLastAttraction();
		
	}
	
	public void unsubscribeAnUser(Attraction attraction) {
		
		attractionDAO.unsubscribe(attraction);
		
	}
	
	public void subscribeAnUser(Attraction attraction) {
		
		attractionDAO.subscribe(attraction);
		
	}
	
}
