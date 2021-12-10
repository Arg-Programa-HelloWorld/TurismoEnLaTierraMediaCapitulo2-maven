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
	private String image;   // ruta de la imagen
	private int attractionTypeID; // el tipo de attractionName1
	private AttractionType attractionType; // el tipo de attractionName1

	// Para Obtener una Atraccion de la BDD
	public Attraction(int id, String name, double cost, double time, int quota, String image, int attractionTypeID,
			AttractionType attractionType) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.time = time;
		this.quota = quota;
		this.image = image;
		this.attractionTypeID = attractionTypeID;
		this.attractionType = attractionType;
	}

	// Para Insertar una Atraccion en la BDD
	public Attraction(String name, double cost, double time, int quota, int attractionTypeID) {
		super();
		this.name = name;
		this.cost = cost;
		this.time = time;
		this.quota = quota;
		this.attractionTypeID = attractionTypeID;
		
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
	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getAttractionTypeID() {
		return attractionTypeID;
	}

	public void setAttractionTypeID(int attractionTypeID) {
		this.attractionTypeID = attractionTypeID;
	}

	public AttractionType getAttractionType() {
		return attractionType;
	}

	public void setAttractionType(AttractionType attractionType) {
		this.attractionType = attractionType;
	}

	@Override
	public String toString() {
		return "Attraction [id=" + id + ", name=" + name + ", cost=" + cost + ", time=" + time + ", quota=" + quota
				+ ", image=" + image + ", attractionTypeID=" + attractionTypeID + ", attractionType=" + attractionType + "]";
	}
	
	public boolean canHost(int i) {
		return quota >= i;
	}

}