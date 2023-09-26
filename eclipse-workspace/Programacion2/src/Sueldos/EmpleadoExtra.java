package Sueldos;

public class EmpleadoExtra extends EmpleadoContratado {
	private int cantHorasExtra;
	private double precioHorasExtra;
	
	public EmpleadoExtra(String nombre, double montoSemanal, int cantHorasExtra, double precioHorasExtra) {
		super(nombre, montoSemanal);
		this.cantHorasExtra = cantHorasExtra;
		this.precioHorasExtra = precioHorasExtra;
	}

	public int getCantHorasExtra() {
		return cantHorasExtra;
	}

	public double getPrecioHorasExtra() {
		return precioHorasExtra;
	}
	
	@Override
	public double getSueldo() {
		return super.getSueldo()+(getCantHorasExtra()*getPrecioHorasExtra());
	}
	
	public String toString() {
		return "Nombre: " + this.getNombre() +
				"\nSueldo: " + getSueldo() +
				"\nHoras extra: " + getCantHorasExtra() +
				"\nPrecio horas extra: " + getPrecioHorasExtra();
	}
}
