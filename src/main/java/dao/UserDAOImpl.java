package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
			
			String sqlQuery = "INSERT INTO users (name, budget, time, fk_id_preference, password) VALUES (?,?,?,?,?)";
			Connection connection = ConnectionProvider.getConnection();
			
			PreparedStatement statement = connection.prepareStatement(sqlQuery);
			
			statement.setString(1, user.getName());
			statement.setDouble(2, user.getBudget());
			statement.setDouble(3, user.getTime());
			statement.setInt(4, user.getPreferencesID());
			statement.setString(5, user.getPassword());
			
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
					+ "FROM users\n"
					+ "INNER JOIN attraction_type ON users.fk_id_preference = attraction_type.id\n"
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
					+ "FROM users\n"
					+ "INNER JOIN attraction_type ON users.fk_id_preference = attraction_type.id";
			
			Connection connection = ConnectionProvider.getConnection();
			
			PreparedStatement statement = connection.prepareStatement(sqlQuery);
			ResultSet results = statement.executeQuery();
			
			List<User> users = new LinkedList<User>();
			
			while (results.next()) {
			
				users.add(toUser(results));
			}
			
			return users; // Lista de Usuarios.-
						
			
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
            String sqlQuery = "INSERT INTO users_attractions (fk_id_user, fk_id_attraction, cost, time) VALUES(?,?,?,?)";
            Connection connection = ConnectionProvider.getConnection();
            
            PreparedStatement statement = connection.prepareStatement(sqlQuery);
            
            statement.setInt(1, user.getId());
            statement.setDouble(2, attraction.getId());
            statement.setDouble(3, attraction.getCost());
            statement.setDouble(4, attraction.getTime());
                    
            int rows = statement.executeUpdate();
                
            return rows;
            
        } catch (Exception e) {
            
        	throw new MissingDataException(e);
        	
        }
        
    }
	
	public int buyPromotion(User user, Promotion promotion) {
        
        try {
            String sqlQuery = "INSERT INTO users_promotions (fk_id_user, fk_id_promotion, time, cost, discount, saving_money) VALUES(?,?,?,?,?,?)";
            Connection connection = ConnectionProvider.getConnection();
            
            PreparedStatement statement = connection.prepareStatement(sqlQuery);
            
            statement.setInt(1, user.getId());
            statement.setInt(2, promotion.getId());
            statement.setDouble(3, promotion.getTime());
            statement.setDouble(4, promotion.getCost());
            statement.setDouble(5, promotion.getDiscount());
            statement.setDouble(6, promotion.getSaving_money());
                    
            int rows = statement.executeUpdate();
                
            return rows;
            
        } catch (Exception e) {
            
        	throw new MissingDataException(e);
        	
        }
        
    }
	
	public double haveMoney(User user) {
        
        try {
            String sqlQuery = "SELECT budget FROM users WHERE id = ?";
            Connection connection = ConnectionProvider.getConnection();
            
            PreparedStatement statement = connection.prepareStatement(sqlQuery);
            
            statement.setInt(1, user.getId());
            
            ResultSet resultados = statement.executeQuery();

			double moneyTemp = 0.0;

			if (resultados.next()) {
				moneyTemp = toMoney(resultados);
			}
			return moneyTemp;       
                                    
        } catch (Exception e) {
            
        	throw new MissingDataException(e);
        	
        }
        
    }
	
	public double haveMoneyByID(int id) {
        
		try {
            String sqlQuery = "SELECT budget FROM users WHERE id = ?";
            Connection connection = ConnectionProvider.getConnection();
            
            PreparedStatement statement = connection.prepareStatement(sqlQuery);
            
            statement.setInt(1, id);
            
            ResultSet resultados = statement.executeQuery();

			double moneyTemp = 0.0;

			if (resultados.next()) {
				moneyTemp = toMoney(resultados);
			}
			return moneyTemp;       
                                    
        } catch (Exception e) {
            
        	throw new MissingDataException(e);
        	
        }
        
    }

	public double haveTime(User user) throws SQLException {
		
		try {
            String sqlQuery = "SELECT time FROM users WHERE id = ?";
            Connection connection = ConnectionProvider.getConnection();
            
            PreparedStatement statement = connection.prepareStatement(sqlQuery);
            
            statement.setInt(1, user.getId());
            
            ResultSet resultados = statement.executeQuery();

			double moneyTemp = 0.0;

			if (resultados.next()) {
				moneyTemp = toTime(resultados);
			}
			return moneyTemp;       
                                    
        } catch (Exception e) {
            
        	throw new MissingDataException(e);
        	
        }
		
	}

	public double haveTimeByID(int id) throws SQLException {

		try {
            String sqlQuery = "SELECT time FROM users WHERE id = ?";
            Connection connection = ConnectionProvider.getConnection();
            
            PreparedStatement statement = connection.prepareStatement(sqlQuery);
            
            statement.setInt(1, id);
            
            ResultSet resultados = statement.executeQuery();

			double moneyTemp = 0.0;

			if (resultados.next()) {
				moneyTemp = toTime(resultados);
			}
			return moneyTemp;       
                                    
        } catch (Exception e) {
            
        	throw new MissingDataException(e);
        	
        }

	}
	
	private double toMoney(ResultSet results) throws SQLException {
		
		return results.getDouble(1);
	}
	
	private double toTime(ResultSet results) throws SQLException {
		
		return results.getDouble(1);
	}
			
	private User toUser(ResultSet results) throws SQLException {
		//User(         Integer id,        String name,         Double budget,       Double time,         int if_preference_type                   AttractionType(preference))
		return new User(results.getInt(1), results.getString(2),results.getDouble(3),results.getDouble(4),results.getInt(5),AttractionType.valueOf(results.getString(6)));
	}
	
}










