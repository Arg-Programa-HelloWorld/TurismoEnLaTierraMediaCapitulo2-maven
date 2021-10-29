package model;

import java.util.ArrayList;

public class PromotionAyB extends Promotion {

	public PromotionAyB(int id, String name, double time, double cost, double discount, int promotionTypeID,
			PromotionType promotionType) {
		
		super(id, name, time, cost, discount, promotionTypeID, promotionType);
		
		calculatePrice();
		
	}
	
	public PromotionAyB(String name, double time, double cost, double discount, int promotionTypeID) {
		
		super(name, time, cost, discount, promotionTypeID);
		
		//calculatePrice();
		
	}

	@Override
	public void calculatePrice() {
		
		double time = 0;
		double cost = 0;
		double discount = attractionList.get(attractionList.size() - 1).getCost();
		
		for (int i = 0; i < attractionList.size(); i++) {
			
			cost += attractionList.get(i).getCost();
			time += attractionList.get(i).getTime();
			//System.out.println(attraction.getName());
			
		}
		
		super.time = time;
		super.cost = cost - discount;
		super.discount = discount;
				
	}
	
}