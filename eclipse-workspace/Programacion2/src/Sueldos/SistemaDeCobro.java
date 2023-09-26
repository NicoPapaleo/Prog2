package Sueldos;

import java.util.ArrayList;

public class SistemaDeCobro {

	private ArrayList<EmpleadoContratado> empleados;

	public SistemaDeCobro() {
		empleados = new ArrayList<>();
	}
	
	public void addEmpleado(EmpleadoContratado empleado) {
		empleados.add(empleado);
	}
	
	public void pagarSueldo(EmpleadoContratado empleado) {
		empleado.getSueldo();
	}
	
}


