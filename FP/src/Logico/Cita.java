package Logico;

import java.util.Date;

//klk

public class Cita {

	private Paciente paciente;
	private Doctor doctor;
	private Date fecha;
	private Time hora;
	
	public Cita(Paciente paciente, Doctor doctor, Date fecha, Time hora) {
		super();
		this.paciente = paciente;
		this.doctor = doctor;
		this.fecha = fecha;
		this.hora = hora;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public Date getFecha() {
		return fecha;
	}

	public Time getHora() {
		return hora;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public void setHora(Time hora) {
		this.hora = hora;
	}
	
	
}