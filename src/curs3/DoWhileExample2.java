package curs3;

import java.util.Scanner;

public class DoWhileExample2 {

	public static void main(String[] args) {
		
		int num;
		Scanner scan = new Scanner(System.in);
		
		//vreau sa intreb un numar
		//sa se opreasca in momentu in care numaru introdus de mine e 0
		//o face la infinit pana cand introduc eu 0
		
		do {
			System.out.println("Enter a number:");
			num = scan.nextInt();
			System.out.println(num*10);
			
		}while(num !=0);
		
		

	}

}
