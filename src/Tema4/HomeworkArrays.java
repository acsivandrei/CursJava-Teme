package Tema4;

import java.util.Scanner;

public class HomeworkArrays {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number between 1 and 12:");
		int answear = scan.nextInt();
								
		String [] month = new String [13];
		month[0] = "Please enter a valid number!";
		month[1] = "January";
		month[2] = "February";
		month[3] = "March";
		month[4] = "April";
		month[5] = "May";
		month[6] = "June";
		month[7] = "July";
		month[8] = "August";
		month[9] = "September";
		month[10] = "October";
		month[11] = "November";
		month[12] = "December";
		
		try {
			System.out.println(month[answear]);
		} catch (Exception e) {
			System.out.println("Please enter a valid number!");
		}
		
		do {
			System.out.println("Please enter a number between 1 and 12:");
			answear = scan.nextInt();
		}while((answear<1)&&(answear>12));
	}
}	
				
	

