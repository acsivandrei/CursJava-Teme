package Tema;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		System.out.println("Introdu numarul:");
		Scanner scan = new Scanner(System.in);
		String ziuaSaptamanii = scan.next();
		
		switch(ziuaSaptamanii) {
		
		case "1" :
			System.out.println("Ziua saptamanii este Luni!");
			break;
			
		case "2" :
			System.out.println("Ziua saptamanii este Marti!");
			break;
			
		case "3" :
			System.out.println("Ziua saptamanii este Miercuri!");
			break;
			
		case "4" :
			System.out.println("Ziua saptamanii este Joi!");
			break;
			
		case "5" :
			System.out.println("Ziua saptamanii este Vineri!");
			break;
		
		case "6" :
			System.out.println("Ziua saptamanii este Sambata!");
			break;
			
		case "7" :
			System.out.println("Ziua saptamanii este Duminica!");
			break;
			
		default:
			System.out.println("Te rugam sa inroduci un numar intre 1 si 7!");
		
		}

	}

}
