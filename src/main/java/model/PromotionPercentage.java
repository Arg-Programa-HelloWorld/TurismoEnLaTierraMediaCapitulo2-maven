package model;

import java.util.LinkedList;

import dao.MissingDataException;

public class PromotionPercentage extends Promotion {

	private double percentageDiscount;

	// Constructor para obtener la Promocion de la BDD
	public PromotionPercentage(int id, String name, double time, double cost, double discount, String image, int promotionTypeID,
			 PromotionType promotionType, LinkedList<Attraction> attractionsList) {

		super(id, name, time, cost, discount, image, promotionTypeID, promotionType, attractionsList);

		percentageDiscount = discount;

	}

	// Constructor para crear la Promocion
	public PromotionPercentage(String name, double time, double cost, double discount, String image, int promotionTypeID) {

		super(name, time, cost, discount, image, promotionTypeID);

	}

	public PromotionPercentage(String name, double time, double cost, double discount, String image,
			int promotionTypeID, LinkedList<Attraction> attractionsList) {

		super(name, time, cost, discount, image, promotionTypeID, attractionsList);

		percentageDiscount = discount;

	}

	@Override
	public void calculatePrice() {

		try {

			double time = 0;
			double cost = 0;
			double saving = 0;
			double discount = ((100 - percentageDiscount) / 100);
			int quota = -1;

			for (Attraction attraction : super.attractionsList) {

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

			this.cost = cost * discount;
			
			this.quota = quota;

			saving = cost - this.cost;

			this.setSaving_money(saving);

		} catch (Exception e) {

			throw new MissingDataException(e);

		}

	}

}