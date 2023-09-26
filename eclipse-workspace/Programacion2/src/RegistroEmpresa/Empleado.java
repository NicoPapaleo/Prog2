package RegistroEmpresa;

public class Empleado extends Persona {
	
	private int numLegajo;
	private double sueldo;

	public Empleado(String cargo, String nombre, String apellido, int edad, int numLegajo, double sueldo) {
		super(cargo, nombre, apellido, edad);
		this.numLegajo = numLegajo;
		this.sueldo = sueldo;
	}

	public int getNumLegajo() {
		return numLegajo;
	}

	public double getSueldo() {
		return sueldo;
	}
	
	@Override
	public String toString() {
		return super.toString()+
				" N° legajo: " + this.getNumLegajo()+
				" Sueldo: $" + this.getSueldo()+
				"\n";
	}

}
