package model;

import java.util.ArrayList;

public class PromotionPercentage extends Promotion {

	private double percentageDiscount;
	
	public PromotionPercentage(int id, String name, double time, double cost, double discount, int promotionTypeID,
			PromotionType promotionType) {
		
		super(id, name, time, cost, discount, promotionTypeID, promotionType);
		
		//calculatePrice();
		
	}
	
	public PromotionPercentage(String name, double time, double cost, double discount, int promotionTypeID) {
		
		super(name, time, cost, discount, promotionTypeID);
		
		//calculatePrice();
		
	}
	
	@Override
	public void calculatePrice() {
		
		double time = 0;
		double cost = 0;
		double discount = ((100 - percentageDiscount) / 100);
		
		for (Attraction attraction : super.attractionList) {
			
			cost += attraction.getCost();
			time += attraction.getTime();
			//System.out.println(attraction.getName());
			
		}
		
		super.time = time;
		super.cost = cost * discount;
		super.discount = cost - (cost * discount);
				
	}
	
}