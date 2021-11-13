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
		double discount = absoluteDiscount;
		
		for (Attraction attraction : attractionsList) {
			
			cost += attraction.getCost();
			time += attraction.getTime();
			//System.out.println(attraction.getName());
			
		}
		
		this.time = time;
		this.cost = cost - discount;
		this.discount = discount;
				
	}
	
}