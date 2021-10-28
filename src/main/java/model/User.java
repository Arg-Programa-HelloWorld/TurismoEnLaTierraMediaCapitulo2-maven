package model;

import java.util.*;

public class User {

	private int id;							// ID
	private String name;					// nombre
	private double budget;					// presupuesto
	private double time;					// tiempo que dispone
	private int preferencesID;
	private AttractionType preferences;		// preferencias
	private double totalTime;
	private double totalGold;
	
	private ArrayList<Attraction> listOfAttractions = new ArrayList<Attraction>();
	private ArrayList<Promotion> listOfPromotions = new ArrayList<Promotion>();

	
	// Para Obtener el Usuario de la BDD
	public User(int id, String name, double budget, double time, AttractionType preferences) {
		
		this.id = id;
		this.name = name;					// nombre
		this.budget =  budget;				// presupuesto
		this.time = time;					// tiempo que dispone

		this.preferences = preferences;		// preferencias

	}
	
	// Para Creaar un Usuario en la BDD
	public User(String name, double budget, double time, int preferencesID) {
		
		this.name = name;					// nombre
		this.budget =  budget;				// presupuesto
		this.time = time;					// tiempo que dispone

		this.preferencesID = preferencesID;		// preferencias

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}

		
	public int getPreferencesID() {
		return preferencesID;
	}

	public void setPreferencesID(int preferencesID) {
		this.preferencesID = preferencesID;
	}

	public AttractionType getPreferences() {
		return preferences;
	}

	public void setPreferences(AttractionType preferences) {
		this.preferences = preferences;
	}

	public double getTotalTime() {
		return totalTime;
	}

	public void setTotalTime(double totalTime) {
		this.totalTime = totalTime;
	}

	public double getTotalGold() {
		return totalGold;
	}

	public void setTotalGold(double totalGold) {
		this.totalGold = totalGold;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", budget=" + budget + ", time=" + time + ", preferences="
				+ preferences + ", totalTime=" + totalTime + ", totalGold=" + totalGold + "]";
	}
	
	/*
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
	*/

		
	
}