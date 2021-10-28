package app;

import java.sql.SQLException;

import dao.AttractionDAO;
import dao.DAOFactory;
import dao.UserDAO;
import model.User;

public class App {

	public static void main(String[] args) throws SQLException {
		
		UserDAO userDAO = DAOFactory.getUserDAO();
		
		//Obtener el Usuario 1
		//System.out.println("Obtener el usuario ID Nº: '1'");
		//System.out.println(userDAO.findById(1));
		
		//System.out.println("Ver todas los Usuarios");
		//System.out.println(userDAO.findAll());
		//System.out.println("-----------------------------------------------------------------------------");
		
		//System.out.println("Incertar el Usuario: Titi");
		//User alf = new User("Mandraque",80,40,1);
		//userDAO.insert(alf);
		//System.out.println("-----------------------------------------------------------------------------");
		
		
		/*
		User tempUser = userDAO.findById(108);
		tempUser.setName("Cachirlo");
		userDAO.update(tempUser);
		System.out.println(userDAO.findById(108));
		System.out.println("-----------------------------------------------------------------------------");
		*/
		
		
		/*
		AttractionDAO attractionDAO = DAOFactory.getAttractionDAO();
		System.out.println("Ver todas las Atracciones");
		System.out.println(attractionDAO.findAll());
		*/
		
		
		/*
		Pharmacy tempPharmacy;
		
		PharmacyDAO pharmacyDAO = new PharmacyDAO();
		System.out.println("Ver todas las Farmacias");
		System.out.println(pharmacyDAO.findALL());
		System.out.println("-----------------------------------------------------------------------------");
		
		System.out.println("Contar la cantidad de Farmacias");
		System.out.println(pharmacyDAO.countALL());
		System.out.println("-----------------------------------------------------------------------------");
		
		System.out.println("Obtener la siguiente farmacia: Farmacia Jaime ");
		System.out.println(pharmacyDAO.findByPharmacyName("Farmacia Jaime"));
		System.out.println("-----------------------------------------------------------------------------");
		
		System.out.println("Incertar la farmacia: Curita");
		Pharmacy curita = new Pharmacy("Curita","entre aca y alla","0800 1245",-2f,-3f,0,0);
		pharmacyDAO.insert(curita);
		System.out.println("-----------------------------------------------------------------------------");
		
		System.out.println("Contar la cantidad de Farmacias");
		System.out.println(pharmacyDAO.countALL());
		System.out.println("-----------------------------------------------------------------------------");
		
		System.out.println("Obtener la siguiente farmacia: Farmacia Curita ");
		System.out.println(pharmacyDAO.findByPharmacyName("Curita"));
		System.out.println("-----------------------------------------------------------------------------");
		
		System.out.println("Modificar nombre de la Farmacia 'Curita' a Farmacia Curita");
		System.out.println(pharmacyDAO.findByPharmacyName("Curita"));
		tempPharmacy = pharmacyDAO.findByPharmacyName("Curita");
		tempPharmacy.setName("Farmacia Curita");
		pharmacyDAO.update(tempPharmacy);
		System.out.println("-----------------------------------------------------------------------------");
		
		System.out.println("Eliminar la Farmacia 'Curita'");
		tempPharmacy = pharmacyDAO.findByPharmacyName("Curita");
		//System.out.println(pharmacyDAO.delete(tempPharmacy));
		System.out.println("-----------------------------------------------------------------------------");
		
		System.out.println("Contar la cantidad de Farmacias");
		System.out.println(pharmacyDAO.countALL());
		*/
		
			
	}
		
}
