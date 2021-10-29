package Model;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import dao.DAOFactory;
import dao.UserDAO;
import model.User;

public class UserTest {

	
	@Test
	public void insertAnUserTest() throws SQLException {
		
		//User userTest = null;
		
		UserDAO userDAO = DAOFactory.getUserDAO();
		
		System.out.println("Incertar el Usuario: 'UsuarioTest'");
		User userTemp = new User("UsuarioTest",8,8,1);
		userDAO.insert(userTemp);
		
		System.out.println(userDAO.findById(userDAO.getLastUser().getId()));
		
		userTemp = userDAO.getLastUser();
		
		assertEquals("UsuarioTest", userTemp.getName());
											
	}
	
	
		
	@Test
	public void updateAnUserTest() throws SQLException {
		
		UserDAO userDAO = DAOFactory.getUserDAO();
		
		System.out.println("Modificar el Usuario ID 'N'");
		
		User userTestUpdate = userDAO.findById(11);
		System.out.println(userTestUpdate);		
		userTestUpdate.setName("CambiamosDeNombre");
		userDAO.update(userTestUpdate);
		
		
		userTestUpdate = userDAO.findById(11);
		System.out.println(userTestUpdate);		
		userTestUpdate.setName("Boromir");
		userDAO.update(userTestUpdate);
		System.out.println(userTestUpdate);
		
		//assertEquals(1, userDAO.insert(userTest));
			
	}
	
	
	
	@Test
	public void findByIDUserTest() throws SQLException {
		
		UserDAO userDAO = DAOFactory.getUserDAO();
		
		System.out.println("Encontrar el Usuario ID: '1'");
		
		assertEquals("Eowyn", userDAO.findById(1).getName());
		
		System.out.println(userDAO.findById(1));
							
	}
	
	/*
	@Test
	public void findALLUsersTest() throws SQLException {
		
		UserDAO userDAO = DAOFactory.getUserDAO();
				
		for (User user : userDAO.findAll()) { 
			
			System.out.println(user);
		
		}		
											
	}
	*/

}
