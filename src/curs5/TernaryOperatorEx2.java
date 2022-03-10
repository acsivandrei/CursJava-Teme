package curs5;

import java.util.Scanner;

public class TernaryOperatorEx2 {

	//Citeste 2 numere
	//Verifica daca fiecare este pozitiv
	//Verifica daca ambele sunt pozitive
	//Verifica care este cel mai mic numar
	
	public static void main(String[] args) {
	
		int num1;
		int num2;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		num1 = scan.nextInt();
		System.out.println("Enter the second number: ");
		num2 = scan.nextInt();
		String answer;
		
	//Verifica daca fiecare este pozitiv
	//cazul 1 cu if else
		if(num1>0) {
			System.out.println("Number 1 is positive.");
		}else {
			System.out.println("Number 1 is negative.");
		}
	//cazul 2 cu ternary operator
		answer = (num1>0) ? "Number 1 is positive.":"Number is negative.";
		System.out.println(answer);
		
	//Verifica daca ambele sunt pozitive
	//cazul 1 - if else
		if(num1>0 && num2>0) {
			System.out.println("Number 1 and 2 are positive.");
		}else {
			System.out.println("One of the numbers is negative.");
		}
	//cazul 2 - ternary operator
		answer = (num1>0) && (num2>0) ? "Both are positive.":"One is negative.";
		System.out.println(answer);
		
	//Verifica care este cel mai mic numar
	//cazul 1 - if else
		if(num1<num2) {
			System.out.println("Num 1 is the smallest.");
		}else if(num1==num2) {
			System.out.println("Numbers are equal.");
		}else {
			System.out.println("Num 2 is the smallest.");
		}
		answer = num1==num2?"Numbers are equal.":num1<num2 ? "Num1 is the smalelrs":"Num2 is the smallest.";
		

	}

}
