package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import jdbc.ConnectionProvider;
import model.Attraction;

public class AttractionDAOImpl implements AttractionDAO {

	public int insert(Attraction t) {

		return 0;
	}

	public int update(Attraction t) {

		return 0;
	}

	public int delete(Attraction t) {

		return 0;
	}

	public Attraction findById(int attractionID) {

		try {
			
			String sql = "SELECT * FROM attractions WHERE id = ?";
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
			
			String sqlQuery = "SELECT * FROM attractions";
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
		//Attraction(         Integer id,        String name,         Double cost,         Double time,         Integer quota     Integer fk_id_preference)
		return new Attraction(results.getInt(1), results.getString(2),results.getDouble(3),results.getDouble(4),results.getInt(5),results.getInt(6));
	}
		
}
