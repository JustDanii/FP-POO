package Logico;

public class Doctor extends Trabajador {
	
	private String Especialidad;

	public Doctor(String nombre, String id, int numeroTelefonico, String code, String password, int role,
			String especialidad) {
		super(nombre, id, numeroTelefonico, code, password, role);
		Especialidad = especialidad;
	}

	public String getEspecialidad() {
		return Especialidad;
	}

	public void setEspecialidad(String especialidad) {
		Especialidad = especialidad;
	}
	

	
	
}
