package model;

import java.util.ArrayList;

public abstract class Promotion {

//public class Promotion {

	private int id;			// ID
	private String name;
	protected double time = 0;
	protected double cost = 0;
	protected double discount = 0;
	private int promotionTypeID;
	private PromotionType promotionType;
	
	protected ArrayList<Attraction> attractionList = new ArrayList<Attraction>();

	
	
	public Promotion(int id, String name, double time, double cost, double discount, int promotionTypeID,
			PromotionType promotionType, ArrayList<Attraction> attractionList) {
		super();
		this.id = id;
		this.name = name;
		this.time = time;
		this.cost = cost;
		this.discount = discount;
		this.promotionTypeID = promotionTypeID;
		this.promotionType = promotionType;
		this.attractionList = attractionList;
	
	}
	
	public Promotion(int id, String name, double time, double cost, double discount, int promotionTypeID,
			PromotionType promotionType) {
		super();
		this.id = id;
		this.name = name;
		this.time = time;
		this.cost = cost;
		this.discount = discount;
		this.promotionTypeID = promotionTypeID;
		this.promotionType = promotionType;
		
	}
	
	public Promotion(String name, double time, double cost, double discount, int promotionTypeID) {
		super();
		this.name = name;
		this.time = time;
		this.cost = cost;
		this.discount = discount;
		this.promotionTypeID = promotionTypeID;
		
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

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public int getPromotionTypeID() {
		return promotionTypeID;
	}

	public void setPromotionTypeID(int promotionTypeID) {
		this.promotionTypeID = promotionTypeID;
	}

	public PromotionType getPromotionType() {
		return promotionType;
	}

	public void setPromotionType(PromotionType promotionType) {
		this.promotionType = promotionType;
	}

	public ArrayList<Attraction> getAttractionList() {
		return attractionList;
	}

	public void setAttractionList(ArrayList<Attraction> attractionList) {
		this.attractionList = attractionList;
	}

	@Override
	public String toString() {
		return "Promotion [id=" + id + ", name=" + name + ", time=" + time + ", cost=" + cost + ", discount=" + discount
				+ ", promotionTypeID=" + promotionTypeID + ", promotionType=" + promotionType + ", attractionList="
				+ attractionList + "]";
	}

	public void calculatePrice() {
		// TODO Auto-generated method stub
		
	}	

}