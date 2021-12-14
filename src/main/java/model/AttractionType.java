
package model;

import java.util.HashMap;
import java.util.Map;

public enum AttractionType {
	
		ADVENTURE(1),	// AVENTURA,
		SCENERY(2),	// PAISAJE,
		TASTING(3);		// DEGUSTACION 
		
		private int id;
		private static final Map<Integer, AttractionType> MAP = new HashMap<Integer, AttractionType>();
		
		private AttractionType(int id) {
			this.id = id;
		}

		public int getId() {
			
			return id;
			
		}
		
		public static AttractionType fromId(int id) {
		
			return MAP.get(id);
			
		}
		
		static {
			
			for (AttractionType p :values()) {
				MAP.put(p.getId(), p);
			}
			
		}

}

// PARA USARLO DESDE AFUERA ES ALGO ASI COMO

/*
		Atraccion laComarca = new Atraccion(3, 6.5, 150, Tipo.DEGUSTACION);
		
		if (laComarca.getTipo().equals(Tipo.DEGUSTACION)) {
					
			System.out.println("ok");
			
		}
*/
