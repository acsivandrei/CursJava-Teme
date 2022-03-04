package curs1;

public class ExampleVariables {

	String prenume = "Oana";//instance variable -- am nevoie de un obiect al clasei pentru a o accesa
	
	static String greetings = "Numele meu este : ";//variabila statica -- poate fii chemata fara o instanta a clasei
	
	//metoda principala de executie
	public static void main(String[] args) {
		
		//obiectul clasei care imi permite sa accesez variabilele si metodele din clasa respectiva
		ExampleVariables numeobiect = new ExampleVariables();
		
		
		//System.out.println(numeobiect.prenume);
		
		//numeobiect.printNume();
		
		//System.out.println(greetings);
		
		System.out.println(greetings + numeobiect.printNume());
		
	}
	
	public String printNume( ) {
		String nume = "Ion ";//local variable
		return nume + prenume;
	}
		
}
