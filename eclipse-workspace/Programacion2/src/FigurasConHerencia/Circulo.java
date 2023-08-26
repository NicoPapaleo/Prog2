package FigurasConHerencia;

public class Circulo extends Figura{
	private double radio;
	
	public Circulo(String nombre, double radio) {
		super(nombre);
		this.radio = radio;
	}
	@Override
	public double getArea() {
		return Math.PI * this.getRadio() * this.radio;
	}
	@Override
	public double getPerimetro() {
		return 2 * Math.PI * this.radio;
	}

	public double getRadio() {
		return radio;
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
}
