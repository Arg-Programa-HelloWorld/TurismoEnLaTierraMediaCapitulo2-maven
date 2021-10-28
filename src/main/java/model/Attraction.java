package model;

public class Attraction {

	// Costo de visita.-
	// Tiempo promedio para realizarla.-
	// Cupo de personas.-
	// Tipo de attraction: paisaje, de aventura, de desgustacion (Aventura, Paisaje, Degustacion).-

	private int id;			// ID
	private String name;	// nombre
	private double cost; 	// costo
	private double time; 	// tiempo
	private int quota; 		// cupo
	private int attractionType; // el tipo de attractionName1

	public Attraction(int id, String name, double cost, double time, int quota, int attractionType) {

		this.id = id;		// ID		
		this.name = name;   // nombre
		this.cost = cost;   // costo
		this.time = time;   // tiempo
		this.quota = quota; // cupo
		this.attractionType = attractionType; // el tipo de attraction.-

	}
	
	public Attraction(String name, double cost, double time, int quota, int attractionType) {

		this.name = name;   // nombre
		this.cost = cost;   // costo
		this.time = time;   // tiempo
		this.quota = quota; // cupo
		this.attractionType = attractionType; // el tipo de attraction.-

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}

	public int getQuota() {
		return quota;
	}

	public void setQuota(int quota) {
		this.quota = quota;
	}

	public int getAttractionType() {
		return attractionType;
	}

	public void setAttractionType(int attractionType) {
		this.attractionType = attractionType;
	}

	@Override
	public String toString() {
		return "Attraction [id=" + id + ", name=" + name + ", cost=" + cost + ", time=" + time + ", quota=" + quota
				+ ", attractionType=" + attractionType + "]";
	}

}