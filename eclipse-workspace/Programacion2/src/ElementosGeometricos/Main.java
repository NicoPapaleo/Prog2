package ElementosGeometricos;

public class Main {

	public static void main(String[] args) {
		Punto_geometrico punto1 = new Punto_geometrico();
		punto1.setX(2);
		punto1.setY(2);
		
		punto1.desplazarPunto(4, 2);
		
		System.out.println(punto1.calcularDistanciaEuclidea(3, 3));
		System.out.println(punto1.getX()+ " " + punto1.getY());
	}

}
