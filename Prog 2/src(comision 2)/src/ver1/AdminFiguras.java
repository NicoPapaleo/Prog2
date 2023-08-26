package ver1;

public class AdminFiguras {

	public void mostrarSupyArea(Rectangulo rr) {
		System.out.println("Area:"+ rr.getArea() + 
				           " Perimetro " + rr.getPerimetro());
	}
	
	public void mostrarSupyArea(Circulo cc) {
		System.out.println("Area:"+ cc.getArea() + 
				           " Perimetro " + cc.getPerimetro());
	}
	public static void main(String[] args) {
		AdminFiguras aa = new AdminFiguras();
		Rectangulo rr1 = new Rectangulo(10, 5);
		aa.mostrarSupyArea(rr1);
		Circulo c1 = new Circulo(23);
		aa.mostrarSupyArea(c1);
	}

}
