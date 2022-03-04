package curs2;

public class ParSauImpar {

	public static void main(String[] args) {
	
		int number = 8;
				
		if(number % 2 == 0) {
			
			System.out.println( number + " este par!");
		}else {
			System.out.println( number + " este impar!");
	
		}
	
		ParSauImpar obiect = new ParSauImpar();
		obiect.verificareParSauImpar(4);
		
		
		
	}
	public void verificareParSauImpar(int number) {
				
		if(number % 2 == 0) {
			
			System.out.println( number + " este par!");
		}else {
			System.out.println( number + " este impar!");
	
}
	
	}
}
