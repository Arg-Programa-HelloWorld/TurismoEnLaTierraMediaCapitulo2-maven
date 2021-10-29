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
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
											
	}
	
	
			
	@Test
	public void updateAnUserTest() throws SQLException {
		
		UserDAO userDAO = DAOFactory.getUserDAO();
		
		System.out.println("Modificar el Usuario ID 'Nº 1'");
		
		User userTestUpdate = userDAO.findById(1);						// buscamos el usuario Nº 1
		System.out.println(userTestUpdate);								// lo mostramos
		
		assertEquals("Eowyn-Normal", userTestUpdate.getName());			// comparamos con quien sabemos que es!!
		
		userTestUpdate.setName("CambiamosDeNombre");					// le seteamos un nuevo nombre
		userDAO.update(userTestUpdate);									// hacemos el update a la BDD
		
		assertEquals("CambiamosDeNombre", userTestUpdate.getName());	// comparamos que quedo como estaba!!
		
		userTestUpdate = userDAO.findById(1);							// volvemos a vuscar al usuario Nº 1						
		System.out.println(userTestUpdate);								// lo mostramos
		
		userTestUpdate.setName("Eowyn-Normal");							// le seteamos el nombre que tenia
		userDAO.update(userTestUpdate);									// hacemos el update a la BDD
		System.out.println(userTestUpdate);								// lo mostramos
		
		assertEquals("Eowyn-Normal", userTestUpdate.getName());			// comparamos que quedo como estaba!!
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
			
	}
	
	
		
	@Test
	public void findByIDUserTest() throws SQLException {
		
		UserDAO userDAO = DAOFactory.getUserDAO();
		
		System.out.println("Encontrar el Usuario ID: '1'");
		
		assertEquals("Eowyn-Normal", userDAO.findById(1).getName());
		
		System.out.println(userDAO.findById(1));
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
							
	}
	
	
		
	@Test
	public void findALLUsersTest() throws SQLException {
		
		UserDAO userDAO = DAOFactory.getUserDAO();
		
		System.out.println("Ver todos los Usuarios");
				
		for (User user : userDAO.findAll()) { 
			
			System.out.println(user);
		
		}
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
											
	}
	
	
	
	@Test
	public void deleteAnUserTest() throws SQLException {
		
		int cantidadAntes = 0;
		int cantidadLuego = 0;
		
		UserDAO userDAO = DAOFactory.getUserDAO();
		
		cantidadAntes = userDAO.countAll();
		
		System.out.println("Incertar el Usuario: 'UsuarioTest'");
		User userTemp = new User("UsuarioTest",8,8,1);
		userDAO.insert(userTemp);
		
		assertEquals("UsuarioTest", userDAO.getLastUser().getName());
		
		userDAO.delete(userDAO.getLastUser());
		
		cantidadLuego = userDAO.countAll();
		
		assertEquals(cantidadAntes, cantidadLuego);
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
							
	}
	
}