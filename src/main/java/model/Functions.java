package model;

import java.sql.SQLException;

import dao.AttractionDAO;
import dao.DAOFactory;
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
          
    	LoadUsers.readUsersBDD();
        LoadAttractions.readAttractionsBDD();
        LoadPromotions.readPromotionsBDD();
        
        return true;
                
    }
    
}