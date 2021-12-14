package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import jdbc.ConnectionProvider;
import model.Attraction;
import model.Promotion;
import model.PromotionAbsolute;
import model.PromotionAyB;
import model.PromotionPercentage;
import model.PromotionType;
import model.User;

public class PromotionDAOImpl implements PromotionDAO {

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

			String sqlQuery = "UPDATE promotions SET name = ?, time = ?, cost = ?, discount = ?, fk_id_promotion_type = ? WHERE id = ?";
			Connection connection = ConnectionProvider.getConnection();

			PreparedStatement statement = connection.prepareStatement(sqlQuery);

			statement.setString(1, promotion.getName());
			statement.setDouble(2, promotion.getTime());
			statement.setDouble(3, promotion.getCost());
			statement.setDouble(4, promotion.getDiscount());
			statement.setInt(5, promotion.getPromotionTypeID());
			statement.setInt(6, promotion.getId());

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

			String sqlQuery = "SELECT promotions.id, promotions.name, promotions.time, promotions.cost, promotions.discount, promotions.image, promotion_type.id, promotion_type.name AS promotion_type\n"
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

			return (Promotion) promotionTemp;

		} catch (Exception e) {

			throw new MissingDataException(e);

		}

	}

	public List<Promotion> findAll() {

		try {

			String sqlQuery = "SELECT promotions.id, promotions.name, promotions.time, promotions.cost, promotions.discount, promotions.image, promotion_type.id, promotion_type.name AS promotion_type\n"
					+ "FROM promotions\n"
					+ "INNER JOIN promotion_type ON promotions.fk_id_promotion_type = promotion_type.id\n"
					+ "AND promotions.state = 1";

			Connection connection = ConnectionProvider.getConnection();

			PreparedStatement statement = connection.prepareStatement(sqlQuery);
			ResultSet results = statement.executeQuery();

			List<Promotion> promotionsListTemp = new LinkedList<Promotion>();

			while (results.next()) {

				promotionsListTemp.add(toPromotion(results));

			}

			return promotionsListTemp;

		} catch (Exception e) {

			throw new MissingDataException(e);

		}

	}

	public int countAll() {

		try {

			String sqlQuery = "SELECT COUNT(*) AS promotion_quantity FROM promotions";
			Connection connection = ConnectionProvider.getConnection();
			PreparedStatement statement = connection.prepareStatement(sqlQuery);
			ResultSet results = statement.executeQuery();

			results.next();

			int total = results.getInt("promotion_quantity");

			return total;

		} catch (Exception e) {

			throw new MissingDataException(e);

		}
	}

	public Promotion getLastPromotion() {

		try {

			String sqlQuery = "SELECT promotions.id, promotions.name, promotions.time, promotions.cost, promotions.discount, promotions.image, promotion_type.id, promotion_type.name AS promotion_type\n"
					+ "FROM promotions\n"
					+ "INNER JOIN promotion_type ON promotions.fk_id_promotion_type = promotion_type.id ORDER BY promotions.id DESC LIMIT 1";

			Connection conn = ConnectionProvider.getConnection();

			PreparedStatement statement = conn.prepareStatement(sqlQuery);
			ResultSet resultados = statement.executeQuery();

			Promotion promotionsTemp = null;

			if (resultados.next()) {

				promotionsTemp = toPromotion(resultados);

			}

			return (Promotion) promotionsTemp;

		} catch (Exception e) {

			throw new MissingDataException(e);

		}
	}

	public double cost(Promotion promotion) {

		try {
			String sqlQuery = "SELECT cost FROM promotions WHERE id = ?";
			Connection conn = ConnectionProvider.getConnection();

			PreparedStatement statement = conn.prepareStatement(sqlQuery);
			statement.setInt(1, promotion.getId());
			ResultSet results = statement.executeQuery();

			return results.getDouble(1);

		} catch (SQLException e) {
			throw new MissingDataException(e);
		}

	}

	public double time(Promotion promotion) {

		try {
			String sqlQuery = "SELECT time FROM promotions WHERE id = ?";
			Connection conn = ConnectionProvider.getConnection();

			PreparedStatement statement = conn.prepareStatement(sqlQuery);
			statement.setInt(1, promotion.getId());
			ResultSet results = statement.executeQuery();

			return results.getDouble(1);

		} catch (SQLException e) {
			throw new MissingDataException(e);
		}

	}

	private Promotion toPromotion(ResultSet results) {

		try {

			Promotion promotionTemp = null;
			Promotion promotionTempPercentage = null;
			Promotion promotionTempAbsolute = null;
			Promotion promotionTempAyB = null;
			int result = 0;

			AttractionDAO attractionDAO = DAOFactory.getAttractionDAO();

			// System.out.println(PromotionType.fromId(results.getInt(6)));

			result = results.getInt(7);

			if (result == 1) {

				LinkedList<Attraction> attractionListPercentage;

				attractionListPercentage = (LinkedList<Attraction>) attractionDAO
						.searchAttractionsOfAPromotionByID(results.getInt(1));

				// Promotion( Integer id, String name, Double time, Double cost, Double
				// discount, int fk_id_promotion_type, PromotionType promotion_type.name )

				promotionTempPercentage = new PromotionPercentage(results.getInt(1), results.getString(2),
						results.getDouble(3), results.getDouble(4), results.getDouble(5), results.getString(6), results.getInt(7),
						PromotionType.valueOf(results.getString(8)), attractionListPercentage);

				if (!attractionListPercentage.isEmpty()) {

					promotionTempPercentage.calculatePrice();

					update(promotionTempPercentage);

				}

				promotionTemp = promotionTempPercentage;

				// System.out.println("Paso por Percentage");

			}

			if (result == 2) {

				LinkedList<Attraction> attractionListAbsolute;

				attractionListAbsolute = (LinkedList<Attraction>) attractionDAO
						.searchAttractionsOfAPromotionByID(results.getInt(1));

				// Promotion( Integer id, String name, Double time, Double cost, Double discount
				// int fk_id_promotion_type PromotionType promotion_type.name)
				promotionTempAbsolute = new PromotionAbsolute(results.getInt(1), results.getString(2),
						results.getDouble(3), results.getDouble(4), results.getDouble(5), results.getString(6), results.getInt(7),
						PromotionType.valueOf(results.getString(8)), attractionListAbsolute);

				if (!attractionListAbsolute.isEmpty()) {

					promotionTempAbsolute.calculatePrice();

					update(promotionTempAbsolute);

				}

				promotionTemp = promotionTempAbsolute;

				// System.out.println("Paso por Absulute");

			}

			if (result == 3) {

				LinkedList<Attraction> attractionListAyB;

				attractionListAyB = (LinkedList<Attraction>) attractionDAO
						.searchAttractionsOfAPromotionByID(results.getInt(1));

				// Promotion( Integer id, String name, Double time, Double cost, Double discount
				// int fk_id_promotion_type PromotionType promotion_type.name)
				promotionTempAyB = new PromotionAyB(results.getInt(1), results.getString(2), results.getDouble(3),
						results.getDouble(4), results.getDouble(5), results.getString(6), results.getInt(7), 
						PromotionType.valueOf(results.getString(8)), attractionListAyB);

				if (!attractionListAyB.isEmpty()) {

					promotionTempAyB.calculatePrice();

					update(promotionTempAyB);

				}

				promotionTemp = promotionTempAyB;

				// System.out.println("Paso por A_and_B");

			}

			return promotionTemp;

		} catch (Exception e) {

			throw new MissingDataException(e);

		}

	}

	public int unsubscribe(Promotion promotion) {
		
		try {

			String sqlQuery = "UPDATE promotions SET state = 0 WHERE id = ?";
			Connection connection = ConnectionProvider.getConnection();

			PreparedStatement statement = connection.prepareStatement(sqlQuery);

			statement.setInt(1, promotion.getId());
			
			int rowsUpdate = statement.executeUpdate();

			return rowsUpdate;

		} catch (Exception e) {

			throw new MissingDataException(e);

		}
	}

	public int subscribe(Promotion promotion) {
		
		try {

			String sqlQuery = "UPDATE promotions SET state = 1 WHERE id = ?";
			Connection connection = ConnectionProvider.getConnection();

			PreparedStatement statement = connection.prepareStatement(sqlQuery);

			statement.setInt(1, promotion.getId());
			
			int rowsUpdate = statement.executeUpdate();

			return rowsUpdate;
			
		} catch (Exception e) {

			throw new MissingDataException(e);

		}

	}

	public List<Promotion> userPromotions(User user) {

		try {

			String sqlQuery = "SELECT promotions.id, promotions.name, promotions.time, promotions.cost, promotions.discount, promotions.image, promotion_type.id, promotion_type.name AS promotion_type\n"
					+ "FROM itinerary_shopping\n"
					+ "INNER JOIN promotions ON itinerary_shopping.fk_id_promotion = promotions.id\n"
					+ "INNER JOIN promotion_type ON promotions.fk_id_promotion_type = promotion_type.id\n"
					+ "WHERE itinerary_shopping.fk_id_user = ?";

			Connection connection = ConnectionProvider.getConnection();

			PreparedStatement statement = connection.prepareStatement(sqlQuery);

			statement.setInt(1, user.getId());

			ResultSet results = statement.executeQuery();

			List<Promotion> promotionsListTemp = new LinkedList<Promotion>();

			while (results.next()) {

				promotionsListTemp.add(toPromotion(results));

			}

			return promotionsListTemp;

		} catch (Exception e) {

			throw new MissingDataException(e);

		}

	}
	
	public int relateAttractionToPromotion(Promotion promotion, Attraction attraction) {

		try {

			String sqlQuery = "INSERT INTO promotion_attractions (fk_id_promotion, fk_id_attraction) VALUES (?, ?)";
			Connection connection = ConnectionProvider.getConnection();

			PreparedStatement statement = connection.prepareStatement(sqlQuery);

			statement.setInt(1, promotion.getId());
			statement.setInt(2, attraction.getId());

			int rowsInsert = statement.executeUpdate();

			return rowsInsert;

		} catch (Exception e) {

			throw new MissingDataException(e);

		}

	}


}
