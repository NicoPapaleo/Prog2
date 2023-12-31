package ElementosGeometricos;

public class Punto_geometrico {
	
	//------Atributos-------
	private double x;
	private double y;
	
	//---------Constructores--------
	public Punto_geometrico() {
		x=0;
		y=0;
	}
	
	public Punto_geometrico(double x, double y) {
		this.x = x;
		this.y = y;
	} 
	
	//----------Metodos-----------
	
	//Set
	public double setX(double nuevaX) {
		return this.x = nuevaX;
	}
	
	public double setY(double nuevaY) {
		return this.y = nuevaY;
	}
	
	//Get
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	
	//Desplazar punto
	public void desplazarPunto(double desplazamientoX, double desplazamientoY) {
		this.x = (this.x + desplazamientoX); //Averiguar si va el this o solo X
		this.y = (this.y + desplazamientoY); //Averiguar si va el this o solo Y
	}
	
	//Distancia euclidea
	public double calcularDistanciaEuclidea(double X2, double Y2) {
		double resultado=0;
		resultado = (((this.x - X2)*(this.x - X2))+((this.y - Y2)*(this.y - Y2)));
		return resultado;
	}
	
	
}









