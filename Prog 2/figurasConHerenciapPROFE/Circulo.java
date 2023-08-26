package figurasConHerencia;

public class Circulo extends Figura {
	
	private double radio;
	
	public Circulo(String nombre, double radio) {
		super(nombre);
		this.radio = radio;
	}
	
	public double getArea() {
		return Math.PI * this.getRadio() * this.getRadio();
	}
	
	public double getPerimetro() {
		return 2 * Math.PI * this.getRadio();
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	

}
