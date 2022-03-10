package Tema4;

import java.util.Scanner;

public class HomeworkArrays {

	public static void main(String[] args) {
		
		
		System.out.println("Please enter a number between 1 and 12:");
		Scanner scan = new Scanner(System.in);
		int answear;
		answear = scan.nextInt();
								
		String [] month = new String [13];
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
		
		if((answear>=13)&&(answear<1)) {
			System.out.println("Please enter a valid number!");
		}else {
			System.out.print(month.length);
		}
		
		for(int i=0; i<month.length; i++) {
			System.out.print(month[i]);
			break;
		}
	
	}

}
