public class Robot {
	
	//Atributos
	private String nombre_ej;
	private String torso_ej;
	private String cabeza_ej;
	private String piernas_ej;
	private int manos_ej;
	private String id_ej;
	
	
	
	
	
	//Constructores
	

	
	public Robot(String nombre_ej, String torso_ej, String cabeza_ej, String piernas_ej, 
			int manos_ej, String id_ej) {
		this.nombre_ej = "";
		this.torso_ej = torso_ej;
		this.setCabeza_ej("calvo");
		this.setPiernas_ej("2");
		this.setManos_ej(5);
		this.setId_ej(id_ej);
	}
	
	//public Robot(String string, String string2, String string3, String string4, int i) {
		
	//}

	public String getnombre_ej() {
		return nombre_ej;
		
	}
	
	public void setnombre_eje(String nombre_ej) {
		this.nombre_ej = nombre_ej;
	}
	
	
	public String gettorso_ej() {
		return torso_ej;
		
	}
	
	public void settorso_ej(String torso_ej) {
		this.torso_ej = torso_ej;
	}
	
	
	
	
	//Metodo
	public void correr_ej() {
		
	}
	public void grabar_loqueve_ej() {
		
	}

	public String getCabeza_ej() {
		return cabeza_ej;
	}

	public void setCabeza_ej(String cabeza_ej) {
		this.cabeza_ej = cabeza_ej;
	}

	public String getPiernas_ej() {
		return piernas_ej;
	}

	public void setPiernas_ej(String piernas_ej) {
		this.piernas_ej = piernas_ej;
	}

	public String getId_ej() {
		return id_ej;
	}

	public void setId_ej(String id_ej) {
		this.id_ej = id_ej;
	}

	public int getManos_ej() {
		return manos_ej;
	}

	public void setManos_ej(int manos_ej) {
		this.manos_ej = manos_ej;
	}

}
