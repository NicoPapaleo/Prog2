package AgendaPersonal;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class Reunion {
	private String ubicacion;
	private LocalDate fechaReunion;
	private LocalTime inicioReunion;
	private String tema;
	private Duration duracion;
	private ArrayList <Persona> asistentes;
	
	public Reunion(String ubicacion, LocalDate fechaReunion, String tema, Duration duracion) {
		this.ubicacion = ubicacion;
		this.fechaReunion = fechaReunion;
		this.tema = tema;
		this.duracion = duracion;
		this.asistentes = new ArrayList<Persona>();
	}
	
	public String datosReunion() {
		return "Lugar: " + this.getLugar() + 
				//"\nFecha: " this.getFechaReunion() +
				"\nHora: " + this.getInicioReunion() +
				"\nParticipante: " + this.getPersonas() + 
				"\nDuracion: " + this.getDuracion() +
				"\nTema: " + this.getTema() + 
				"\n";
	}

	public LocalDate getFechaReunion() {
		return fechaReunion;
	}

	public void setFechaReunion(LocalDate fechaReunion) {
		this.fechaReunion = fechaReunion;
	}

	public LocalDateTime getInicioReunion() {
		return LocalDateTime.of(fechaReunion,inicioReunion);
	}
	
	public LocalDateTime getFinReunion() {
		return LocalDateTime.from(getInicioReunion().plus(duracion));
	}

	public void setInicioReunion(LocalTime inicioReunion) {
		this.inicioReunion = inicioReunion;
	}

	public ArrayList<Persona> getPersonas() {
		return asistentes;
	}

	public void setPersonas(ArrayList<Persona> personas) {
		this.asistentes = personas;
	}

	public String getLugar() {
		return ubicacion;
	}

	public void setLugar(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public Duration getDuracion() {
		return duracion;
	}

	public void setDuracion(Duration duracion) {
		this.duracion = duracion;
	}
	
	public void addAsistente(Persona nuevoAsistente)throws Exception {
		if(!asistentes.contains(nuevoAsistente)) {
			this.asistentes.add(nuevoAsistente);
		}
		else
			throw new Exception("ERROR: La persona que intenta agregar ya es un asistente.");
	}
	
	public void removeAsistente(Persona Asistente)throws Exception {
		if(asistentes.contains(Asistente)) {
			this.asistentes.remove(Asistente);
		}
		else {
			throw new Exception ("ERROR: La persona que intenta remover del listado de asistentes "
					+ "no pertenece a esta reunion.");
		}
	}

}
