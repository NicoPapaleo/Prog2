package Persona;
import java.time.LocalDate;
import java.time.Period;

public class Persona {
	
	//---------------Atributos----------------
	
	private String nombre;
	private String apellido;
	private int edad;
	private LocalDate fechaDeNacimiento;
	private int dni;
	private char sexo;
	private double peso;
	private double altura;
	
	public static final int MAYOREDAD = 18;
	public static final int VOTA = 16;
	public static final double ESTADOMIN = 18.5;
	public static final double ESTADOMAX = 25;
	
	//------------------Constructores------------------

	public Persona() { //--------Valores por defecto----------
		fechaDeNacimiento = LocalDate.of(2000,01,01);
		nombre = "N";
		apellido = "N";
		sexo = 'F';
		peso = 1;
		altura = 1;
	}
	
	public Persona(int dni) {
		this.dni = dni;
	}
	
	public Persona(int dni, String nombre, String apellido) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public Persona(int dni, String nombre, String apellido, LocalDate fechaDeNacimiento) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	//----------------Metodos----------------------
	
	//Get
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public LocalDate getFechaDeNacimiento() {
		return this.fechaDeNacimiento;
	}
	
	public int getDni() {
		return this.dni;
	}
	
	public char getSexo() {
		return this.sexo;
	}
	
	public double peso() {
		return this.peso;
	}
	public double altura() {
		return this.altura;
	}
	
	
//Set
	
	public String setNombre(String nuevoNombre) {
		return this.nombre= nuevoNombre;
	}
	
	public String setApellido(String nuevoApellido) {
		return this.nombre = nuevoApellido;
	}
	
	public int setEdad(int nuevaEdad) {
		return this.edad = nuevaEdad;
	}
	
	public LocalDate setFechaDeNacimiento(LocalDate nuevaFechaDeNacimiento) {
		return this.fechaDeNacimiento = nuevaFechaDeNacimiento;
	}
	
	public int setDni(int nuevoDni) {
		return this.dni = nuevoDni;
	}
	
	public char setSexo(char nuevoSexo) {
		return this.sexo = nuevoSexo;
	}
	
	public double setPeso(double nuevoPeso) {
		return this.peso = nuevoPeso;
	}
	public double setAltura(double nuevaAltura) {
		return this.altura = nuevaAltura;
	}
	
	//Masa Corporal
	public double setMasaCorporal() {
		return this.peso/(this.altura*this.altura);
	}
	
//get
	
	//Esta en forma
	public boolean getEstado() {
		boolean estado=false;
		if(this.setMasaCorporal()>ESTADOMIN && this.setMasaCorporal()<ESTADOMAX) 
			return estado=true;
		else
			return estado;
	}
	
	//Cumpleaños
	public boolean getCumpleanios() {
		boolean cumpleanios = false;
		LocalDate fechaActual = LocalDate.now();
		if(this.getFechaDeNacimiento().getMonth()==fechaActual.getMonth()
				&& this.getFechaDeNacimiento().getDayOfMonth()==fechaActual.getDayOfMonth()) {
			return cumpleanios=true;
		}
		else
			return cumpleanios;
	}
	
	//Mayor de edad
	public boolean getMayorEdad() {
		boolean mayorEdad = false;
		LocalDate fechaActual = LocalDate.now();
		Period periodo = Period.between(this.fechaDeNacimiento, fechaActual);
		if(periodo.getYears()>=MAYOREDAD)
			return mayorEdad = true;
		else
			return mayorEdad;
	}
	
	//Vota
	public boolean getPuedeVotar() {
		boolean vota = false;
		LocalDate fechaActual = LocalDate.now();
		Period periodo = Period.between(this.fechaDeNacimiento, fechaActual);
		if(periodo.getYears()>=VOTA)
			return vota=true;
		else
			return vota;
	}
	
	//Edad correcta
	public boolean validarEdad() {
		boolean validacion = false;
		LocalDate fechaActual = LocalDate.now();
		Period periodo = Period.between(this.fechaDeNacimiento, fechaActual);
		if(periodo.getYears()==this.edad)
			return validacion = true;
		else
			return validacion;
	}
	
	//Informacion de Persona
	public void getInfoPersona() {
		System.out.println("Nombre y apellido: " + this.nombre + " " + this.apellido +
							"\nEdad: " + this.edad +
							"\nFecha de nacimiento: " + this.fechaDeNacimiento +
							"\nDNI: " + this.dni +
							"\nSexo: " + this.sexo +
							"\nPeso: " + this.peso +
							"\nAltura: " + this.altura);
	}
	
}












