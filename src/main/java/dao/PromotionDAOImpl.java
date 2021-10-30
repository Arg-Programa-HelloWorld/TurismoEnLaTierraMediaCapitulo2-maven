package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import jdbc.ConnectionProvider;
import model.Promotion;
import model.PromotionAbsolute;
import model.PromotionAyB;
import model.PromotionPercentage;
import model.PromotionType;


public class PromotionDAOImpl implements PromotionDAO{

	public int insert(Promotion promotion) {
		
		try {
			
			String sqlQuery = "INSERT INTO promotions (name, time, cost, discount, fk_id_promotion_type) VALUES (?,?,?,?,?)";
			Connection connection = ConnectionProvider.getConnection();
			
			PreparedStatement statement = connection.prepareStatement(sqlQuery);
			
			statement.setString(1, promotion.getName());
			statement.setDouble(2, promotion.getTime());
			statement.setDouble(3, promotion.getCost());
			statement.setDouble(4, promotion.getDiscount());
			statement.setInt(5, promotion.getPromotionTypeID());
			
			int rowsInsert = statement.executeUpdate();
				
			return rowsInsert;
			
			
		} catch (Exception e) {
			
			throw new MissingDataException(e);
			
		}
		
	}

	public int update(Promotion promotion) {
		
		try {
			
			String sqlQuery = "UPDATE promotions SET name = ?, time = ?, discount = ?, fk_id_promotion_type = ? WHERE id = ?";
			Connection connection = ConnectionProvider.getConnection();
		
			PreparedStatement statement = connection.prepareStatement(sqlQuery);
			
			statement.setString(1, promotion.getName());
			statement.setDouble(2, promotion.getTime());
			statement.setDouble(3, promotion.getDiscount());
			statement.setInt(4, promotion.getPromotionTypeID());
			statement.setInt(5, promotion.getId());
			
			int rowsUpdate = statement.executeUpdate();

			return rowsUpdate;
			
			
		} catch (Exception e) {
			
			throw new MissingDataException(e);
			
		}
		
	}

	public int delete(Promotion promotion) {
		
		try {
			
			String sqlQuery = "DELETE FROM promotions WHERE id = ?";
			Connection connection = ConnectionProvider.getConnection();
			
			PreparedStatement statement = connection.prepareStatement(sqlQuery);
				
			statement.setInt(1, promotion.getId());
			
			int rowsDelete = statement.executeUpdate();
			
			return rowsDelete;			
			
			
		} catch (Exception e) {
			
			throw new MissingDataException(e);
			
		}

	}

	public Promotion findById(int promotionID) {
		
		try {
			
			String sqlQuery = "SELECT promotions.id, promotions.name, promotions.time, promotions.cost, promotions.discount, promotion_type.id, promotion_type.name AS promotion_type\n"
					+ "FROM promotions\n"
					+ "INNER JOIN promotion_type ON promotions.fk_id_promotion_type = promotion_type.id\n"
					+ "WHERE promotions.id = ?";
			Connection conn = ConnectionProvider.getConnection();

			PreparedStatement statement = conn.prepareStatement(sqlQuery);
			statement.setInt(1, promotionID);
			ResultSet resultados = statement.executeQuery();

			Promotion promotionTemp = null;
			
			
			if (resultados.next()) {
				
				promotionTemp = toPromotion(resultados);
				
			}
			
			//return promotionTemp;
			
			return (Promotion) promotionTemp;
						
		} catch (Exception e) {
			
			throw new MissingDataException(e);
			
		}
		
	}

	public List<Promotion> findAll(){
		
		try {
			
			String sqlQuery = "SELECT promotions.id, promotions.name, promotions.time, promotions.cost, promotions.discount, promotion_type.id, promotion_type.name AS promotion_type\n"
					+ "FROM promotions\n"
					+ "INNER JOIN promotion_type ON promotions.fk_id_promotion_type = promotion_type.id";

			Connection conn = ConnectionProvider.getConnection();
			
			PreparedStatement statement = conn.prepareStatement(sqlQuery);
			ResultSet resultados = statement.executeQuery();

			List<Promotion> promotionsTemp = new LinkedList<Promotion>();

			if (resultados.next()) {
				
				promotionsTemp.add(toPromotion(resultados));
				
			}
			
			return promotionsTemp;
			//return (List<Promotion>) promotionsTemp;
			
			
		} catch (Exception e) {
			
			throw new MissingDataException(e);
			
		}
		
	}

	public int countAll() {
		
		return 0;
	}

	public Promotion getLastPromotion() {
		
		try {
			
			String sqlQuery = "SELECT promotions.id, promotions.name, promotions.time, promotions.cost, promotions.discount, promotion_type.id, promotion_type.name AS promotion_type\n"
					+ "FROM promotions\n"
					+ "INNER JOIN promotion_type ON promotions.fk_id_promotion_type = promotion_type.id ORDER BY promotions.id DESC LIMIT 1";

			Connection conn = ConnectionProvider.getConnection();
			
			PreparedStatement statement = conn.prepareStatement(sqlQuery);
			ResultSet resultados = statement.executeQuery();

			List<Promotion> promotionsTemp = new LinkedList<Promotion>();

			if (resultados.next()) {
				
				promotionsTemp.add(toPromotion(resultados));
				
			}
			
			return (Promotion) promotionsTemp;
			
			
		} catch (Exception e) {
			
			throw new MissingDataException(e);
			
		}
	}
	
	private Promotion toPromotion(ResultSet results) throws SQLException {
		
		Promotion promotionTemp = null;
		
		//switch(PromotionType.fromId(results.getInt(6))) {
		switch(PromotionType.valueOf(results.getString(6))) {
		
			case PERCENTAGE:
				
				//Promotion(                   Integer id,        String name,         Double time,         Double cost,         Double discount		int fk_id_promotion_type                PromotionType promotion_type.name)
				promotionTemp = new PromotionPercentage(results.getInt(1), results.getString(2),results.getDouble(3),results.getDouble(4),results.getDouble(5),results.getInt(6),PromotionType.valueOf(results.getString(7)));
			
			case ABSOLUTE:
				
				//Promotion(                 Integer id,        String name,         Double time,         Double cost,         Double discount		int fk_id_promotion_type                PromotionType promotion_type.name)
				promotionTemp = new PromotionAbsolute(results.getInt(1), results.getString(2),results.getDouble(3),results.getDouble(4),results.getDouble(5),results.getInt(6),PromotionType.valueOf(results.getString(7)));
						
			case A_AND_B:
			
				//Promotion(            Integer id,        String name,         Double time,         Double cost,         Double discount		int fk_id_promotion_type                PromotionType promotion_type.name)
				promotionTemp = new PromotionAyB(results.getInt(1), results.getString(2),results.getDouble(3),results.getDouble(4),results.getDouble(5),results.getInt(6),PromotionType.valueOf(results.getString(7)));
							
			default:
				break;
		}
		
		return promotionTemp;
				
	}

}
























