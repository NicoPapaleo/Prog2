package Figuras;

public class Main {

	public static void main(String[] args) {
		
		ManejadorDeFiguras mf = new ManejadorDeFiguras();
		
		Rectangulo r1 = new Rectangulo("r1", 10, 5);
		
		Circulo c1 = new Circulo("c1",3);
		
		mf.imprimir(r1);
		
		mf.imprimir(c1);

	}

}
