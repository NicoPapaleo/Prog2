package Persona;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Persona persona1 = new Persona(41873041, "Nicolas", "Papaleo");
		persona1.setPeso(70.5);
		persona1.setAltura(1.77);
		persona1.setEdad(24);
		persona1.setFechaDeNacimiento(LocalDate.of(1999, 7, 2));
		persona1.setSexo('M');
		
		//En estado
		System.out.println(persona1.getEstado() ? "Se encuentra en estado." : "Se encuentra fuera de estado.");
		
		//Cumpleaños
		System.out.println(persona1.getCumpleanios() ? "Hoy cumple años." : "Hoy NO cumple años.");
		
		//Mayor de edad
		System.out.println(persona1.getMayorEdad() ? "Es mayor de edad." : "No tiene la mayoria de edad.");
		
		//Puede votar
		System.out.println(persona1.getPuedeVotar() ? "Vota." : "No puede votar.");
		
		//Edad correcta
		System.out.println(persona1.validarEdad() ? "Es coherente, la edad coincide." : "La edad o fecha de nacimiento es incorrecta.");
		
		//Informacion de la persona
		System.out.println("Informacion completa de la persona:");
		persona1.getInfoPersona();
	}

}
