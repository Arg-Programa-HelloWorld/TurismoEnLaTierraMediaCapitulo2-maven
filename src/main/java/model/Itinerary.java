package model;

import java.util.ArrayList;

public class Itinerary {
	
	private ArrayList<Attraction> listOfAttractions = new ArrayList<Attraction>();
	private ArrayList<Promotion> listOfPromotions = new ArrayList<Promotion>();
	
	public ArrayList<Attraction> getListOfAttractions() {
		return listOfAttractions;
	}
	public void setListOfAttractions(ArrayList<Attraction> listOfAttractions) {
		this.listOfAttractions = listOfAttractions;
	}
	public ArrayList<Promotion> getListOfPromotions() {
		return listOfPromotions;
	}
	public void setListOfPromotions(ArrayList<Promotion> listOfPromotions) {
		this.listOfPromotions = listOfPromotions;
	}

}
