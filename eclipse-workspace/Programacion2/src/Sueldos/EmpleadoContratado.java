package Sueldos;

public class EmpleadoContratado {
	private String nombre;
	private double montoSemanal;

	public EmpleadoContratado(String nombre, double montoSemanal) {
		this.nombre = nombre;
		this.montoSemanal = montoSemanal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() {
		return montoSemanal;
	}
	
	public String toString() {
		return "Nombre: " + this.getNombre() +
				"\nSueldo: " + getSueldo();
	}
	
}
