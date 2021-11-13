package model;

import java.util.LinkedList;

public class PromotionAyB extends Promotion {

	public PromotionAyB(int id, String name, double time, double cost, double discount, int promotionTypeID,
			PromotionType promotionType, LinkedList<Attraction> attractionsList) {
		
		super(id, name, time, cost, discount, promotionTypeID, promotionType, attractionsList);
		
		//calculatePrice();
		
	}
	
	public PromotionAyB(String name, double time, double cost, double discount, int promotionTypeID) {
		
		super(name, time, cost, discount, promotionTypeID);
		
		//calculatePrice();
		
	}

	@Override
	public void calculatePrice() {
		
		double time = 0;
		double cost = 0;
		double discount = attractionsList.get(attractionsList.size() - 1).getCost();
		
		for (int i = 0; i < attractionsList.size(); i++) {
			
			cost += attractionsList.get(i).getCost();
			time += attractionsList.get(i).getTime();
			//System.out.println(attraction.getName());
			
		}
		
		this.time = time;
		this.cost = cost - discount;
		this.discount = discount;
				
	}
	
}