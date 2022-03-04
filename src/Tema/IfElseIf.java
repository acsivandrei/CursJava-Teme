package Tema;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		
		System.out.println("Ce varsta ai?");
		
		Scanner scan = new Scanner (System.in);
		int varsta = scan.nextInt();
		
		if(varsta >=65) {
			System.out.println("Esti batran!");
			
		}else if((varsta >=18)&&(varsta <=64)) {
			System.out.println("Esti adult!");
			
		}else if(varsta <=17) {
			System.out.println("Esti minor!");
			
		}
		
		
	}
}


