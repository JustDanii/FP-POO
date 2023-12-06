package Logico;

import java.util.ArrayList;

public class Clinica {

	private ArrayList<Paciente>pac;
	private ArrayList<Doctor>doc;
	private ArrayList<Viviendas>viv;
	private ArrayList<Vacuna>vac;//Vacunas Disponibles
	private static Clinica cli;
	
	public static Clinica getInstance(){
		   if(cli == null){
			 cli = new Clinica();  
		   } 	   
		   return cli;
		}
	
	public Clinica() {
		super();
		this.pac = new ArrayList<Paciente>();   
		this.doc = new ArrayList<Doctor>();
		this.viv = new ArrayList<Viviendas>();
	}


	public ArrayList<Paciente> getPac() {
		return pac;
	}

	public void setPac(ArrayList<Paciente> pac) {
		this.pac = pac;
	}

	public ArrayList<Doctor> getDoc() {
		return doc;
	}

	public void setDoc(ArrayList<Doctor> doc) {
		this.doc = doc;
	}

	public ArrayList<Viviendas> getViv() {
		return viv;
	}

	public void setViv(ArrayList<Viviendas> viv) {
		this.viv = viv;
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
    public static void addDoctor(Doctor doctor) {
        getInstance().doc.add(doctor);
    }
    public static void addVivienda(Viviendas vivienda) {
        getInstance().viv.add(vivienda);
    }
    
    

}