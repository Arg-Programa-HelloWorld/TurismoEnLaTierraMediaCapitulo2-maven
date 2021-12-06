package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

import jdbc.ConnectionProvider;
import model.User;
import model.Attraction;
import model.AttractionType;
import model.Promotion;

public class UserDAOImpl implements UserDAO {

	public int insert(User user) {

		try {

			String sqlQuery = "INSERT INTO users (name, password, budget, time, fk_id_preference) VALUES (?,?,?,?,?)";
			Connection connection = ConnectionProvider.getConnection();

			PreparedStatement statement = connection.prepareStatement(sqlQuery);

			statement.setString(1, user.getName());
			statement.setString(2, user.getPassword());
			statement.setDouble(3, user.getBudget());
			statement.setDouble(4, user.getTime());
			statement.setInt(5, user.getPreferencesID());

			int rowsInsert = statement.executeUpdate();

			return rowsInsert;

		} catch (Exception e) {

			throw new MissingDataException(e);

		}

	}

	public int update(User user) {

		try {

			String sqlQuery = "UPDATE users SET name = ?, budget = ?, time = ?, fk_id_preference = ? WHERE id = ?";
			Connection connection = ConnectionProvider.getConnection();

			PreparedStatement statement = connection.prepareStatement(sqlQuery);

			statement.setString(1, user.getName());
			statement.setDouble(2, user.getBudget());
			statement.setDouble(3, user.getTime());
			statement.setInt(4, user.getPreferencesID());
			statement.setInt(5, user.getId());

			int rowsUpdate = statement.executeUpdate();

			return rowsUpdate;

		} catch (Exception e) {

			throw new MissingDataException(e);

		}

	}

	public int delete(User user) {

		try {

			String sqlQuery = "DELETE FROM users WHERE id = ?";
			Connection connection = ConnectionProvider.getConnection();

			PreparedStatement statement = connection.prepareStatement(sqlQuery);

			statement.setInt(1, user.getId());

			int rowsDelete = statement.executeUpdate();

			return rowsDelete;

		} catch (Exception e) {

			throw new MissingDataException(e);

		}

	}

	public User findById(int userID) {

		try {

			String sqlQuery = "SELECT users.id, users.name, budget, time, attraction_type.id, attraction_type.name AS preference\n"
					+ "FROM users\n" + "INNER JOIN attraction_type ON users.fk_id_preference = attraction_type.id\n"
					+ "WHERE users.id = ?";
			Connection conn = ConnectionProvider.getConnection();

			PreparedStatement statement = conn.prepareStatement(sqlQuery);
			statement.setInt(1, userID);
			ResultSet resultados = statement.executeQuery();

			User user = null;

			if (resultados.next()) {
				user = toUser(resultados);
			}
			return user;

		} catch (Exception e) {

			throw new MissingDataException(e);

		}

	}

	public List<User> findAll() {

		try {

			String sqlQuery = "SELECT users.id, users.name, budget, time, attraction_type.id, attraction_type.name AS preference\n"
					+ "FROM users\n" + "INNER JOIN attraction_type ON users.fk_id_preference = attraction_type.id";

			Connection connection = ConnectionProvider.getConnection();

			PreparedStatement statement = connection.prepareStatement(sqlQuery);
			ResultSet results = statement.executeQuery();

			List<User> usersListTemp = new LinkedList<User>();

			while (results.next()) {

				usersListTemp.add(toUser(results));
			}

			return usersListTemp; // Lista de Usuarios.-

		} catch (Exception e) {

			throw new MissingDataException(e);

		}

	}

	public int countAll() {

		try {

			String sqlQuery = "SELECT COUNT(*) AS users_quantity FROM users";
			Connection connection = ConnectionProvider.getConnection();
			PreparedStatement statement = connection.prepareStatement(sqlQuery);
			ResultSet results = statement.executeQuery();

			results.next();

			int total = results.getInt("users_quantity");

			return total;

		} catch (Exception e) {

			throw new MissingDataException(e);

		}

	}

