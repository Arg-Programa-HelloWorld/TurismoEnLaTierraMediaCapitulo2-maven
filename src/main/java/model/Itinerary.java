package model;

import java.util.ArrayList;
import java.util.List;

public class Itinerary {
	
	private List<Attraction> listOfAttractions = new ArrayList<Attraction>();
	private List<Promotion> listOfPromotions = new ArrayList<Promotion>();
	
	public List<Attraction> getListOfAttractions() {
		return listOfAttractions;
	}
	public void setListOfAttractions(List<Attraction> list) {
		this.listOfAttractions = list;
	}
	public List<Promotion> getListOfPromotions() {
		return listOfPromotions;
	}
	public void setListOfPromotions(List<Promotion> list) {
		this.listOfPromotions = list;
	}

}
