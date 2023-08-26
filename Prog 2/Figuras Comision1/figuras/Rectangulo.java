package figuras;

public class Rectangulo {
	
	// Atributos
	private String nombre;
	private double lado1, lado2;
	
	public Rectangulo(String nombre, double lado1, double lado2) {
		this.nombre = nombre;
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	public double getArea() {
		//return this.getLado1() * this.getLado2();
		return this.lado1 * this.lado2;
	}
	
	public double getPerimetro() {
		return (this.lado1 + this.lado2) * 2;
	}
	
	public String getDatosCompletos() {
		return "Nombre: " + this.getNombre() +
				" Area: " + this.getArea() + 
				" Perimetro: " + this.getPerimetro();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	
	
	
	

}
