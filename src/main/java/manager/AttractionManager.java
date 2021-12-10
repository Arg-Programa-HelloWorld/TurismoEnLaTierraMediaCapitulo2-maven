package manager;

import java.util.List;

import dao.DAOFactory;
import dao.AttractionDAO;
import model.Attraction;

public class AttractionManager {

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
	
	public int deleteByID(int id) {

		return attractionDAO.deleteByID(id);

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

	public Attraction getLastAttraction() {

		return attractionDAO.getLastAttraction();

	}

	public int unsubscribe(Attraction attraction) {

		return attractionDAO.unsubscribe(attraction);
	}

	public int subscribe(Attraction attraction) {

		return attractionDAO.subscribe(attraction);
	}

}
