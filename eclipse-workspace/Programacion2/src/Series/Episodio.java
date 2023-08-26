package Series;

public class Episodio extends Temporada{
	
	//Atributos
	private String tituloEpi;
	private String descripcionEpi;
	private boolean visto;
	private int calificacion;
	

	public Episodio(String titulo, String descripcion, String creador, String genero, int cantidadTemporadas,
			int[] episodiosPorTemporada) {
		super(titulo, descripcion, creador, genero, cantidadTemporadas, episodiosPorTemporada);
		// TODO Auto-generated constructor stub
	}

	//Metodos
	public void calificarEpisodio(int calificacion) {
		if(calificacion>=1 && calificacion<=5) {
			this.calificacion = calificacion;
		}
		else
			System.out.println("El valor de calificacion es incorrecto.");
	}
	
	public int getCalificacion() {
		return this.calificacion;
	}
	
	public void marcarVisto() {
		this.visto = true;
	}
	
	public boolean estaVisto() {
		return this.visto;
	}
	
	public String getTituloEpi() {
		return this.tituloEpi;
	}
	public String getDescripcionEpi() {
		return this.descripcionEpi;
	}
	
}
