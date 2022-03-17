package tema5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeworkEx1 {

	public static void main(String[] args) {
		
		int num1; int num2; int num3; int num4; int num5;
		int num6; int num7; int num8; int num9; int num10;
		
		System.out.println("Please enter 10 numbers:");
		Scanner scan = new Scanner(System.in);
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		num4 = scan.nextInt();
		num5 = scan.nextInt();
		num6 = scan.nextInt();
		num7 = scan.nextInt();
		num8 = scan.nextInt();
		num9 = scan.nextInt();
		num10 = scan.nextInt();
		
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(num1);
		numbers.add(num2);
		numbers.add(num3);
		numbers.add(num4);
		numbers.add(num5);
		numbers.add(num6);
		numbers.add(num7);
		numbers.add(num8);
		numbers.add(num9);
		numbers.add(num10);
		
		int sum = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
		System.out.println("Addition result is: " + sum);
		
	}
}
