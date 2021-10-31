package model;

import java.sql.SQLException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import dao.AttractionDAO;
import dao.DAOFactory;
import dao.MissingDataException;
import dao.PromotionDAO;
import dao.UserDAO;

public class Functions {
    
    public static User user;
    public static UserDAO userDAO = DAOFactory.getUserDAO();
    
    public static Attraction attraction;
    public static AttractionDAO attractionDAO = DAOFactory.getAttractionDAO();
    
    public static Promotion pormotion;
    public static PromotionDAO promotionDAO = DAOFactory.getPromotionDAO();
    public static boolean dataLoader() throws SQLException {
          
        View.dataLoaderMenu();
        
        //return LoadUsers.readUsersFile() && LoadAttractions.readAttractionsFile() && LoadPromotions.readPromotionsFile();
        
        return LoadUsers.readUsersFile();
        
                
    }   
    
    public static void getUser(int idUser) {
        try {
            user = userDAO.findById(idUser);
        } catch (Exception e) {
            throw new MissingDataException(e);
        }
    }
    
    public static void getAllUser() {
        for (User u : userDAO.findAll()) {
            System.out.println("ID: " + u.getId() +"Name: " + u.getName()+ "Budget: " + u.getBudget() + "Time: " + u.getTime() + "Preference: " + u.getPreferences();
        }
    }
    
    public static void getAttractions() throws SQLException {
        for (Attraction a : attractionDAO.findAll()) {
            System.out.println("ID: " + a.getId() +"Name: " + a.getName()+ "Cost: " + a.getCost() + "Time: " + a.getTime() + "Quota: " + a.getQuota() + "Type: " + a.getAttractionType());
        }
    }
    
    public static void getPromotions() throws SQLException {
        for (Promotion p : promotionDAO.findAll()) {
            System.out.println("ID: " + p.getId() +"Name: " + p.getName()+ "Cost: " + p.getCost() + "Time: " + p.getTime() + "Type: " + p.getPromotionType());
        }
    }
    
//  public static void buyAttraction(int attractionID) throws SQLException {
//      
//      attraction = attractionDAO.findById(attractionID);
//                                                                                                          //No tiene la atracion
//      if(user.haveMoney(attraction.getCost()) && user.haveTime(attraction.getTime()) && userDAO.consultAttractions(attraction.getId()) == 0) {
//          
//          user.pay(attraction.getCost());
//          user.spendTime(attraction.getTime());
//          userDAO.buyAttraction(user, attraction);
//          userDAO.update(user);
//          
//          attraction.setQuota(attraction.getQuota() - 1);
//          attractionDAO.update(attraction);
//          
//      }
//      
//  }
    
    
}

/*package model;

import java.sql.SQLException;
import java.util.Collections;

public class Functions {

	public static boolean dataLoader() throws SQLException {
		  
		View.dataLoaderMenu();
		
		//return LoadUsers.readUsersFile() && LoadAttractions.readAttractionsFile() && LoadPromotions.readPromotionsFile();
		
		return LoadUsers.readUsersFile();
		
	}	

}
*/