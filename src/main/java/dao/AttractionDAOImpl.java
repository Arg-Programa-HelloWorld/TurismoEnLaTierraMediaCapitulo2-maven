package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import jdbc.ConnectionProvider;
import model.Attraction;
import model.AttractionType;
import model.Promotion;
import model.User;

public class AttractionDAOImpl implements AttractionDAO {

	public int insert(Attraction attraction) {

		try {

			String sqlQuery = "INSERT INTO attractions (name, cost, time, quota, fk_id_attraction_type) VALUES (?,?,?,?,?)";
			Connection connection = ConnectionProvider.getConnection();

			PreparedStatement statement = connection.prepareStatement(sqlQuery);

			statement.setString(1, attraction.getName());
			statement.setDouble(2, attraction.getCost());
			statement.setDouble(3, attraction.getTime());
			statement.setInt(4, attraction.getQuota());
			statement.setInt(5, attraction.getAttractionTypeID());

			int rowsInsert = statement.executeUpdate();

			return rowsInsert;

		} catch (Exception e) {

			throw new MissingDataException(e);

		}

	}

	public int update(Attraction attraction) {

		try {

			String sqlQuery = "UPDATE attractions SET name = ?, cost = ?, time = ?, quota = ?, fk_id_attraction_type = ? WHERE id = ?";
			Connection connection = ConnectionProvider.getConnection();

			PreparedStatement statement = connection.prepareStatement(sqlQuery);

			statement.setString(1, attraction.getName());
			statement.setDouble(2, attraction.getCost());
			statement.setDouble(3, attraction.getTime());
			statement.setInt(4, attraction.getQuota());
			statement.setInt(5, attraction.getAttractionTypeID());
			statement.setInt(6, attraction.getId());

			int rowsUpdate = statement.executeUpdate();

			return rowsUpdate;

		} catch (Exception e) {

			throw new MissingDataException(e);

		}
	}

	public int delete(Attraction attraction) {

		try {

			String sqlQuery = "DELETE FROM attractions WHERE id = ?";
			Connection connection = ConnectionProvider.getConnection();

			PreparedStatement statement = connection.prepareStatement(sqlQuery);

			statement.setInt(1, attraction.getId());

			int rowsDelete = statement.executeUpdate();

			return rowsDelete;

		} catch (Exception e) {

			throw new MissingDataException(e);

		}

	}

	public Attraction findById(int attractionID) {

		try {

			String sql = "SELECT attractions.id, attractions.name, attractions.cost, attractions.time, attractions.quota, attraction_type.id, attraction_type.name AS preference\n"
					+ "FROM attractions\n"
					+ "INNER JOIN attraction_type ON attractions.fk_id_attraction_type = attraction_type.id\n"
					+ "WHERE attractions.id = ?";
			Connection conn = ConnectionProvider.getConnection();

			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setInt(1, attractionID);
			ResultSet resultados = statement.executeQuery();

			Attraction attraction = null;

			if (resultados.next()) {
				attraction = toAttraction(resultados);
			}
			return attraction;

		} catch (Exception e) {

			throw new MissingDataException(e);

		}

	}

	public List<Attraction> findAttractionByUser(User user) {

		try {

			String sql = "";
			Connection conn = ConnectionProvider.getConnection();

			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setInt(1, user.getId());
			ResultSet resultados = statement.executeQuery();

			List<Attraction> attractions = new LinkedList<Attraction>();
			while (resultados.next()) {

				attractions.add(toAttraction(resultados));
			}

			return attractions; // Lista de Attractions.-

		} catch (Exception e) {

			throw new MissingDataException(e);

		}

	}

	public List<Attraction> searchAttractionsOfAPromotionByPromotion(Promotion promotion) {

		try {

			String sql = "SELECT attractions.id, attractions.name, attractions.cost, attractions.time, attractions.quota, attractions.fk_id_attraction_type, attraction_type.name AS type\n"
					+ "FROM promotions\n"
					+ "INNER JOIN promotion_attractions ON promotions.id = promotion_attractions.fk_id_promotion\n"
					+ "INNER JOIN attractions ON promotion_attractions.fk_id_attraction = attractions.id\n"
					+ "INNER JOIN attraction_type ON attractions.fk_id_attraction_type = attraction_type.id\n"
					+ "WHERE promotions.id = ?";
			Connection conn = ConnectionProvider.getConnection();

			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setInt(1, promotion.getId());
			ResultSet resultados = statement.executeQuery();

			List<Attraction> attractions = new LinkedList<Attraction>();

			while (resultados.next()) {

				attractions.add(toAttraction(resultados));
			}

			return attractions; // Lista de Attractions.-

		} catch (Exception e) {

			throw new MissingDataException(e);

		}

	}

	public List<Attraction> searchAttractionsOfAPromotionByID(int ID) {

		try {

			String sql = "SELECT attractions.id, attractions.name, attractions.cost, attractions.time, attractions.quota, attractions.fk_id_attraction_type, attraction_type.name AS type\n"
					+ "FROM promotions\n"
					+ "INNER JOIN promotion_attractions ON promotions.id = promotion_attractions.fk_id_promotion\n"
					+ "INNER JOIN attractions ON promotion_attractions.fk_id_attraction = attractions.id\n"
					+ "INNER JOIN attraction_type ON attractions.fk_id_attraction_type = attraction_type.id\n"
					+ "WHERE promotions.id = ?";
			Connection conn = ConnectionProvider.getConnection();

			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setInt(1, ID);
			ResultSet resultados = statement.executeQuery();

			List<Attraction> attractions = new LinkedList<Attraction>();

			while (resultados.next()) {

				attractions.add(toAttraction(resultados));
			}

			return attractions; // Lista de Attractions.-

		} catch (Exception e) {

			throw new MissingDataException(e);

		}

	}

