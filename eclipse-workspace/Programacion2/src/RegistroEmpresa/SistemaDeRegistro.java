package RegistroEmpresa;

import java.util.ArrayList;

public class SistemaDeRegistro {
	
	private ArrayList<Persona> personas;
	
	public SistemaDeRegistro() {
		personas = new ArrayList<>();
	}
	
	public void addPersona(Persona persona) {
		personas.add(persona);
	}
	
	//falta el toString para mostrar la lista de personas
	
	public String toString() {
		String listaPersonas="";
		if(!personas.isEmpty()) {
				for(int i = 0; i<personas.size();i++) {
					listaPersonas += ("\n" + personas.get(i));
				}
		}
		return listaPersonas;
	}
}
