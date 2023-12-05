package Logico;

public class Doctor extends Trabajador {
	
	private String Especialidad;

	public Doctor(String code, String password, String especialidad) {
		super(code, password);
		Especialidad = especialidad;
	}

	public String getEspecialidad() {
		return Especialidad;
	}

	public void setEspecialidad(String especialidad) {
		Especialidad = especialidad;
	}
	
}
