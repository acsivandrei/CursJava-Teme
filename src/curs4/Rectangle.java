package curs4;

public class Rectangle {
	
	//variable
	//private-->inseamna ca sunt disponibile doar in interiorul clasei in care se afla (rectangle in cazu asta)
	private int lenght;
	private int witdh;
	
	//constructorul default pe care nu il scriem il ia java direct
	
	public Rectangle() {}
	//constructoru cu parametrii
	public Rectangle(int num1, int num2) {
		setLenght(num1); //method call
		setWitdh(num2); //method call
	}
	
	//getter-->metode specifice care seteaza returneaza unei variable privata
	public int getLenght() {
		return lenght;
	}
	//setter-->metode specifice care seteaza valoarea unei variable privata
	private void setLenght(int lenght) {
		this.lenght = lenght;
	}
	public int getWitdh() {
		return witdh;
	}
	private void setWitdh(int witdh) {
		this.witdh = witdh;
	}
	
	//metoda java accesmodifier(public) returnType(void) numeMetoda(aici se afla parametrii) { aici se afla logica metodei}
	//void-->ca nu returneaza nimic
	//metoda asta va fi chemata: numeobj.calculeazaAria() ----> type este obiect
	public void calculeazaAria() {
		System.out.println("Aria este " + lenght * witdh);
		
	}
	
	//metoda java
	//return int
	//metoda asta va fi chemata: numeobj.calculeazaPerimetru() ----> type este obiect
	//la executie numeobj.calculeazaPerimetru() = (2*lenght) + (2*witdh);
	public int calculeazaPerimetrul() {
		
		return(2*lenght) + (2*witdh);
		
		
	}

	//public String nume() {
		
		
	//}
	
	
}
