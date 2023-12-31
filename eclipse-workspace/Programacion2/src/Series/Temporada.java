package Series;

public class Temporada extends Serie {
	
	//Atributos
	private Episodio[] episodios;


	
	public Temporada(String titulo, String descripcion, String creador, String genero, int cantidadTemporadas,
			int[] episodiosPorTemporada) {
		super(titulo, descripcion, creador, genero, cantidadTemporadas, episodiosPorTemporada);
	}

	//Metodos
	public void calificarEpisodio(int numeroEpisodio, int calificacion) {
		episodios[numeroEpisodio].calificarEpisodio(calificacion);
	}
	
	public int getTotalEpisodiosVistos() {
		int totalVistos = 0;
		for(Episodio episodio : episodios) { //for (int i = 0; i < episodios.length; i++) {
			if(episodio.estaVisto()) {		 //    if (episodios[i].estaVisto()) {
				totalVistos++;				 //        totalVistos++;
			}								 //    }
		}									 //}
		return totalVistos;
	}
	
	public double getPromedioCalificaciones() {
		int sumaCalificaciones = 0;
		int totalEpisodiosVistos = 0;
		for(Episodio episodio : episodios) {
			if(episodio.estaVisto()) {
				sumaCalificaciones += episodio.getCalificacion();
				totalEpisodiosVistos++;
			}
		}
		if (totalEpisodiosVistos == 0) {
			return 0.0;
		}
		return (double) sumaCalificaciones/totalEpisodiosVistos;
	}
	
	public int getCantidadEpisodios() {
		int cantEpisodios = 0;
		for (int i=0; i<episodios.length;i++) {
			cantEpisodios++;
		}
		return cantEpisodios;
	}
	
}
