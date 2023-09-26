package Sueldos;

public class EmpleadoComision extends EmpleadoContratado {
	private int cantVentas;
	private double porcentajeComision;
	private double valorProducto;
	
	public EmpleadoComision(String nombre, double montoSemanal, int cantVentas, double porcentajeComision, double valorProducto) {
		super(nombre, montoSemanal);
		this.cantVentas = cantVentas;
		this.porcentajeComision = porcentajeComision;
		this.valorProducto = valorProducto;
	}

	public int getCantVentas() {
		return cantVentas;
	}

	public void setCantVentas(int cantVentas) {
		this.cantVentas = cantVentas;
	}

	public double getPorcentajeComision() {
		return porcentajeComision;
	}

	public double getValorProducto() {
		return valorProducto;
	}
	
	@Override
	public double getSueldo() {
		return super.getSueldo() + (getCantVentas()*getValorProducto()*getPorcentajeComision());
	}
	
	public String toString() {
		return "Nombre: " + this.getNombre() +
				"\nSueldo: " + getSueldo() +
				"\nVentas: " + getCantVentas() +
				"\nPorcentaje: " + getPorcentajeComision();
	}

}
