package model;

import java.util.LinkedList;

public class PromotionAbsolute extends Promotion {

	double absoluteDiscount;

	// Constructor para obtener la Promocion de la BDD
	public PromotionAbsolute(int id, String name, double time, double cost, double discount, String image,
			int promotionTypeID, PromotionType promotionType, LinkedList<Attraction> attractionsList) {

		super(id, name, time, cost, discount, image, promotionTypeID, promotionType, attractionsList);

		absoluteDiscount = discount;

	}

	// Constructor para crear la Promocion
	public PromotionAbsolute(String name, double time, double cost, double discount, String image,
			int promotionTypeID) {

		super(name, time, cost, discount, image, promotionTypeID);

	}

	public PromotionAbsolute(String name, Double time, Double cost, Double discount, String image, int promotionTypeID,
			LinkedList<Attraction> attractionsList) {

		super(name, time, cost, discount, image, promotionTypeID, attractionsList);
	}

	@Override
	public void calculatePrice() {

		double time = 0;
		double cost = 0;
		double saving = 0;
		double discount = absoluteDiscount;
		int quota = -1;

		for (Attraction attraction : attractionsList) {

			cost += attraction.getCost();
			time += attraction.getTime();
			if (quota < 0) {
				quota = attraction.getQuota();
			}
			if (quota > attraction.getQuota()) {
				quota = attraction.getQuota();
			}
				

		}

		this.time = time;

		this.discount = discount;

		this.cost = cost - discount;
		
		this.quota = quota;

		saving = cost - this.cost;

		this.setSaving_money(saving);

	}

}