	public User getLastUser() {

		try {

			String sqlQuery = "SELECT users.id, users.name, budget, time, attraction_type.id, attraction_type.name AS preferences\n"
					+ "FROM users\n"
					+ "INNER JOIN attraction_type ON users.fk_id_preference = attraction_type.id ORDER BY users.id DESC LIMIT 1";
			Connection conn = ConnectionProvider.getConnection();

			PreparedStatement statement = conn.prepareStatement(sqlQuery);
			ResultSet resultados = statement.executeQuery();

			User userTemp = null;

			if (resultados.next()) {
				userTemp = toUser(resultados);
			}
			return userTemp;

		} catch (Exception e) {

			throw new MissingDataException(e);

		}

	}

	public int buyAttraction(User user, Attraction attraction) {

		try {

			String sqlQuery = "INSERT INTO itinerary_shopping (fk_id_user, fk_id_attraction, name, cost, time) VALUES(?,?,?,?,?)";
			Connection connection = ConnectionProvider.getConnection();

			PreparedStatement statement = connection.prepareStatement(sqlQuery);

			statement.setInt(1, user.getId());
			statement.setDouble(2, attraction.getId());
			statement.setString(3, attraction.getName());
			statement.setDouble(4, attraction.getCost());
			statement.setDouble(5, attraction.getTime());

			int rows = statement.executeUpdate();

			return rows;

		} catch (Exception e) {

			throw new MissingDataException(e);

		}

	}

	public int buyPromotion(User user, Promotion promotion) {

		try {

			// INSERT INTO itinerary_shopping (fk_id_user, fk_id_attraction, name, cost,
			// time) VALUES(?,?,?,?,?)
			String sqlQuery = "INSERT INTO itinerary_shopping (fk_id_user, fk_id_promotion, name, cost, time, discount, saving_money) VALUES(?,?,?,?,?,?,?)";
			Connection connection = ConnectionProvider.getConnection();

			PreparedStatement statement = connection.prepareStatement(sqlQuery);

			statement.setInt(1, user.getId());
			statement.setInt(2, promotion.getId());
			statement.setString(3, promotion.getName());
			statement.setDouble(4, promotion.getTime());
			statement.setDouble(5, promotion.getCost());
			statement.setDouble(6, promotion.getDiscount());
			statement.setDouble(7, promotion.getSaving_money());

			int rows = statement.executeUpdate();

			return rows;

		} catch (Exception e) {

			throw new MissingDataException(e);

		}

	}

	public double hasMoney(User user) {

		try {

			String sqlQuery = "SELECT budget FROM users WHERE id = ?";
			Connection connection = ConnectionProvider.getConnection();

			PreparedStatement statement = connection.prepareStatement(sqlQuery);

			statement.setInt(1, user.getId());

			double resultsTemp = 0.0;

			ResultSet results = statement.executeQuery();

			results.next();

			resultsTemp = results.getDouble("budget");

			return resultsTemp;

		} catch (Exception e) {

			throw new MissingDataException(e);

		}

	}

	public double hasMoneyByID(int id) {

		try {

			String sqlQuery = "SELECT budget FROM users WHERE id = ?";
			Connection connection = ConnectionProvider.getConnection();

			PreparedStatement statement = connection.prepareStatement(sqlQuery);

			statement.setInt(1, id);

			double resultsTemp = 0.0;

			ResultSet results = statement.executeQuery();

			results.next();

			resultsTemp = results.getDouble("budget");

			return resultsTemp;

		} catch (Exception e) {

			throw new MissingDataException(e);

		}

	}

	public double hasTime(User user) {

		try {

			String sqlQuery = "SELECT time FROM users WHERE id = ?";
			Connection connection = ConnectionProvider.getConnection();

			PreparedStatement statement = connection.prepareStatement(sqlQuery);

			statement.setInt(1, user.getId());

			double resultsTemp = 0.0;

			ResultSet results = statement.executeQuery();

			results.next();

			resultsTemp = results.getDouble("time");

			return resultsTemp;

		} catch (Exception e) {

			throw new MissingDataException(e);

		}

	}

	public double hasTimeByID(int id) {

		try {

			String sqlQuery = "SELECT time FROM users WHERE id = ?";
			Connection connection = ConnectionProvider.getConnection();

			PreparedStatement statement = connection.prepareStatement(sqlQuery);

			statement.setInt(1, id);

			double resultsTemp = 0.0;

			ResultSet results = statement.executeQuery();

			results.next();

			resultsTemp = results.getDouble("time");

			return resultsTemp;

		} catch (Exception e) {

			throw new MissingDataException(e);

		}

	}

