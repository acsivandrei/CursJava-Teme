package Tema3;

public class Vehicul {
	
	private String Brand;
	private int nivelPoluare;
	private int vitezaMedie;
	
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String Brand) {
		this.Brand = Brand;
	}
	public int getNivelPoluare() {
		return nivelPoluare;
	}
	public void setNivelPoluare(int nivelPoluare) {
		this.nivelPoluare = nivelPoluare;
	}
	public int getVitezaMedie() {
		return vitezaMedie;
	}
	public void setVitezaMedie(int vitezaMedie) {
		this.vitezaMedie = vitezaMedie;
	}
	
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
