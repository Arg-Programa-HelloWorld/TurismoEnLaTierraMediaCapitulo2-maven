package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class ConnectionProvider {

	private static String url = "jdbc:sqlite:db/tourism_in_the_middle_earth.db";
	private static Connection connection;
	
	public static Connection getConnection() throws SQLException {
		
		if (connection == null) {
			connection = DriverManager.getConnection(url); 
		}		
				
		return connection;
	}

}
