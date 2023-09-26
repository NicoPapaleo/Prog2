package Alarma;

public class AlarmaLuminosa extends Alarma {
	private boolean luz;
	
	public AlarmaLuminosa(boolean timbre,boolean luz) {
		super(timbre);
		this.luz = luz;
	}
	
	@Override
	public void sonar() {
		System.out.println("¡Piu Piu Piu!");
		System.out.println("¡Luz encendida!");
	}

}
