package model;

public enum PromotionType {
	
		PERCENTAGE,	// PORCENTUAL
		ABSOLUTE,	// ABSOLUTA
		A_AND_B		//	A & B => C gratis

}

/*
import java.util.HashMap;
import java.util.Map;

public enum PromotionType {
	PERCENTAGE(1),	// PORCENTUAL
	ABSOLUTE(2),	// ABSOLUTA
	A_AND_B(3);		//	A & B => C gratis
	
	private int id;
	private static final Map<Integer, PromotionType> MAP = new HashMap<Integer, PromotionType>();
	
	private PromotionType(int id) {
		this.id = id;
	}

	public int getId() {
		
		return id;
		
	}
	
	public static PromotionType fromId(int id) {
	
		return MAP.get(id);
		
	}
	
	static {
		
		for (PromotionType p :values()) {
			MAP.put(p.getId(), p);
		}
		
	}

}
*/