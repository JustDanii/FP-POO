package Logico;

public abstract class Trabajador extends Persona {

	protected String code;
	protected String password;
	protected int role;// 0. Admin 1. Doctor 2. Secretaria
	
	public Trabajador(String nombre, String id, int numeroTelefonico, String code, String password, int role) {
		super(nombre, id, numeroTelefonico);
		this.code = code;
		this.password = password;
		this.role = role;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}
	
		
	
}
