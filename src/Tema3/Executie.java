package Tema3;

public class Executie {

	public static void main(String[] args) {
		
	Vehicul bicicleta = new Bicicleta("Pegas", 30, 100);
	Executie main = new Executie();
	
	Vehicul masina = new Masina(" Logan", 10, 150);
	
	main.verificaMotorizarea(bicicleta);
	bicicleta.vehicul();
	main.verificaMotorizarea(masina);
	masina.vehicul();
	}
	public void verificaMotorizarea(Vehicul obj) {
		System.out.println(obj.nume());
		System.out.println(obj.motorizare());
}
}
