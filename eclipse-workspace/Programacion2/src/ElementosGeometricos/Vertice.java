package ElementosGeometricos;

public class Vertice {
	
	//-------Atributos-------
	private double x;
	private double y;

	public Vertice() { //valores por defecto
		x=0;
		y=0;
	}
	
	public Vertice(double nuevoX, double nuevoY) {
		this.x = nuevoX;
		this.y = nuevoY;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
}
