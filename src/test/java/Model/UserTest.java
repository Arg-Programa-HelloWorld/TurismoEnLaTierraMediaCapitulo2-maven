package Model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;

import org.junit.Assert;
import org.junit.Test;

import dao.AttractionDAO;
import dao.DAOFactory;
import dao.PromotionDAO;
import dao.UserDAO;
import manager.UserManager;
import model.Attraction;
import model.Promotion;
import model.User;
import service.LoginService;
import utils.Crypt;

public class UserTest {

	
	UserDAO userDAO = DAOFactory.getUserDAO();

	// OK
	@Test
	public void insertAnUserTest() throws SQLException {

		// User userTest = null;

		// UserDAO userDAO = DAOFactory.getUserDAO();

		System.out.println("Insertar el Usuario: 'UsuarioTest'");
		User userTemp = new User("UsuarioTest", "123", 8, 8, 1);
		userDAO.insert(userTemp);

		System.out.println(userDAO.findById(userDAO.getLastUser().getId()));

		userTemp = userDAO.getLastUser();

		assertEquals("UsuarioTest", userTemp.getName());

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------");

	}

	// OK
	@Test
	public void updateAnUserTest() throws SQLException {

		// UserDAO userDAO = DAOFactory.getUserDAO();

		System.out.println("Modificar el Usuario ID 'Nº 1'");

		User userTestUpdate = userDAO.findById(1); // buscamos el usuario Nº 1
		System.out.println(userTestUpdate); // lo mostramos

		assertEquals("admin", userTestUpdate.getName()); // comparamos con quien sabemos que es!!

		userTestUpdate.setName("CambiamosDeNombre"); // le seteamos un nuevo nombre
		userDAO.update(userTestUpdate); // hacemos el update a la BDD

		assertEquals("CambiamosDeNombre", userTestUpdate.getName()); // comparamos que quedo como estaba!!

		userTestUpdate = userDAO.findById(1); // volvemos a vuscar al usuario Nº 1
		System.out.println(userTestUpdate); // lo mostramos

		userTestUpdate.setName("admin"); // le seteamos el nombre que tenia
		userDAO.update(userTestUpdate); // hacemos el update a la BDD
		System.out.println(userTestUpdate); // lo mostramos

		assertEquals("admin", userTestUpdate.getName()); // comparamos que quedo como estaba!!

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------");

	}

	// OK
	@Test
	public void findByIDUserTest() throws SQLException {

		// UserDAO userDAO = DAOFactory.getUserDAO();

		System.out.println("Encontrar el Usuario ID: '1'");

		assertEquals("admin", userDAO.findById(1).getName());

		System.out.println(userDAO.findById(1));

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------");

	}

	// Ok
	@Test
	public void findALLUsersTest() throws SQLException {

		// UserDAO userDAO = DAOFactory.getUserDAO();

		System.out.println("Ver todos los Usuarios");

		for (User user : userDAO.findAll()) {

			System.out.println(user);

		}

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------");

	}

	// OK
	@Test
	public void deleteAnUserTest() throws SQLException {

		int cantidadAntes = 0;
		int cantidadLuego = 0;

		// UserDAO userDAO = DAOFactory.getUserDAO();

		cantidadAntes = userDAO.countAll();

		System.out.println("Insertar el Usuario: 'Usuario Test Para Eliminar'");
		User userTemp = new User("Usuario Test Para Eliminar", "", 100, 100, 1);
		userDAO.insert(userTemp);
		System.out.println(userDAO.getLastUser());

		assertEquals("Usuario Test Para Eliminar", userDAO.getLastUser().getName());

		System.out.println("Usuario eliminado: " + userDAO.delete(userDAO.getLastUser()));

		cantidadLuego = userDAO.countAll();

		assertEquals(cantidadAntes, cantidadLuego);

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------");

	}

	// OK
	@Test
	public void getLastUserTest() throws SQLException {

		// UserDAO userDAO = DAOFactory.getUserDAO();

		System.out.println("Conocer el ultimo Usuario ingresado");

		System.out.println(userDAO.getLastUser());

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------");

	}

	// OK
	@Test
	public void buyAttractionTest() throws SQLException {

		// UserDAO userDAO = DAOFactory.getUserDAO();

		AttractionDAO attractionDAO = DAOFactory.getAttractionDAO();

		User userTemp = userDAO.findById(1);

		Attraction attractionTemp = attractionDAO.findById(1);

		int rows = userDAO.buyAttraction(userTemp, attractionTemp);
		assertEquals(1, rows);

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------");

	}

