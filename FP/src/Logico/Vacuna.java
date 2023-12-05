package Logico;

public class Vacuna {

	private int code;
	private String Nombre;
	private Enfermedad enContra;//Enfermedad para la que se utiliza
	
	public Vacuna(int code, String nombre, Enfermedad enContra) {
		super();
		this.code = code;
		Nombre = nombre;
		this.enContra = enContra;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public Enfermedad getEnContra() {
		return enContra;
	}

	public void setEnContra(Enfermedad enContra) {
		this.enContra = enContra;
	}
	
	
}