package curs5;

public class TeranaryOperator {

	public static void main(String[] args) {
		
		int num1 = 40;
		int num2 = 20;
		
		int var = (num1>num2) ? num1 : num2;
		//chestia de sus inseamna chestia de jos
		if(num1>num2) {
		var = num1;	
		}else {
			var = num2;
		}
		System.out.println(var);
	}
}
