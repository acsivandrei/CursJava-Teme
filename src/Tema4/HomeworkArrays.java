package Tema4;

import java.util.Scanner;

public class HomeworkArrays {

	public static void main(String[] args) {
		
		int answear;
		do {	
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number between 1 and 12:");
		answear = scan.nextInt();
		if(answear<0 || answear>12);
		System.out.println("Please enter a valid number!");
		}while(answear<0 || answear>12);
		
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
		
		System.out.println(month[answear]);
		
	}
}	
