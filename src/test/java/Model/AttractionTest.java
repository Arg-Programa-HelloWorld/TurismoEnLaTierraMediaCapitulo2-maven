package Model;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import dao.AttractionDAO;
import dao.DAOFactory;
import dao.UserDAO;
import model.Attraction;

public class AttractionTest {

	/*
	@Test
	public void insertAnAtraccionTest() throws SQLException {
		
		AttractionDAO attractionDAO = DAOFactory.getAttractionDAO();
		
		System.out.println("Insertar una Atraccion");
		Attraction attractionTemp = new Attraction("Parth Galen",7,5,6,3);
		attractionDAO.insert(attractionTemp);
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
						
	}
	*/
	
	/*
	@Test
	public void updateAnAttractionTest() throws SQLException {
		
		AttractionDAO attractionDAO = DAOFactory.getAttractionDAO();
		
		System.out.println("Modificar la atraccion ID 'Nº 1'");
		Attraction attractionTemptUpdate = attractionDAO.findById(11);	// buscamos la atraccion
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
	*/
	
	/*
	@Test
	public void findByIDAttractionTest() throws SQLException {
		
		AttractionDAO attractionDAO = DAOFactory.getAttractionDAO();
		
		System.out.println("Encontrar la Atraccion con el ID: '1' y el nombre de 'Moria'");
		
		assertEquals("Moria", attractionDAO.findById(1).getName());
		
		System.out.println(attractionDAO.findById(1));
							
	}
	*/
	
	/*
	@Test
	public void findALLAtraccionTest() throws SQLException {
		
		AttractionDAO attractionDAO = DAOFactory.getAttractionDAO();
		System.out.println("Ver todas las Atracciones");
		System.out.println(attractionDAO.findAll());
						
	}
	*/
}
