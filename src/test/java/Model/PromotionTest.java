package Model;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import dao.DAOFactory;
import dao.PromotionDAO;
import dao.UserDAO;
import model.Promotion;
import model.PromotionAbsolute;
import model.PromotionAyB;
import model.PromotionPercentage;
import model.User;

public class PromotionTest {


	@Test
	public void insertAPromotionPercentageTest() throws SQLException {

		PromotionDAO promotionDAO = DAOFactory.getPromotionDAO();

		System.out.println("Insertar la Promotion 'Pack Promo Porcentaje'");
		// (String name, double time, double cost, double discount, int promotionTypeID)
		Promotion promotionTemp = new PromotionPercentage("Pack Promo Porcentaje", 0, 0, 10, 1);
		promotionDAO.insert(promotionTemp);

		System.out.println();

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------");

	}
	
	@Test
	public void insertAPromotionAbsoluteTest() throws SQLException {

		PromotionDAO promotionDAO = DAOFactory.getPromotionDAO();

		System.out.println("Insertar la Promotion 'Pack Promo Absoluta'");
		// (String name, double time, double cost, double discount, int promotionTypeID)
		Promotion promotionTemp = new PromotionAbsolute("Pack Promo Absoluta", 0, 0, 4, 2);
		promotionDAO.insert(promotionTemp);

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------");

	}
/*
	@Test
	public void insertAPromotionAyBTest() throws SQLException {

		PromotionDAO promotionDAO = DAOFactory.getPromotionDAO();

		System.out.println("Insertar la Promotion 'Pack Promo A & B'");
		// (String name, double time, double cost, double discount, int promotionTypeID)
		//(String name, double time, double cost, double discount, int promotionTypeID)
		Promotion promotionTempAyB = new PromotionAyB("Pack Promo A & B", 0, 0, 0, 3);
		promotionDAO.insert(promotionTempAyB);

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------");

	}
*/
	@Test
	public void findByIDPromotionTest() throws SQLException {

		PromotionDAO promotionDAO = DAOFactory.getPromotionDAO();

		System.out.println("Encontrar la Promocion con el 'ID: Nº1'");

		System.out.println(promotionDAO.findById(1));

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------");

	}


	@Test
	public void findALLPromotionTest() throws SQLException {

		PromotionDAO promotionDAO = DAOFactory.getPromotionDAO();

		System.out.println("Ver todas las Promociones");

		for (Promotion promotionTemp : promotionDAO.findAll()) {

			System.out.println(promotionTemp);

		}

		//System.out.println(promotionDAO.findAll()); // de esta forma las vemos todas en una sola linea

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------");

	}


	@Test
	public void updateAnPromotionTest() throws SQLException {

		PromotionDAO promotionDAO = DAOFactory.getPromotionDAO();

		System.out.println("Modificar la Promocion ID 'Nº 1'");
		Promotion promotionTemptUpdate = promotionDAO.findById(1); // buscamos la atraccion Nº 1
		System.out.println(promotionTemptUpdate); // la mostramos

		assertEquals("Pack Aventura", promotionTemptUpdate.getName());

		promotionTemptUpdate.setName("CambiamosDeNombreALaPromocion"); // le seteamos otro nombre
		promotionDAO.update(promotionTemptUpdate); // hacemos el update a la BDD

		assertEquals("CambiamosDeNombreALaPromocion", promotionTemptUpdate.getName());

		promotionTemptUpdate = promotionDAO.findById(1); // volvemos a buscar la atraccion
		System.out.println(promotionTemptUpdate); // la mostramos

		promotionTemptUpdate.setName("Pack Aventura"); // le seteamos el nombre que tenia
		promotionDAO.update(promotionTemptUpdate); // hacemos el update a la BDD
		System.out.println(promotionTemptUpdate); // la mostramos

		assertEquals("Pack Aventura", promotionTemptUpdate.getName());

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------");

	}



	@Test
	public void deleteAPromotionTest() throws SQLException {

		int cantidadAntes = 0;
		int cantidadLuego = 0;

		PromotionDAO promotionDAO = DAOFactory.getPromotionDAO();

		cantidadAntes = promotionDAO.countAll();

		System.out.println("Insertar una Promocion: 'Promocion Test Para Eliminar'");
		Promotion promotionTemp = new PromotionPercentage("Promocion Test Para Eliminar", 0, 0, 10, 1);
		promotionDAO.insert(promotionTemp);
		System.out.println(promotionDAO.getLastPromotion());

		assertEquals("Promocion Test Para Eliminar", promotionDAO.getLastPromotion().getName());

		System.out.println("Promocion Test eliminada: " + promotionDAO.delete(promotionDAO.getLastPromotion()));

		cantidadLuego = promotionDAO.countAll();

		assertEquals(cantidadAntes, cantidadLuego);

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------");

	}



	@Test
	public void getLastPromotionTest() throws SQLException {

		PromotionDAO promotionDAO = DAOFactory.getPromotionDAO();

		System.out.println("Conocer la ultima Promocion ingresada");

		System.out.println(promotionDAO.getLastPromotion());

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------");

	}


}