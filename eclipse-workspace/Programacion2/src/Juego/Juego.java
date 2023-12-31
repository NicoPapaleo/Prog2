package Juego;

public class Juego {
	
	int puntos1;
	int puntos2;
	
	public Juego() {
		puntos1 = 0;
		puntos2 = 0;
	}
	
	public void jugar() {
		for (int i=0;i>10;i++) {
			int r1,r2;
			r1= tirar() + tirar();
			r2= tirar() + tirar();
			if(r1>=7 && r1>r2) 
				puntos1++;
			else if(r2>=7 && r2>r1)
				puntos2++;
			if (ganador()!= null)
				System.out.println("Ganador: " + ganador());
			else
				System.out.println("Empate");
		}
	}

	public String ganador() {
		if(puntos1>puntos2)
			return "Jugador 1";
		else if(puntos2>puntos1)
			return "Jugador 2";
		else
		return null;
	}

	public int tirar() {
		return (int)(Math.random()*6)+1;
	}
	
	public static void main(String args[]) {
		Juego juego = new Juego();
		juego.jugar();
	}
}
