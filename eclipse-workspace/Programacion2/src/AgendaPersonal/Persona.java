package AgendaPersonal;

public class Persona {
	
	private String nombre;
	private int tel;
	private String email;
	
	public Persona(String nombre, int tel, String email) {
		this.nombre = nombre;
		this.tel = tel;
		this.email = email;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
