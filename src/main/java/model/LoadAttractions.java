package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import dao.DAOFactory;
import dao.MissingDataException;
import dao.UserDAO;

public class LoadAttractions {

	private static ArrayList<Attraction> attractionList = new ArrayList<Attraction>();
	
	public static boolean readAttractionsFile() {
		
		try {
			
			UserDAO userDAO = DAOFactory.getUserDAO();
						
			for (Attraction attraction : attractionDAO.findAll()) { 
					
				setAttractionList(attraction);
									
			}
		
			return true;
		
		} catch (Exception e) {
			
			throw new MissingDataException(e);
			
		}

	}
	
	protected static ArrayList<Attraction> getAttractionList() {
		
		return attractionList;
		
	}

	protected static void setAttractionList(Attraction attraction) {
		
		attractionList.add(attraction);
		
	}
	
}