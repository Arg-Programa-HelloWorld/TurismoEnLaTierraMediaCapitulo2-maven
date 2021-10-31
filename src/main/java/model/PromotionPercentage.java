package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.LinkedList;

import dao.MissingDataException;
import jdbc.ConnectionProvider;

public class PromotionPercentage extends Promotion {
	
	private double percentageDiscount;
	
	// Constructor para obtener la Promocion de la BDD 
	public PromotionPercentage(int id, String name, double time, double cost, double discount, int promotionTypeID,
			PromotionType promotionType, LinkedList<Attraction> attractionsList) {
		
		super(id, name, time, cost, discount, promotionTypeID, promotionType, attractionsList);
		
		percentageDiscount = discount;
		
		calculatePrice();
		
	}
	
	// Constructor para crear la Promocion
	public PromotionPercentage(String name, double time, double cost, double discount, int promotionTypeID) {
		
		super(name, time, cost, discount, promotionTypeID);
		
		//calculatePrice();
		
	}
		
	@Override
	public void calculatePrice() {
		
		try {
			
			double time = 0;
			double cost = 0;
			double discount = ((100 - percentageDiscount) / 100);
			
			for (Attraction attraction : super.attractionsList) {
				
				cost += attraction.getCost();
				time += attraction.getTime();
				//System.out.println(attraction.getName());
				
			}
			
			super.time = time;
			super.cost = cost * discount;
			super.discount = cost - (cost * discount);
			
			System.out.println("Tiempo: " + Math.round(super.time*100.0)/100.0);
			System.out.println("Costo: " + Math.round(super.cost*100.0)/100.0);
			System.out.println("Descuento: " + Math.round(super.discount*100.0)/100.0);
			
			//System.out.println(super.time + super.cost);	// estos son numeros!!
			
			/*
			String sqlQuery = "UPDATE promotions SET name = ?, time = ?, cost = ?, fk_id_promotion_type = ? WHERE id = ?";
			Connection connection = ConnectionProvider.getConnection();
		
			PreparedStatement statement = connection.prepareStatement(sqlQuery);
			
			statement.setString(1, super.getName());
			statement.setDouble(2, super.getTime());
			statement.setDouble(3, super.getCost());
			statement.setInt(4, super.getPromotionTypeID());
			statement.setInt(5, super.getId());
			
			statement.executeUpdate();
			*/
			
			
			//int rowsUpdate = statement.executeUpdate();

			//return rowsUpdate;
			
			
		} catch (Exception e) {
			
			throw new MissingDataException(e);
			
		}
				
	}
	
}