	// OK
	@Test
	public void buyPromotionTest() throws SQLException {

		// UserDAO userDAO = DAOFactory.getUserDAO();

		PromotionDAO promotionDAO = DAOFactory.getPromotionDAO();

		User userTemp = userDAO.findById(1);

		Promotion promotionTemp = promotionDAO.findById(1);

		int rows = userDAO.buyPromotion(userTemp, promotionTemp);

		assertEquals(1, rows);

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------");

	}

	// OK
	@Test
	public void hasMoneyTest() throws SQLException {

		// UserDAO userDAO = DAOFactory.getUserDAO();

		User userTemp = userDAO.findById(1);

		System.out.println(
				"El usuario " + userTemp.getName() + " cuenta con un saldo de $: " + userDAO.hasMoney(userTemp));

		// assertEquals(1, rows);
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------");

	}

	// OK
	@Test
	public void hasTimeTest() throws SQLException {

		// UserDAO userDAO = DAOFactory.getUserDAO();

		User userTemp = userDAO.findById(2);

		System.out.println(
				"El usuario " + userTemp.getName() + " cuenta con un tiempo de Hs: " + userDAO.hasTime(userTemp));

		// assertEquals(1, rows);
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------");

	}

	// OK
	@Test
	public void hasTheAttractionTest() throws SQLException {

		// UserDAO userDAO = DAOFactory.getUserDAO();

		AttractionDAO attractionDAO = DAOFactory.getAttractionDAO();

		User userTemp = userDAO.findById(1);

		Attraction attractionTemp = attractionDAO.findById(1);

		Boolean results = userDAO.hasTheAttraction(userTemp, attractionTemp);

		System.out.println("El usuario " + userTemp.getName() + " tiene la Atraccion '" + attractionTemp.getName()
				+ "' [true/false]: " + results);

		assertTrue(results);

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------");

	}

	@Test
	public void hasThePromotionTest() throws SQLException {

		// UserDAO userDAO = DAOFactory.getUserDAO();

		PromotionDAO promotionDAO = DAOFactory.getPromotionDAO();

		User userTemp = userDAO.findById(1);

		Promotion promotionTemp = promotionDAO.findById(1);

		Boolean results = userDAO.hasThePromotion(userTemp, promotionTemp);
		// boolean attractionID = userDAO.hasThePromotion(userTemp, promotionTemp);

		System.out.println("El usuario " + userTemp.getName() + " tiene la Promocion '" + promotionTemp.getName()
				+ "' [true/false]: " + results);

		assertTrue(results);

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------");

	}

	@Test
	public void findByUsernameTest() throws SQLException {

		UserDAO userDAO = DAOFactory.getUserDAO();

		LoginService loginService = null;

		String username = "admin";
		String password = "admin";

		User userTemp = userDAO.findByUsername(username);

		System.out.println("Buscar un usuario por su Nombre");

		System.out.println(userTemp);

		assertEquals(password, userTemp.getPassword());

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------");

	}
	
	@Test
	public void findByUsernameTest2() throws SQLException {

		UserDAO userDAO = DAOFactory.getUserDAO();

		LoginService loginService = null;

		String username = "Sam";
		String password = "123";

		User userTemp = userDAO.findByUsername(username);

		System.out.println("Buscar un usuario por su Nombre");

		System.out.println(userTemp);

		assertEquals(password, userTemp.getPassword());

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------");

	}
	
	@Test
	public void isAdminTest() {
		
		UserDAO userDAO = DAOFactory.getUserDAO();
		
		User user1 = userDAO.findByUsername("admin");
		User user2 = userDAO.findById(2);
		
		assertTrue(user1.isAdmin());
		assertFalse(user2.isAdmin());
	}
	
	
	@Test
	public void testMatch() {
		
		String password;

		UserDAO userDAO = DAOFactory.getUserDAO();
		
		User userTest = userDAO.findById(23);
		
		password = userTest.getPassword(); 
		
		Object passCryptTemp = Crypt.hash(password);
		
		System.out.println(passCryptTemp);
		
		Assert.assertTrue(Crypt.match(password, Crypt.hash(password)));
			
	}

}