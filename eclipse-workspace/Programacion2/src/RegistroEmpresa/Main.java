package RegistroEmpresa;

public class Main {

	public static void main(String[] args) {

		SistemaDeRegistro sr = new SistemaDeRegistro();
		Empleado e1 = new Empleado("Empleado", "Nico", "Papaleo", 24, 123, 500);
		UsuarioFinal e2 = new UsuarioFinal("Usuario Final", "Jose", "Perez", 35, "Jose", "12345");
		Jerarquico e3 = new Jerarquico("Jerarquico", "Juan", "Lopez", 40, 456, 1500);
		
		sr.addPersona(e1);
		sr.addPersona(e2);
		sr.addPersona(e3);
		
		e3.addEmpleado(e1);
		//System.out.println(e1);
		//System.out.println(e2);
		//System.out.println(e3);
		System.out.println(sr);
		
	}

}
