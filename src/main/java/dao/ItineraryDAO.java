package dao;

import java.util.List;

import model.Attraction;
import model.Itinerary;
import model.Promotion;
import model.User;

public interface ItineraryDAO {

	public abstract List<Promotion> findAllPromotions(User user);
	public abstract List<Attraction> findAllAttractions(User user);
	
}
