package curs5;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		calc.askTheUser();
		calc.calculateValues();
		calc.prinResult();
	}
	//Calculator pentru operatiile de baza (+.-.*./) cu 2 numere
	//Numerele sunt date de la tastatura
	//La fel si operatia matematica
	//Printam operatia matematica si rezultatul: ex: 3 + 5 = 8
	
	//variabilele trebuie sa fie in alta metoda, deasupra 
	double num1;
	double num2;
	char calculus;
	double result;
	// aflam numerele si operatia
	public void askTheUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first number: ");
		num1 = scan.nextInt();
		System.out.println("Please enter the calculus: ");
		calculus = scan.next().charAt(0);
		System.out.println("Please enter first number: ");
		num2 = scan.nextInt();
	}
	//sa calculam
	public void calculateValues() {
		if (calculus == '+') {
			result = num1 + num2;
		}
		else if(calculus == '-') {
			result = num1 - num2;
		}else if(calculus == '*' || calculus == 'x') { //3 x 4
			result = num1 * num2;			
		}else if(calculus == '/') {
			result = num1 / num2;
		}else {
			System.out.println("Wrong character!");
		}
	}
	//sa printam
	public void prinResult() {
		System.out.println(num1 + " " + calculus + " " + num2 + " = " + result);
	}
}
