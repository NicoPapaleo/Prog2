package Alarma;

public class Alarma {
	
	//excepcion al poner "public" ya que en realidad deberia ser una clase, asumimos la clase creada por enunciado
	private boolean timbre; 
	
	public Alarma(boolean timbre) {
		this.timbre = timbre;
	}
	
	public void setTimbre(boolean timbre) {
		this.timbre = timbre;
	}

	public void sonar() {
		System.out.println("¡Piu Piu Piu!");
	}

}
