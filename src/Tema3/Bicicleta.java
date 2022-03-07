package Tema3;

public class Bicicleta extends Vehicul{
	
	public Bicicleta(String Brand, int nivelPoluare, int vitezaMedie) {
		setBrand(Brand);
		setNivelPoluare(nivelPoluare);
		setVitezaMedie(vitezaMedie);
		
	}	
	@Override
	public String nume() {
		return toString();
		
	}
	public String motorizare() {
		return toString();
		
	}
	public void vehicul() {
		System.out.println("Nivelul de poluare pentru masina " + getBrand() +" este " + getNivelPoluare() + " si viteza medie atinsa este de " + getVitezaMedie());
		
	}
	
}

	
	
	

