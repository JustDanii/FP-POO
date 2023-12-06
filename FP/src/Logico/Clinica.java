package Logico;

import java.util.ArrayList;

public class Clinica {

	private ArrayList<Persona>per;
	private ArrayList<Paciente>pac;
	private ArrayList<Viviendas>viv;
	private ArrayList<Vacuna>vac;//Vacunas Disponibles
	private ArrayList<Enfermedad>enf;
	private ArrayList<Cita>citas;
	private static Clinica cli;
	
	public static Clinica getInstance(){
		   if(cli == null){
			   cli = new Clinica();
		   }   
		   return cli;
		}


	public Clinica(ArrayList<Persona> per, ArrayList<Paciente> pac, ArrayList<Viviendas> viv, ArrayList<Vacuna> vac,
			ArrayList<Enfermedad> enf, ArrayList<Cita> citas) {
		super();
		this.per = per;
		this.pac = pac;
		this.viv = viv;
		this.vac = vac;
		this.enf = enf;
		this.citas = citas;
	}


	public ArrayList<Persona> getPer() {
		return per;
	}


	public void setPer(ArrayList<Persona> per) {
		this.per = per;
	}


	public ArrayList<Paciente> getPac() {
		return pac;
	}


	public void setPac(ArrayList<Paciente> pac) {
		this.pac = pac;
	}


	public ArrayList<Viviendas> getViv() {
		return viv;
	}


	public void setViv(ArrayList<Viviendas> viv) {
		this.viv = viv;
	}


	public ArrayList<Vacuna> getVac() {
		return vac;
	}


	public void setVac(ArrayList<Vacuna> vac) {
		this.vac = vac;
	}


	public ArrayList<Enfermedad> getEnf() {
		return enf;
	}


	public void setEnf(ArrayList<Enfermedad> enf) {
		this.enf = enf;
	}


	public ArrayList<Cita> getCitas() {
		return citas;
	}


	public void setCitas(ArrayList<Cita> citas) {
		this.citas = citas;
	}


	public static Clinica getCli() {
		return cli;
	}


	public static void setCli(Clinica cli) {
		Clinica.cli = cli;
	}


	public Doctor obtenerDoctorbyCode(String code) {
		
		Doctor aux = null;
		int i = 0;
		boolean encontrado = false;
			for (Doctor doctor : doc) {
				if (((String) doctor.id).equalsIgnoreCase(code)){
	            aux = doctor;
			    encontrado = true;
	         }		
			}
			return aux;
	}
	

	public Paciente obtenerPacientebyCode(String code) {
		
		Paciente aux = null;
		int i = 0;
			for (Paciente paciente : pac) {
				if (paciente.id.equalsIgnoreCase(code)){
		            aux = paciente; 
				}
			}
		
		return aux;
	}
		
	
	public Viviendas obtenerViviendaByPersona(Persona persona) {
		
		Viviendas aux = null;
		int i = 0;
		String id = persona.getId();
		boolean encontrado = false;
			for (Viviendas vivienda : viv) {
				 while (i < vivienda.getPersona().size() && !encontrado) {
				        if (vivienda.getPersona().get(i).getId().equalsIgnoreCase(id)){
				            aux = vivienda;
				            encontrado = true;
				        }
				        i++;
				    }
			}
		
		return aux;
	}
	
    public static void addPaciente(Paciente paciente) {
        getInstance().pac.add(paciente);
    }
    public static void addPersona(Persona persona) {
        getInstance().per.add(persona);
    }
    public static void addVivienda(Viviendas vivienda) {
        getInstance().viv.add(vivienda);
    }
    
    public Trabajador getTrabajadorByCode(String code) {
		
    	Trabajador aux = null;
		int i = 0;
			for (Persona persona : per) {
				if (persona instanceof Trabajador && persona.getId().equalsIgnoreCase(code)){
		            aux = (Trabajador)persona; 
				}
			}
    	
    	return aux;
    	
    	
    }
    
    
    
    
    

}