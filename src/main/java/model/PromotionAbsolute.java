package model;

import java.util.ArrayList;

public class PromotionAbsolute extends Promotion {

	double absoluteDiscount;
	
	public PromotionAbsolute(int id, String name, double time, double cost, double discount, int promotionTypeID,
			PromotionType promotionType) {
		
		super(id, name, time, cost, discount, promotionTypeID, promotionType);
		
		calculatePrice();
		
	}
	
	public PromotionAbsolute(String name, double time, double cost, double discount, int promotionTypeID) {
		
		super(name, time, cost, discount, promotionTypeID);
		
		//calculatePrice();
		
	}

	@Override
	public void calculatePrice() {
		
		double time = 0;
		double cost = 0;
		double discount = absoluteDiscount;
		
		for (Attraction attraction : attractionList) {
			
			cost += attraction.getCost();
			time += attraction.getTime();
			//System.out.println(attraction.getName());
			
		}
		
		super.time = time;
		super.cost = cost - discount;
		super.discount = discount;
				
	}
	
}