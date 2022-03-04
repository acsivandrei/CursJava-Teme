package Tema;

import java.util.Scanner;

public class IFELSE {

	public static void main(String[] args) {

		System.out.println("Ce nota ai obtinut la test?");
		
		Scanner scan = new Scanner(System.in);
		int punctaj = scan.nextInt();
				
		if(punctaj <=65) {
			
			System.out.println("Ai picat. Mai incearca.");
			
		}else {
			System.out.println("Felicitari. Ai trecut!");
			
		}
		
		
		
		
		
		
				
	}

}
