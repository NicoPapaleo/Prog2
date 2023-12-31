package Electrodomesticos;

public class Electrodomestico {
	
	//-----Atributos--------
	private String nombre;
	private double precio;
	private String color;
	private int consumo;
	private double peso;
	
	public static final int MAXCONSUMO = 45;
	public static final int MAXBALANCE = 3;
	
	//-------Constructores-------
	
	public Electrodomestico() {
		color = "Gris plata";
		precio = 100.00;
		consumo = 10;
		peso = 2.00;
	}
	
	public Electrodomestico(String nombre) {
		this.nombre = nombre;
	}
	
	public Electrodomestico(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public Electrodomestico(String nombre, double precio, String color) {
		this.nombre = nombre;
		this.precio = precio;
		this.color = color;
	}
	
	public Electrodomestico(String nombre, double precio, String color, double peso) {
		this.nombre = nombre;
		this.precio = precio;
		this.color = color;
		this.peso= peso;
	}
	
	public Electrodomestico(String nombre, double precio, String color, double peso, int consumo) {
		this.nombre = nombre;
		this.precio = precio;
		this.color = color;
		this.peso= peso;
		this.consumo = consumo;
	}

	//---------Metodos----------
	
	//Set
	public String setNombre(String nombre) {
		return this.nombre = nombre;
	}
	
	public double setPrecio(double precio) {
		return this.precio = precio;
	}
	
	public String setColor(String color) {
		return this.color = color;
	}
	
	public double setPeso(double peso) {
		return this.peso = peso;
	}
	
	public int setConsumo(int consumo) {
		return this.consumo = consumo;
	}
	
	
	//Get
	public String getNombre() {
		return this.nombre;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public int getConsumo() {
		return this.consumo;
	}
	
	//Bajo consumo
	public boolean getBajoConsumo() {
		boolean bajoConsumo = false; 
		if(this.consumo<MAXCONSUMO) {
			return bajoConsumo = true;
		}
		else
			return bajoConsumo;
	}
	
	//Balance
	public double getBalance() {
		double balance = 0;
		balance = (this.precio/this.peso);
		return balance;
	}
	
	//Alta gama
	public boolean getAltaGama() {
		boolean altaGama = false;
		if(getBalance()>MAXBALANCE) {
			return altaGama = true;
		}
		else 
			return altaGama;
	}
	
}







