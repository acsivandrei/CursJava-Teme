package Tema3;

public class Bicicleta extends Vehicul{
	
	public Bicicleta(String Brand, int nivelPoluare, int vitezaMedie) {
		setBrand(Brand);
		setNivelPoluare(nivelPoluare);
		setVitezaMedie(vitezaMedie);
	}	
	@Override
	public String nume() {
		return "bicicleta ";
	
	}
	@Override
	public String motorizare() {
		return "benzina";
		
	}
	}


	
	
	

