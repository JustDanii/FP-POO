package Logico;

import java.util.ArrayList;

public class Viviendas {

	private String Ciudad;
	private String Sector;
	private String Calle;
	private int numeroDeCasa;
	private ArrayList<Persona>persona;
	
	public Viviendas(String ciudad, String sector, String calle, int numeroDeCasa, ArrayList<Persona> personas) {
		super();
		Ciudad = ciudad;
		Sector = sector;
		Calle = calle;
		this.numeroDeCasa = numeroDeCasa;
		this.persona = personas;
	}

	public String getCiudad() {
		return Ciudad;
	}

	public String getSector() {
		return Sector;
	}

	public String getCalle() {
		return Calle;
	}

	public int getNumeroDeCasa() {
		return numeroDeCasa;
	}

	public ArrayList<Persona> getPersona() {
		return persona;
	}

	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}

	public void setSector(String sector) {
		Sector = sector;
	}

	public void setCalle(String calle) {
		Calle = calle;
	}

	public void setNumeroDeCasa(int numeroDeCasa) {
		this.numeroDeCasa = numeroDeCasa;
	}

	public void setPersonas(ArrayList<Persona> persona) {
		this.persona = persona;
	}
	
	
	
	
}