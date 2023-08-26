package figurasConHerencia;

public class ManejadorDeFiguras {
	
	public void imprimir(Figura f) {
		System.out.println(f.getDatosCompletos());
	}
	
	public static void main(String[] args) {
		ManejadorDeFiguras mf = new ManejadorDeFiguras();
		
		Rectangulo r1 = new Rectangulo("r1", 10, 5);
		
		mf.imprimir(r1);
		
		Circulo c1 = new Circulo("c1", 8);
		
		mf.imprimir(c1);
		
		MedioCirculo mc1 = new MedioCirculo("medio1", 8);
		mf.imprimir(mc1);
		
		//Figura f1 = r1; // El rectangulo es una figura, al revez no, una figura no siempre es un rectangulo
		//f1.getArea();
		//f1 = c1;
		//((Rectangulo)f1).getLado1(); // Puede dar error en tiempo de ejecución
		
		//Persona p = new Persona();
		//p.getDatosCompletos();
		//f1 = persona; // No podemos pq no hay relación de herencia entre Persona y Figura
		
		//c1 = (Circulo)f1; // Puede dar error en tiempo de ejecución
		
	}

}
