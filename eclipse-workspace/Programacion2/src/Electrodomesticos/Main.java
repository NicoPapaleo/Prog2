package Electrodomesticos;

public class Main {

	public static void main(String[] args) {
		Electrodomestico electrodomestico1 = new Electrodomestico("Horno",10500.00,"Negro");
		electrodomestico1.setPeso(22.5);
		electrodomestico1.setConsumo(50);
		
		System.out.println(electrodomestico1.getBajoConsumo() ? "Es de bajo consumo." : "NO es de bajo consumo.");
		System.out.println("El balance es: " + electrodomestico1.getBalance());
		System.out.println(electrodomestico1.getAltaGama() ? "Es de alta gama." : "NO es de alta gama.");
	}

}
