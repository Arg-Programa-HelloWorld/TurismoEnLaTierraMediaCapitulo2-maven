package model;

import java.sql.SQLException;
import java.util.Collections;

public class Functions {

	public static boolean dataLoader() throws SQLException {
		  
		View.dataLoaderMenu();
		
		//return LoadUsers.readUsersFile() && LoadAttractions.readAttractionsFile() && LoadPromotions.readPromotionsFile();
		
		return LoadUsers.readUsersFile();
		
	}	

}