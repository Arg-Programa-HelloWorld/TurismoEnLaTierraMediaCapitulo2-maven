package manager;

import java.util.List;

import dao.DAOFactory;
import dao.ItineraryDAO;
import model.Attraction;
import model.Itinerary;
import model.Promotion;
import model.User;

public class ItineraryManager {
	
	ItineraryDAO itineraryDAO = DAOFactory.getItineraryDAO();

	public List<Promotion> getListPromotions(User user) {
		
		return itineraryDAO.findAllPromotions(user);
		
	}
	
	public List<Attraction> getLisAttraction(User user) {
		
		return itineraryDAO.findAllAttractions(user);
		
	}
	
}
