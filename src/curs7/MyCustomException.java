package curs7;

public class MyCustomException extends Exception {
	
	public MyCustomException(String mesaj) {
		super(mesaj); 
		
		//this-->face referinta catre obiectul clasei in care se afla
		//super->facem referinta catre obiectul clasei parinte
		
		//in aceasi clasa:
		//String nume-->this.nume
		//ClasaParinte contine String prenume si faci referire la el in clasa copil
		//ClasaCopil-->super.prenume
		
	}

}
