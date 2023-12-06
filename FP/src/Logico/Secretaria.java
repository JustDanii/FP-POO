package Logico;

public class Secretaria extends Trabajador {

	Doctor doctor;//Doctor para el que trabaja

	public Secretaria(String nombre, String id, int numeroTelefonico, String code, String password, int role,
			Doctor doctor) {
		super(nombre, id, numeroTelefonico, code, password, role);
		this.doctor = doctor;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	
}
