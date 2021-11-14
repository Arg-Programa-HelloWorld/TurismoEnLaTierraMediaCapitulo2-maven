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
				
				/*
				System.out.println("-----------------------");
				System.out.println(attraction.getName());
				System.out.println(cost);
				System.out.println(time);
				System.out.println("-----------------------");
				*/

			}

			
			System.out.println("Valor de la promocion hs: " + cost);
			
			this.time = time;
			System.out.println("Tiempo de la promocion hs: " + this.time);
			
			System.out.println("Descuento de la promocion %: " + percentageDiscount);
			
			System.out.println("Cifra multiplicadora del descuento: " + discount);
			
			this.cost = cost * discount;
			
			System.out.println("Costo a pagar luego de aplicar el descuento $: " + Math.round(this.cost * 100.0) / 100.0);
			
			saving = cost - this.cost;
			this.setSaving_money(saving);
			System.out.println("Ahorro de $ "+ Math.round(saving * 100.0) / 100.0);

						

		} catch (Exception e) {

			throw new MissingDataException(e);

		}

	}

}