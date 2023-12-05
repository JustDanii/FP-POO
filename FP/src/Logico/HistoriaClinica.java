package Logico;

import java.util.ArrayList;

public class HistoriaClinica {

	private ArrayList<Consulta>consultas;
	
	public ArrayList<Consulta> getConsultas() {
		return consultas;
	}

	public void setConsultas(ArrayList<Consulta> consultas) {
		this.consultas = consultas;
	}

	public HistoriaClinica(ArrayList<Consulta> consultas) {
		super();
		this.consultas = consultas;
	}
}