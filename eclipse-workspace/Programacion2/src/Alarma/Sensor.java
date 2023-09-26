package Alarma;

public class Sensor {
	private String zona;
	private boolean estado;
	
	public Sensor(String zona, boolean estado) {
		this.zona = zona;
		this.estado = estado;
	}

	public String getZona() {
		return zona;
	}

	public boolean isEstado() {
		return estado;
	}
	

}
