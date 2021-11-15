package model;

import java.util.LinkedList;
import java.util.List;

public abstract class Promotion {

	private int id; // ID
	private String name;
	protected double time = 0;
	protected double cost = 0;
	protected int quota = 0;
	protected double discount = 0;
	private String image;
	private int promotionTypeID;
	private PromotionType promotionType;
	protected double saving_money;

	protected List<Attraction> attractionsList = new LinkedList<Attraction>();

	public Promotion(int id, String name, double time, double cost, double discount, int promotionTypeID,
			PromotionType promotionType, LinkedList<Attraction> attractionsList) {
		super();
		this.id = id;
		this.name = name;
		this.time = time;
		this.cost = cost;
		this.discount = discount;
		this.promotionTypeID = promotionTypeID;
		this.promotionType = promotionType;
		this.attractionsList = attractionsList;

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

	public int getQuota() {
		return quota;
	}

	public void setQuota(int quota) {
		this.quota = quota;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
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

	public double getSaving_money() {
		return saving_money;
	}

	public void setSaving_money(double saving_money) {
		this.saving_money = saving_money;
	}

	public List<Attraction> getAttractionsList() {
		return attractionsList;
	}

	public void setAttractionsList(List<Attraction> attractionsList) {
		this.attractionsList = attractionsList;
	}

	@Override
	public String toString() {
		return "Promotion [id=" + id + ", name=" + name + ", time=" + time + ", cost=" + cost + ", discount=" + discount
				+ ", promotionTypeID=" + promotionTypeID + ", promotionType=" + promotionType + ", attractionList="
				+ attractionsList + "]";
	}

	public void calculatePrice() {

	}

}