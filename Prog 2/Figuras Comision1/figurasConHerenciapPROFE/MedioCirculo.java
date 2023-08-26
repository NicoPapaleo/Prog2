package figurasConHerencia;

public class MedioCirculo extends Circulo {
	
	public MedioCirculo(String nombre, double radio) {
		super(nombre, radio);
	}
	
	public double getArea() {
		return super.getArea() / 2;
	}
	
	public double getPerimetro() {
		return super.getPerimetro() / 2 + this.getRadio() * 2;
	}

}
