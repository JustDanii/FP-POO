	package Logico;

	import java.util.ArrayList;

	public class Paciente extends Persona {

		private boolean sexo;//0. Hombre 1. Mujer
		private ArrayList<Consulta>consulta;
		private ArrayList<Vacuna>vacuna;
		private HistoriaClinica historia;
		
		public Paciente(String nombre, String id, int numeroTelefonico, boolean sexo, ArrayList<Consulta> consultas,
				ArrayList<Vacuna> vacunas, HistoriaClinica historia) {
			super(nombre, id, numeroTelefonico);
			this.sexo = sexo;
			this.consulta = consultas;
			this.vacuna = vacuna;
			this.historia = historia;
		}

		public boolean isSexo() {
			return sexo;
		}

		public void setSexo(boolean sexo) {
			this.sexo = sexo;
		}

		public ArrayList<Consulta> getConsultas() {
			return consulta;
		}

		public void setConsultas(ArrayList<Consulta> consulta) {
			this.consulta = consulta;
		}

		public ArrayList<Vacuna> getVacuna() {
			return vacuna;
		}

		public void setVacunas(ArrayList<Vacuna> vacuna) {
			this.vacuna = vacuna;
		}

		public HistoriaClinica getHistoria() {
			return historia;
		}

		public void setHistoria(HistoriaClinica historia) {
			this.historia = historia;
		}
		

	}



