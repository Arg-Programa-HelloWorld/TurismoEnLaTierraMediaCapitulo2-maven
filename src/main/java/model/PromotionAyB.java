package model;

import java.util.LinkedList;

public class PromotionAyB extends Promotion {

	// Constructor para obtener la Promocion de la BDD
	public PromotionAyB(int id, String name, double time, double cost, double discount, String image,
			int promotionTypeID, PromotionType promotionType, LinkedList<Attraction> attractionsList) {

		super(id, name, time, cost, discount, image, promotionTypeID, promotionType, attractionsList);

	}

	// Constructor para crear la Promocion
	public PromotionAyB(String name, double time, double cost, double discount, String image, int promotionTypeID) {

		super(name, time, cost, discount, image, promotionTypeID);

	}

	public PromotionAyB(String name, Double time, Double cost, Double discount, String image, int promotionTypeID,
			LinkedList<Attraction> attractionsList) {

		super(name, time, cost, discount, image, promotionTypeID, attractionsList);
	}

	@Override
	public void calculatePrice() {

		double time = 0;
		double cost = 0;
		double saving = 0;
		double discount = attractionsList.get(attractionsList.size() - 1).getCost();

		for (int i = 0; i < attractionsList.size(); i++) {

			cost += attractionsList.get(i).getCost();
			time += attractionsList.get(i).getTime();

		}

		this.time = time;

		this.cost = cost - discount;

		this.discount = discount;

		saving = cost - this.cost;

		this.setSaving_money(saving);

	}

}