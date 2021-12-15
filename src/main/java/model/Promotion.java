package model;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public abstract class Promotion {

	protected int id; // ID
	protected String name;
	protected double time = 0;
	protected double cost = 0;
	protected int quota = 0;
	protected double discount = 0;
	protected String image;
	protected int promotionTypeID;
	protected PromotionType promotionType;
	protected double saving_money;

	private Map<String, String> errors;

	protected List<Attraction> attractionsList = new LinkedList<Attraction>();

	// Para Obtener una Atraccion de la BDD
	public Promotion(int id, String name, double time, double cost, double discount, String image, int promotionTypeID,
			PromotionType promotionType, LinkedList<Attraction> attractionsList) {
		super();
		this.id = id;
		this.name = name;
		this.time = time;
		this.cost = cost;
		this.discount = discount;
		this.image = image;
		this.promotionTypeID = promotionTypeID;
		this.promotionType = promotionType;
		this.attractionsList = attractionsList;

	}

	/*
	 * public Promotion(int id, String name, double time, double cost, double
	 * discount, String image, int promotionTypeID, PromotionType promotionType) {
	 * super(); this.id = id; this.name = name; this.time = time; this.cost = cost;
	 * this.discount = discount; this.image = image; this.promotionTypeID =
	 * promotionTypeID; this.promotionType = promotionType;
	 * 
	 * }
	 */
	public Promotion(String name, double time, double cost, double discount, String image, int promotionTypeID) {
		super();
		this.name = name;
		this.time = time;
		this.cost = cost;
		this.discount = discount;
		this.image = image;
		this.promotionTypeID = promotionTypeID;

	}

	public Promotion(String name, double time, double cost, double discount, String image, int promotionTypeID,
			LinkedList<Attraction> attractionsList) {
		super();
		this.name = name;
		this.time = time;
		this.cost = cost;
		this.discount = discount;
		this.image = image;
		this.promotionTypeID = promotionTypeID;
		this.attractionsList = attractionsList;

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
		return "Promotion [id=" + id + ", name=" + name + ", time=" + time + ", cost=" + cost + ", quota=" + quota
				+ ", discount=" + discount + ", image=" + image + ", promotionTypeID=" + promotionTypeID
				+ ", promotionType=" + promotionType + ", saving_money=" + saving_money + ", attractionsList="
				+ attractionsList + "]";
	}

	public void calculatePrice() {

	}

	public boolean canHost(int i) {
		return quota >= i;
	}

	public boolean isValid() {
		validate();

		return errors.isEmpty();

	}

	public void validate() {
		errors = new HashMap<String, String>();

		if (name == "") {
			//System.out.println("hola 1");
			errors.put("name", "Debe tener un Nombre!");
		}
		if (promotionTypeID == 0 && promotionTypeID > 3) {
			errors.put("promotionTypeID", "Seleccione uno de los tipos de la lista!");
			//System.out.println("hola 2");
		}

	}

	public Map<String, String> getErrors() {
		return errors;
	}

}