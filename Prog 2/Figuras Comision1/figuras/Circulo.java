package figuras;

public class Circulo {

	private String nombre;
	private double radio;
	
	public Circulo(String nombre, double radio) {
		this.nombre = nombre;
		this.radio = radio;
	}
	
	public double getArea() {
		//return Math.PI * this.radio * this.radio;
		return Math.PI * this.getRadio() * this.getRadio();
	}
	
	public double getPerimetro() {
		return 2 * Math.PI * this.getRadio();
	}
	
	public String getDatosCompletos() {
		return "Nombre: " + this.getNombre() + 
				" Area: " + this.getArea() + 
				" Perimetro: " + this.getPerimetro();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	
}
