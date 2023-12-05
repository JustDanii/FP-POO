package Logico;

public abstract class Persona {
	
	protected String nombre;
	protected String id;
	protected int numeroTelefonico;
	
	public Persona(String nombre, String id, int numeroTelefonico) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.numeroTelefonico = numeroTelefonico;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getNumeroTelefonico() {
		return numeroTelefonico;
	}

	public void setNumeroTelefonico(int numeroTelefonico) {
		this.numeroTelefonico = numeroTelefonico;
	}
	
	
	
}