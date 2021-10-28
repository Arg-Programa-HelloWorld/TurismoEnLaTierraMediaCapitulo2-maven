
package model;

import java.io.IOException;
import java.sql.SQLException;

public class App {
	
    public static void main(String[] args) throws IOException, SQLException {

    	boolean dataUploadSupervisor;

		dataUploadSupervisor = Functions.dataLoader();

		if (dataUploadSupervisor) {

			View.ready();
				
			Model.menu();

		} else {

			View.warning();

		}

	}

}