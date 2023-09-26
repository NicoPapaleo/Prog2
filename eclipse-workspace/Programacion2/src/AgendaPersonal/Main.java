package AgendaPersonal;

import java.time.Duration;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Agenda agenda = new Agenda();
		Reunion reu1 = new Reunion("Tandil", LocalDate.of(2023, 07, 02), "Prog2", Duration.ofHours(1));
		Persona asist1 = new Persona("Nico", 609455, "nico@gmail.com");
		
		//reu1.addAsistente(asist1);
		//agenda.addReunion(reu1);
		//reu1.getDatosReunion();
	}

}
