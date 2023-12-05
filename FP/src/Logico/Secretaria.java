package Logico;

public class Secretaria extends Trabajador {

	Doctor doctor;//Doctor para el que trabaja

	public Secretaria(String code, String password, Doctor doctor) {
		super(code, password);
		this.doctor = doctor;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	
	
}
