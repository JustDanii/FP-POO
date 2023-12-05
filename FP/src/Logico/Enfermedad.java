	package Logico;

	public class Enfermedad {

		private String Sintomas;
		private String Descripcion;
		private boolean enRevision;//1.En revision 0.Corriente
		
		public Enfermedad(String sintomas, String descripcion, boolean enRevision) {
			super();
			Sintomas = sintomas;
			Descripcion = descripcion;
			this.enRevision = enRevision;
		}

		public String getSintomas() {
			return Sintomas;
		}

		public String getDescripcion() {
			return Descripcion;
		}

		public void setSintomas(String sintomas) {
			Sintomas = sintomas;
		}

		public void setDescripcion(String descripcion) {
			Descripcion = descripcion;
		}

		public boolean isEnRevision() {
			return enRevision;
		}

		public void setEnRevision(boolean enRevision) {
			this.enRevision = enRevision;
		}

	}

