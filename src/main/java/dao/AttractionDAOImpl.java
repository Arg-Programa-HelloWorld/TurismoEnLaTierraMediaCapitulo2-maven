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

public class AttractionDAOImpl implements AttractionDAO {

	public int insert(Attraction attraction) {

	try {
			
			String sqlQuery = "INSERT INTO attractions (name, cost, time, quota, fk_id_attraction_type) VALUES (?,?,?,?,?)";
			Connection connection = ConnectionProvider.getConnection();
			
			PreparedStatement statement = connection.prepareStatement(sqlQuery);
			
			statement.setString(1, attraction.getName());
			statement.setDouble(2, attraction.getCost());
			statement.setDouble(3, attraction.getTime());
			statement.setDouble(4, attraction.getQuota());
			statement.setInt(5, attraction.getId());
			
			int rowsInsert = statement.executeUpdate();
				
			return rowsInsert;
			
			
		} catch (Exception e) {
			
			throw new MissingDataException(e);
			
		}
	
	}

	public int update(Attraction t) {

		return 0;
	}

	public int delete(Attraction t) {

		return 0;
	}

	public Attraction findById(int attractionID) {

		try {
			
			String sql = "SELECT attractions.id, attractions.name, attractions.cost, attractions.time, attractions.quota, attractions_type.id, attractions_type.name AS preference\n"
					+ "FROM attractions\n"
					+ "INNER JOIN attractions_type ON attractions.fk_id_attraction_type = attractions_type.id\n"
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

	public List<Attraction> findAll() {

		try {
			
			String sqlQuery = "SELECT attractions.id, attractions.name, attractions.cost, attractions.time, attractions.quota, attractions_type.id, attractions_type.name AS preference\n"
					+ "FROM attractions\n"
					+ "INNER JOIN attractions_type ON attractions.fk_id_attraction_type = attractions_type.id";
			Connection connection = ConnectionProvider.getConnection();
			PreparedStatement statement = connection.prepareStatement(sqlQuery);
			ResultSet results = statement.executeQuery();
			
			List<Attraction> attraction = new LinkedList<Attraction>();
			while (results.next()) {
			
				attraction.add(toAttraction(results));
			}
			
			return attraction; // Lista de Usuarios.-
						
			
		} catch (Exception e) {
			
			throw new MissingDataException(e);
			
		}
		
	}

	public int countAll() {

		return 0;
	}	
	
	private Attraction toAttraction(ResultSet results) throws SQLException {
		//Attraction(         Integer id,        String name,         Double cost,         Double time,         Integer quota     Integer fk_id_preference)                AttractionType attractionType
		return new Attraction(results.getInt(1), results.getString(2),results.getDouble(3),results.getDouble(4),results.getInt(5),results.getInt(6),AttractionType.valueOf(results.getString(7)));
	}
		
}



































