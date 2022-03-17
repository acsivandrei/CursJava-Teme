package curs7;

public class AgeVerifier {
	
	public void CheckAgeLimit(int age) throws MyCustomException {
		if(age<18) {
			throw new MyCustomException("Invalid age to proceed!");
		}else {
			System.out.println("You are allowed!");
		}
	}

}