	public List<Attraction> findAll() {

		try {

			String sqlQuery = "SELECT attractions.id, attractions.name, attractions.cost, attractions.time, attractions.quota, attraction_type.id, attraction_type.name AS preference\n"
					+ "FROM attractions\n"
					+ "INNER JOIN attraction_type ON attractions.fk_id_attraction_type = attraction_type.id";
			Connection connection = ConnectionProvider.getConnection();
			PreparedStatement statement = connection.prepareStatement(sqlQuery);
			ResultSet results = statement.executeQuery();

			List<Attraction> attractions = new LinkedList<Attraction>();
			while (results.next()) {

				attractions.add(toAttraction(results));
			}

			return attractions; // Lista de Attractions.-

		} catch (Exception e) {

			throw new MissingDataException(e);

		}

	}

	public int countAll() {

		try {

			String sqlQuery = "SELECT COUNT(*) AS attractions_quantity FROM attractions";
			Connection connection = ConnectionProvider.getConnection();
			PreparedStatement statement = connection.prepareStatement(sqlQuery);
			ResultSet results = statement.executeQuery();

			results.next();

			int total = results.getInt("attractions_quantity");

			return total;

		} catch (Exception e) {

			throw new MissingDataException(e);

		}

	}

	public Attraction getLastAttraction() {

		try {

			// String sqlQuery = "SELECT * FROM users WHERE id = ?";
			String sqlQuery = "SELECT attractions.id, attractions.name, attractions.cost, attractions.time, attractions.quota, attraction_type.id, attraction_type.name AS type\n"
					+ "FROM attractions\n"
					+ "INNER JOIN attraction_type ON attractions.fk_id_attraction_type = attraction_type.id\n"
					+ "ORDER BY attractions.id DESC LIMIT 1";
			Connection conn = ConnectionProvider.getConnection();

			PreparedStatement statement = conn.prepareStatement(sqlQuery);
			ResultSet resultados = statement.executeQuery();

			Attraction attractionTemp = null;

			if (resultados.next()) {
				attractionTemp = toAttraction(resultados);
			}

			return attractionTemp;

		} catch (Exception e) {

			throw new MissingDataException(e);

		}

	}
	
	public double cost(Attraction attraction) {
		
		 try {
			 String sqlQuery = "SELECT cost FROM attractions WHERE id = ?";
			Connection conn = ConnectionProvider.getConnection();
			
			PreparedStatement statement = conn.prepareStatement(sqlQuery);
			statement.setInt(1, attraction.getId());
			ResultSet results = statement.executeQuery();
			
			return results.getDouble(1);
			
		} catch (SQLException e) {
			throw new MissingDataException(e);
		}
		 
	}
	
	public double costById(int id) {
		
		 try {
			 String sqlQuery = "SELECT cost FROM attractions WHERE id = ?";
			Connection conn = ConnectionProvider.getConnection();
			
			PreparedStatement statement = conn.prepareStatement(sqlQuery);
			statement.setInt(1, id);
			ResultSet results = statement.executeQuery();
			
			return results.getDouble(1);
			
		} catch (SQLException e) {
			throw new MissingDataException(e);
		}
		 
	}
	
	public double time(Attraction attraction) {
		
		 try {
			 String sqlQuery = "SELECT time FROM attractions WHERE id = ?";
			Connection conn = ConnectionProvider.getConnection();
			
			PreparedStatement statement = conn.prepareStatement(sqlQuery);
			statement.setInt(1, attraction.getId());
			ResultSet results = statement.executeQuery();
			
			return results.getDouble(1);
			
		} catch (SQLException e) {
			throw new MissingDataException(e);
		}
		 
	}

	public double timeById(int id) {
		
		try {
			 String sqlQuery = "SELECT time FROM attractions WHERE id = ?";
			Connection conn = ConnectionProvider.getConnection();
			
			PreparedStatement statement = conn.prepareStatement(sqlQuery);
			statement.setInt(1, id);
			ResultSet results = statement.executeQuery();
			
			return results.getDouble(1);
			
		} catch (SQLException e) {
			throw new MissingDataException(e);
		}
	}
	
	public double quota(Attraction attraction) {
		
		 try {
			 String sqlQuery = "SELECT quota FROM attractions WHERE id = ?";
			Connection conn = ConnectionProvider.getConnection();
			
			PreparedStatement statement = conn.prepareStatement(sqlQuery);
			statement.setInt(1, attraction.getId());
			ResultSet results = statement.executeQuery();
			
			return results.getDouble(1);
			
		} catch (SQLException e) {
			throw new MissingDataException(e);
		}
		 
	}
	
	private Attraction toAttraction(ResultSet results) {

		try {
			// Attraction( Integer id, String name, Double cost, Double time, Integer quota
			// Integer fk_id_preference) AttractionType attractionType
			return new Attraction(results.getInt(1), results.getString(2), results.getDouble(3), results.getDouble(4),
					results.getInt(5), results.getInt(6), AttractionType.valueOf(results.getString(7)));
		} catch (Exception e) {

			throw new MissingDataException(e);

		}
	}

	public int unsubscribe(Attraction t) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int subscribe(Attraction t) {
		// TODO Auto-generated method stub
		return 0;
	}


}
