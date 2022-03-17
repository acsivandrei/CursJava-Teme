package curs7;

import java.util.Scanner;

public class TryCatchExample1 {

	public static void main(String[] args) {
		
		//useless catch
		
		try {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Introdu un numar:");
			int num1 = scan.nextInt();
			
			System.out.println("Introdu un numar:");
			int num2 = scan.nextInt();
			System.out.println(num1/num2);
			
		}catch(NullPointerException e) {
			System.out.println("Error!");
		}

	}

}
