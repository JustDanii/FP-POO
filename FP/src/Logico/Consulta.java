package Logico;

import java.util.Date;

public class Consulta {
	
	private Date fecha;
	private Doctor doctor;
	private Paciente paciente;
	private String MotivoDConsulta;
	private String Descripcion;
	private Enfermedad Diagnostico;
	
	public Consulta(Date fecha, Doctor doctor, Paciente paciente, String motivoDConsulta, String descripcion,
			Enfermedad diagnostico) {
		super();
		this.fecha = fecha;
		this.doctor = doctor;
		this.paciente = paciente;
		MotivoDConsulta = motivoDConsulta;
		Descripcion = descripcion;
		Diagnostico = diagnostico;
	}
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public String getMotivoDConsulta() {
		return MotivoDConsulta;
	}
	public void setMotivoDConsulta(String motivoDConsulta) {
		MotivoDConsulta = motivoDConsulta;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public Enfermedad getDiagnostico() {
		return Diagnostico;
	}
	public void setDiagnostico(Enfermedad diagnostico) {
		Diagnostico = diagnostico;
	}

	
	
}