package model;

import java.util.LinkedList;

import dao.MissingDataException;

public class PromotionPercentage extends Promotion {

	private double percentageDiscount;

	// Constructor para obtener la Promocion de la BDD
	public PromotionPercentage(int id, String name, double time, double cost, double discount, int promotionTypeID,
			PromotionType promotionType, LinkedList<Attraction> attractionsList) {

		super(id, name, time, cost, discount, promotionTypeID, promotionType, attractionsList);

		percentageDiscount = discount;

	}

	// Constructor para crear la Promocion
	public PromotionPercentage(String name, double time, double cost, double discount, int promotionTypeID) {

		super(name, time, cost, discount, promotionTypeID);

	}

	@Override
	public void calculatePrice() {

		try {

			double time = 0;
			double cost = 0;
			double saving = 0;
			double discount = ((100 - percentageDiscount) / 100);

			for (Attraction attraction : super.attractionsList) {

				cost += attraction.getCost();
				time += attraction.getTime();
				// System.out.println(attraction.getName());

			}

			this.time = time;
			this.cost = cost * discount;
			saving = cost - this.cost;

			
			System.out.println("Tiempo: Hs. " + Math.round(this.time * 100.0) / 100.0);
			System.out.println("Costo: $ " + Math.round(this.cost * 100.0) / 100.0);
			System.out.println("Ahorro de: $ " + Math.round(saving * 100.0) / 100.0);
			

		} catch (Exception e) {

			throw new MissingDataException(e);

		}

	}

}