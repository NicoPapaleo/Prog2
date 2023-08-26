package figuras;

public class ManejadorDeFiguras {
	
	public void imprimir(Rectangulo r) {
		System.out.println(r.getDatosCompletos());
	}
	
	public void imprimir(Circulo c) {
		System.out.println(c.getDatosCompletos());
	}
	
	public static void main(String[] args) {
		ManejadorDeFiguras mf = new ManejadorDeFiguras();
		
		Rectangulo r1 = new Rectangulo("r1", 10, 5);
		
		mf.imprimir(r1);
		
		Circulo c1 = new Circulo("c1", 8);
		
		mf.imprimir(c1);
	}

}
