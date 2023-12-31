package Series;

public class Serie {
	
	//Atributos
	private String titulo;
	private String descripcion;
	private String creador;
	private String genero;
	private Temporada[] temporadas;

	public Serie(String titulo, String descripcion, String creador, String genero, int cantidadTemporadas, int[]episodiosPorTemporada) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.creador = creador;
		this.genero = genero;
		temporadas = new Temporada[cantidadTemporadas];
		for(int i=0; i< cantidadTemporadas;i++) {
			temporadas[i] = new Temporada(genero, genero, genero, genero, episodiosPorTemporada[i], episodiosPorTemporada);
		}
	}
	
	//Metodos
	public void calificarEpisodio(int numeroTemporada, int numeroEpisodio, int calificacion) {
		temporadas[numeroTemporada].calificarEpisodio(numeroEpisodio, calificacion);
	}
	public int getTotalEpisodiosVistos() {
		int totalVistos = 0;
		for(Temporada temporada : temporadas) {
			totalVistos += temporada.getTotalEpisodiosVistos();
		}
		return totalVistos;
	}
	
	public double getPromedioCalificaciones() {
		int totalCalificaciones =0;
		int totalEpisodiosVistos =0;
		for (Temporada temporada : temporadas) {
			totalCalificaciones += temporada.getPromedioCalificaciones();
			totalEpisodiosVistos += temporada.getTotalEpisodiosVistos();
		}
		if (totalEpisodiosVistos == 0) {
			return 0.0;
		}
		return (double) totalCalificaciones / totalEpisodiosVistos;
	}
	
	public boolean seVieronTodosLosEpisodios() {
		for (Temporada temporada : temporadas) {
			if (temporada.getTotalEpisodiosVistos()< temporada.getCantidadEpisodios()) {
				return false;
			}
		}
		return true;
	}

	
	public void getDatosCompletos() {
		System.out.println("Nombre: " + this.titulo +
							//"\nTemporada: " + this.temporada + 
							"\nGenero: " + this.genero + 
							"\nDescripcion: " + this.descripcion +
							"\nCreador: " + this.creador);
	}
}
