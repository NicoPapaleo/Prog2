package AgendaPersonal;

import java.util.ArrayList;

public class Agenda {
	
	
	private ArrayList<Reunion> reuniones;
	
	
	public Agenda() {
		this.reuniones = new ArrayList<Reunion>();
	}
	
	public ArrayList<Reunion> getReuniones(){
		return reuniones;
	}
	
	public void addReunion(Reunion nuevaReunion) throws Exception{
		if(reuniones.contains(nuevaReunion)) {
			throw new Exception ("La reunion que intenta agregar ya "
					+ "se encuentra registrada.");
		}
		for(Reunion r : reuniones) {
			if((nuevaReunion.getInicioReunion().isAfter(r.getInicioReunion())&&(nuevaReunion.getInicioReunion().isBefore(r.getFinReunion())))) {
				throw new Exception(""
						+ "¡ALERTA!: La reunion que quiere programar se superpone con otra reunion.");
			}
		}
		reuniones.add(nuevaReunion);
	}

}
