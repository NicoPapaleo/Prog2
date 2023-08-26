package FigurasConHerencia;

public class MedioCirculo extends Circulo {
	
	public MedioCirculo(String nombre, double radio) {
		super(nombre, radio);
	}
	
	@Override
	public double getArea() {
		return super.getArea()/2;
	}
	
	@Override
	public double getPerimetro() {
		return super.getPerimetro() / 2 + this.getRadio()*2;
	}

}
