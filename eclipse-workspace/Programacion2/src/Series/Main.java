package Series;

public class Main {

	public static void main(String[] args) {
		Serie serie = new Serie ("Nico Programa", "Es Nico programando", "Nico", "Ficcion", 3, new int[] {5,7,6});
		
		serie.calificarEpisodio(0, 2, 4);
		serie.calificarEpisodio(1, 4, 3);
		serie.calificarEpisodio(1, 6, 5);
		
        System.out.println("Total de episodios vistos de la serie: " + serie.getTotalEpisodiosVistos());
        System.out.println("Promedio de calificaciones de la serie: " + serie.getPromedioCalificaciones());
        System.out.println("¿Se vieron todos los episodios de la serie? " + serie.seVieronTodosLosEpisodios());
	}

}
