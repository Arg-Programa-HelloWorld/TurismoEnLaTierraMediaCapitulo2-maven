package Model;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import dao.DAOFactory;
import dao.UserDAO;
import model.User;

public class UserTest {

	@Test
	public void insertUserTest() throws SQLException {
		
		User userTest = null;
		
		UserDAO userDAO = DAOFactory.getUserDAO();
		
		System.out.println("Incertar el Usuario: 'UsuarioTest'");
		userTest = new User("UsuarioTest",8,8,1);
		userDAO.insert(userTest);
		
		assertEquals(1, userDAO.insert(userTest));
		
		System.out.println(userTest);							
	}
	
	@Test
	public void updateUserTest() throws SQLException {
		
		//User userTestUpdate = null;
		
		UserDAO userDAO = DAOFactory.getUserDAO();
		
		System.out.println("Modificar el Usuario ID '13'");
		
		User userTestUpdate = userDAO.findById(180);
		System.out.println(userTestUpdate);
		
		userTestUpdate.setName("CambiamosDeNombre");
		
		userDAO.update(userTestUpdate);
			
		System.out.println(userDAO.findById(180));
		
		//assertEquals(1, userDAO.insert(userTest));
		
		System.out.println(userTestUpdate);							
	}
	
	
	@Test
	public void findByIDTest() throws SQLException {
		
		UserDAO userDAO = DAOFactory.getUserDAO();
		
		System.out.println("Encontrar el Usuario ID: '1'");
		
		assertEquals("Eowyn", userDAO.findById(1).getName());
		
		System.out.println(userDAO.findById(1));
							
	}

}
