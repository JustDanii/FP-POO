package Logico;

public abstract class Trabajador {

	private String code;
	private String password;
	
	public Trabajador(String code, String password) {
		super();
		this.code = code;
		this.password = password;
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
	
	
}
