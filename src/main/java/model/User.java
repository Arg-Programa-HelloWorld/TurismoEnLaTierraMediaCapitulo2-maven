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

	
	
	// Para Obtener un Usuario de la BDD
	public User(int id, String name, double budget, double time, int preferencesID, AttractionType preferences) {
		super();
		this.id = id;
		this.name = name;
		this.budget = budget;
		this.time = time;
		this.preferencesID = preferencesID;
		this.preferences = preferences;
		
	}


	// Para Insertar un Usuario en la BDD
	public User(String name, double budget, double time, int preferencesID) {
		super();
		this.name = name;
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
	
	protected boolean haveAttraction(Attraction newAttraction) { 
								
		return false;
		
	}
	
	protected boolean havePromotion(Promotion newPromotion) { 
		
		return false;
		
	}
	
	protected boolean haveMoney(double cost) {
		
		if (cost <= this.getBudget()) {
		
			return true;	// Tengo dinero disponible!!
			
		} else {			
			
			View.colorearMensaje(View.red,"[---------------------------------------------------------------------]");
			View.colorearMensaje(View.red,"[ Your budget is insufficient to purchase this product!!!             ]"); // Si Users no posee budget suficiente
			View.colorearMensaje(View.red,"[---------------------------------------------------------------------]");
			return false;	// No tengo dinero disponible!!
			
			
		}
	}
		
	protected boolean haveTime(double time) {
		
		if (time <= this.getTime()) {
		
			return true;	// Tengo tiempo disponible!!
			
						
		} else {
			
			View.colorearMensaje(View.red,"[---------------------------------------------------------------------]");
			View.colorearMensaje(View.red,"[ Your do not have enough time to purchase this product!!!            ]"); // Si Users no posee budget suficiente
			View.colorearMensaje(View.red,"[---------------------------------------------------------------------]");
			
			return false;	// No tengo tiempo disponible!!
			
		}
		
	}
	
	protected void pay(double cost) {		
		
		this.setBudget(this.getBudget() - cost);
		
	}
	
	protected void spendTime(double time) {
		
		this.setTime(this.getTime() - time);
		
	}
	
	protected void buyAttraction(Attraction newAttraction) {
		
		/*
		if ( !this.haveAttraction(newAttraction) && this.haveMoney(newAttraction.getCost()) && this.haveTime(newAttraction.getTime()) ) {
		
			// Si no tengo la atraccion        y       Si tengo dinero suficiente        y        Si tengo tiempo suficiente
			
			this.pay(newAttraction.getCost());			// Pago
			this.spendTime(newAttraction.getTime()); 	// Uso tiempo
			this.setListOfAttractions(newAttraction); 	// Agrego la atracion a la lista
			
			//newAttraction.setQuota(newAttraction.getQuota() - 1);
			
			// Mejoradolo aun más en un metodo quitar cupo para ser utilizado desde una compra
			// de Atraccion o por compra de una Promocion.-  
			removeQuotaOfAnAttraction(newAttraction);
			
		}	
		*/
	}	
	
	protected void buyPromotion(Promotion newPromotion) {
		
		/*---------------- NEW CODE ----------------*/
		
		int flag = 0 ;
						
		if ( !this.havePromotion(newPromotion) && this.haveMoney(newPromotion.getCost()) && this.haveTime(newPromotion.getTime()) ){
			
			
				
				
		} else {
				
				View.colorearMensaje(View.red,"[---------------------------------------------------------------------]");
				View.colorearMensaje(View.red,"[ You already own some products of this promotion!!!                  ]");
				View.colorearMensaje(View.red,"[---------------------------------------------------------------------]");
						
		}		
			
		

	}
	
	protected void removeQuotaOfAnAttraction(Attraction anAttraction) {
		
		anAttraction.setQuota(anAttraction.getQuota()-1);
		
	}
	
	protected void calculateTotalTime() {
		
		double amountOfTime = 0;
				
		for (Attraction attraction : this.getListOfAttractions()) {
			
			amountOfTime += attraction.getTime();
			
		}
		
		for (Promotion promotion : this.getListOfPromotions()) {
			
			//amountOfTime += promotion.time;
						
		}
		
		this.setTotalTime(amountOfTime);
		
	}
	
	protected void calculateTotalGold() {
		
		double amountOfGold = 0;
		
		for (Attraction attraction : this.getListOfAttractions()) {
			
			amountOfGold += attraction.getCost();
			
		}
		
		for (Promotion promotion : this.getListOfPromotions()) {
			
			//amountOfGold += promotion.cost;		
			
		}
		
		this.setTotalGold(amountOfGold);
			
	}
	
	protected void calculateTimeAndGoldSpent() {
		
		this.calculateTotalTime();
		this.calculateTotalGold();
				
	}

		
	
}