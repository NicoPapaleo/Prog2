package RegistroEmpresa;

public class Persona {
	
	private String cargo;
	private String nombre;
	private String apellido;
	private int edad;
	
	public Persona(String cargo, String nombre, String apellido, int edad) {
		this.cargo = cargo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad; 
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getEdad() {
		return edad;
	}
	
	public String toString() {
		return 	"Cargo: " + this.getCargo()+
				" Nombre: " + this.getNombre()+
				" Apellido: " + this.getApellido()+
				" Edad: " + this.getEdad()+
				"\n";
	}

}
