package curs6;

public class StringComparison {

	public static void main(String[] args) {
		
		String firstString = "Java";
		String secondString = "automation";
		String thirdString = "Java";
		String forthString = new String ("Java");
		
		System.out.println("==");
		System.out.println(firstString == secondString);
		System.out.println("equals");
		System.out.println(firstString.equals(secondString));
		
		System.out.println("-------------------------------");
		
		System.out.println("==");
		System.out.println(firstString == thirdString);
		System.out.println("equals");
		System.out.println(firstString.equals(thirdString));
		
		System.out.println("-------------------------------");
		
		System.out.println("==");
		System.out.println(firstString == forthString);
		System.out.println("equals");
		System.out.println(firstString.equals(forthString));

	}

}
