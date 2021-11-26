package model;

import java.util.ArrayList;

import dao.AttractionDAO;
import dao.DAOFactory;
import dao.MissingDataException;

public class LoadAttractions {

	private static ArrayList<Attraction> attractionList = new ArrayList<Attraction>();
	
	public static boolean readAttractionsBDD() {
		
		try {
			
			AttractionDAO attractionDAO = DAOFactory.getAttractionDAO();
						
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