	public Boolean hasTheAttraction(User user, Attraction attraction) {

		try {

			String sqlQuery = "SELECT 1 FROM itinerary_shopping WHERE fk_id_user = ? AND fk_id_attraction = ?";

			Connection connection = ConnectionProvider.getConnection();

			PreparedStatement statement = connection.prepareStatement(sqlQuery);

			statement.setInt(1, user.getId());
			statement.setInt(2, attraction.getId());

			ResultSet results = statement.executeQuery();

			boolean resultsTemp = results.next();

			return resultsTemp;

		} catch (Exception e) {

			throw new MissingDataException(e);

		}

	}

	public Boolean hasThePromotion(User user, Promotion promotion) {

		try {

			String sqlQuery = "SELECT 1 FROM itinerary_shopping WHERE fk_id_user = ? AND fk_id_promotion = ?";

			Connection connection = ConnectionProvider.getConnection();

			PreparedStatement statement = connection.prepareStatement(sqlQuery);

			statement.setInt(1, user.getId());
			statement.setInt(2, promotion.getId());

			ResultSet results = statement.executeQuery();

			boolean resultsTemp = results.next();

			return resultsTemp;

		} catch (Exception e) {

			throw new MissingDataException(e);

		}

	}

	private User toUser(ResultSet results) {

		try {

			// User( Integer id, String name, Double budget, Double time, int
			// if_preference_type AttractionType(preference))
			return new User(results.getInt(1), results.getString(2), results.getDouble(3), results.getDouble(4),
					results.getInt(5), AttractionType.valueOf(results.getString(6)));

		} catch (Exception e) {

			throw new MissingDataException(e);

		}

	}

	public int unsubscribe(User user) {

		try {

			String sqlQuery = "UPDATE users SET state = 0 WHERE id = ?";
			Connection connection = ConnectionProvider.getConnection();

			PreparedStatement statement = connection.prepareStatement(sqlQuery);

			statement.setInt(1, user.getId());

			int rowsUpdate = statement.executeUpdate();

			return rowsUpdate;

		} catch (Exception e) {

			throw new MissingDataException(e);

		}

	}

	public int subscribe(User user) {

		try {

			String sqlQuery = "UPDATE users SET state = 1 WHERE id = ?";
			Connection connection = ConnectionProvider.getConnection();

			PreparedStatement statement = connection.prepareStatement(sqlQuery);

			statement.setInt(1, user.getId());

			int rowsUpdate = statement.executeUpdate();

			return rowsUpdate;

		} catch (Exception e) {

			throw new MissingDataException(e);

		}

	}

	public int setAdmin(User user) {

		try {

			String sqlQuery = "UPDATE users SET state = 2 WHERE id = ?";
			Connection connection = ConnectionProvider.getConnection();

			PreparedStatement statement = connection.prepareStatement(sqlQuery);

			statement.setInt(1, user.getId());

			int rowsUpdate = statement.executeUpdate();

			return rowsUpdate;

		} catch (Exception e) {

			throw new MissingDataException(e);

		}

	}

	public String getPassword(User user) {

		try {
			String sqlQuery = "SELECT password FROM users WHERE id = ?";
			Connection connection = ConnectionProvider.getConnection();

			PreparedStatement statement = connection.prepareStatement(sqlQuery);
			statement.setInt(1, user.getId());
			ResultSet result = statement.executeQuery();

			return result.getString(1);

		} catch (Exception e) {

			throw new MissingDataException(e);

		}
	}

	@Override
	public User findByUsername(String username) {
		try {

			String sqlQuery = "SELECT users.id, users.name, budget, time, attraction_type.id, attraction_type.name AS preference\n"
					+ "FROM users\n"
					+ "INNER JOIN attraction_type ON users.fk_id_preference = attraction_type.id\n"
					+ "WHERE users.name = ?";
			Connection conn = ConnectionProvider.getConnection();

			PreparedStatement statement = conn.prepareStatement(sqlQuery);
			statement.setString(1, username.toLowerCase().trim());
			ResultSet resultados = statement.executeQuery();

			User user = null;

			if (resultados.next()) {
				user = toUser(resultados);
			}
			return user;

		} catch (Exception e) {

			throw new MissingDataException(e);

		}
	}

}
