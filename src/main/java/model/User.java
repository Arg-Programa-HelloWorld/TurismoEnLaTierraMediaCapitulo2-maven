package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mindrot.jbcrypt.BCrypt;

import manager.ItineraryManager;

public class User {

	private int id; // ID
	private String name; // nombre
	private String password;
	private double budget; // presupuesto
	private double time; // tiempo que dispone
	private String image;
	private String date;
	private Boolean admin;
	private Boolean state;
	private int preferencesID;
	private AttractionType preferences; // preferencias

	private ItineraryManager itineraryManager;
	
	private double totalTime;
	private double totalGold;

	private ArrayList<Attraction> listOfAttractions = new ArrayList<Attraction>();
	private ArrayList<Promotion> listOfPromotions = new ArrayList<Promotion>();
	
	private Map<String, String> errors;

	// Para Obtener un Usuario de la BDD
	public User(int id, String name, String password,  double budget, double time, String image, Boolean admin, Boolean state, int preferencesID, AttractionType preferences) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.budget = budget;
		this.time = time;
		this.image = image;
		this.admin = admin;
		this.state = state;
		this.preferencesID = preferencesID;
		this.preferences = preferences;

	}

	// Para Insertar un Usuario en la BDD
	public User(String name, String password, double budget, double time, int preferencesID) {
		super();
		this.name = name;
		this.password = password;
		this.budget = budget;
		this.time = time;
		this.preferencesID = preferencesID;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
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
	
	public boolean checkPassword(String password) {
		return BCrypt.checkpw(password, this.getPassword());
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", budget=" + budget + ", time=" + time
				+ ", image=" + image + ", date=" + date + ", admin=" + admin + ", preferencesID=" + preferencesID
				+ ", preferences=" + preferences + "]";
	}

	public Boolean isAdmin() {
		return admin;
	}

	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}
	
	public boolean canAfford(Attraction attraction) {
		return attraction.getCost() <= this.budget;
	}
	
	public boolean canAttend(Attraction attraction) {
		return attraction.getTime() <= this.time;
	}
	
	public void calcular() {
	
		totalGold = 0;
		totalTime = 0;
		
		this.itineraryManager = new ItineraryManager();
		
		List<Promotion> promotions = itineraryManager.getListPromotions(this);
		
		for (Promotion promotion : promotions) {

			 totalGold += promotion.getCost();
			 totalTime += promotion.getTime();

		}
		
		List<Attraction> attractions = itineraryManager.getLisAttraction(this);
		
		for (Attraction attraction : attractions) {

			totalGold += attraction.getCost();
			totalTime += attraction.getTime();

		}
		
	}
	
	public boolean isValid() {
		validate();
		return errors.isEmpty();
	}
	
	public void validate() {
		errors = new HashMap<String, String>();

		if (budget <= 0) {
			errors.put("budget", "Debe ser positivo!");
		}
		if (time <= 0) {
			errors.put("time", "Debe ser positivo!");
		}
		
	}
	
	public Map<String, String> getErrors() {
		return errors;
	}
	
	public boolean isActive() {
		return state;
	}

}