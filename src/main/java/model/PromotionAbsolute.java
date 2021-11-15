package model;

import java.util.LinkedList;

public class PromotionAbsolute extends Promotion {

	double absoluteDiscount;

	public PromotionAbsolute(int id, String name, double time, double cost, double discount, int promotionTypeID,
			PromotionType promotionType, LinkedList<Attraction> attractionsList) {

		super(id, name, time, cost, discount, promotionTypeID, promotionType, attractionsList);

		absoluteDiscount = discount;

	}

	public PromotionAbsolute(String name, double time, double cost, double discount, int promotionTypeID) {

		super(name, time, cost, discount, promotionTypeID);

	}

	@Override
	public void calculatePrice() {

		double time = 0;
		double cost = 0;
		double saving = 0;
		double discount = absoluteDiscount;

		for (Attraction attraction : attractionsList) {

			cost += attraction.getCost();
			time += attraction.getTime();
			// System.out.println(attraction.getName());

		}

		this.time = time;

		this.discount = discount;

		// System.out.println("Valor de la promocion hs: " + cost);

		this.time = time;
		// System.out.println("Tiempo de la promocion hs: " + this.time);

		// System.out.println("Descuento absoluto de la promocion $: " +
		// absoluteDiscount);

		this.cost = cost - discount;

		// System.out.println("Costo a pagar luego de aplicar el descuento $: " +
		// Math.round(this.cost * 100.0) / 100.0);

		saving = cost - this.cost;
		this.setSaving_money(saving);
		// System.out.println("Ahorro de $ "+ Math.round(saving * 100.0) / 100.0);

	}

}