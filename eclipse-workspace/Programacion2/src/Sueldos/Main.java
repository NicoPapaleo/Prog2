package Sueldos;

public class Main {

	public static void main(String[] args) {
		SistemaDeCobro sistema = new SistemaDeCobro();
		

		EmpleadoContratado e1 = new EmpleadoContratado("Juan", 500);
		EmpleadoContratado e2 = new EmpleadoExtra("Nico", 500,3,50);
		EmpleadoContratado e3 = new EmpleadoComision("Axel", 500,5,0.1,100);
		
		sistema.addEmpleado(e1);
		sistema.addEmpleado(e2);
		sistema.addEmpleado(e3);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
	}

}
