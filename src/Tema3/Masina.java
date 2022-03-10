package Tema3;

public class Masina extends Vehicul {
	
	public Masina(String Brand, int nivelPoluare, int vitezaMedie) {
		setBrand(Brand);
		setNivelPoluare(nivelPoluare);
		setVitezaMedie(vitezaMedie);
	}
	@Override
	public String nume() {
		return "Dacia";
	}
	@Override
	public String motorizare() {
		return "benzina";
	}
	
	}
