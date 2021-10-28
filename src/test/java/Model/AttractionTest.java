package Model;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import dao.AttractionDAO;
import dao.DAOFactory;
import model.AttractionType;

public class AttractionTest {

	@Test
	public void crearUnaAtraccionTest() throws SQLException {
		
		AttractionDAO attractionDAO = DAOFactory.getAttractionDAO();
		System.out.println("Ver todas las Atracciones");
		System.out.println(attractionDAO.findAll());
		
		//UserDAO userDAO = DAOFactory.getUserDAO();
		
		//System.out.println("Incertar el Usuario: 'UsuarioTest'");
		//User userTest = new User("UsuarioTest",8,8,1);
		//userDAO.insert(userTest);
		
		//assertEquals(1, userDAO.insert(userTest));
		
		//System.out.println(userTest);							
	}
		
}
