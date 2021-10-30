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

public class PromotionTest {

	/*
	@Test
	public void insertAPromotionPercentageTest() throws SQLException {
		
		PromotionDAO promotionDAO = DAOFactory.getPromotionDAO();
		
		System.out.println("Insertar la Promotion 'Pack Promo Porcentaje'");
		//(String name, double time, double cost, double discount, int promotionTypeID)
		Promotion promotionTemp = new PromotionPercentage("Pack Promo Porcentaje",0,0,10,1);
		promotionDAO.insert(promotionTemp);
		
		System.out.println();
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
						
	}
	*/
	
	
	
	/*
	@Test
	public void insertAPromotionAbsoluteTest() throws SQLException {
		
		PromotionDAO promotionDAO = DAOFactory.getPromotionDAO();
		
		System.out.println("Insertar la Promotion 'Pack Promo Absoluta'");
		//(String name, double time, double cost, double discount, int promotionTypeID)
		Promotion promotionTemp = new PromotionAbsolute("Pack Promo Absoluta",0,0,4,2);
		promotionDAO.insert(promotionTemp);
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
						
	}
	*/
	
	
	
	/*
	@Test
	public void insertAPromotionAyBTest() throws SQLException {
		
		PromotionDAO promotionDAO = DAOFactory.getPromotionDAO();
		
		System.out.println("Insertar la Promotion 'Pack Promo A & B'");
		//(String name, double time, double cost, double discount, int promotionTypeID)
		Promotion promotionTemp = new PromotionAyB("Pack Promo A & B",0,0,0,3);
		promotionDAO.insert(promotionTemp);
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
						
	}
	*/
	
	
	
	
	@Test
	public void findByIDPromotionTest() throws SQLException {
		
		PromotionDAO promotionDAO = DAOFactory.getPromotionDAO();
				
		System.out.println("Encontrar la Promocion con el 'ID: Nº1'");
		
		System.out.println(promotionDAO.findById(1));
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
							
	}
	
	
	
	
	/*
	 * NO ANDA!!!
	 */
	/*
	@Test
	public void findALLAtraccionTest() throws SQLException {
		
		PromotionDAO promotionDAO = DAOFactory.getPromotionDAO();
		
		System.out.println("Ver todas las Promociones");
		
		for (Promotion promotionTemp : promotionDAO.findAll()) { 
			
			System.out.println(promotionTemp);
		
		}
		
		//System.out.println(attractionDAO.findAll());  // de esta forma las vemos todas en una sola linea
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
						
	}
	*/
	
	
	/*
	
	@Test
	public void updateAnAttractionTest() throws SQLException {
		
		AttractionDAO attractionDAO = DAOFactory.getAttractionDAO();
		
		System.out.println("Modificar la atraccion ID 'Nº 11'");
		Attraction attractionTemptUpdate = attractionDAO.findById(11);	// buscamos la atraccion Nº 1
		System.out.println(attractionTemptUpdate);						// la mostramos
		
		assertEquals("Parth Galen", attractionTemptUpdate.getName());
		
		attractionTemptUpdate.setName("CambiamosDeNombreALaAtraccion");	// le seteamos otro nombre
		attractionDAO.update(attractionTemptUpdate);					// hacemos el update a la BDD
		
		assertEquals("CambiamosDeNombreALaAtraccion", attractionTemptUpdate.getName());
		
		attractionTemptUpdate = attractionDAO.findById(11);				// volvemos a buscar la atraccion
		System.out.println(attractionTemptUpdate);						// la mostramos
		
		attractionTemptUpdate.setName("Parth Galen");					// le seteamos el nombre que tenia
		attractionDAO.update(attractionTemptUpdate);					// hacemos el update a la BDD
		System.out.println(attractionTemptUpdate);						// la mostramos
		
		assertEquals("Parth Galen", attractionTemptUpdate.getName());
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
		
	}
		
	
	
	@Test
	public void findByIDAttractionTest() throws SQLException {
		
		AttractionDAO attractionDAO = DAOFactory.getAttractionDAO();
		
		System.out.println("Encontrar la Atraccion con el ID: '1' y el nombre de 'Moria'");
		
		assertEquals("Moria", attractionDAO.findById(1).getName());
		
		System.out.println(attractionDAO.findById(1));
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
							
	}
	
	
	
	@Test
	public void findALLAtraccionTest() throws SQLException {
		
		AttractionDAO attractionDAO = DAOFactory.getAttractionDAO();
		
		System.out.println("Ver todas las Atracciones");
		
		for (Attraction attraction : attractionDAO.findAll()) { 
			
			System.out.println(attraction);
		
		}
		
		//System.out.println(attractionDAO.findAll());  // de esta forma las vemos todas en una sola linea
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
						
	}
	
	
	
	@Test
	public void deleteAttractionTest() throws SQLException {
		
		int cantidadAntes = 0;
		int cantidadLuego = 0;
		
		AttractionDAO attractionDAO = DAOFactory.getAttractionDAO();
		
		cantidadAntes = attractionDAO.countAll();
		
		System.out.println("Insertar una Atraccion");
		Attraction attractionTemp = new Attraction("AttractionTest",7,5,6,3);
		attractionDAO.insert(attractionTemp);
		
		assertEquals("AttractionTest", attractionDAO.getLastAttraction().getName());
		
		attractionDAO.delete(attractionDAO.getLastAttraction());
		
		cantidadLuego = attractionDAO.countAll();
		
		assertEquals(cantidadAntes, cantidadLuego);
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
							
	}
	*/
	
}