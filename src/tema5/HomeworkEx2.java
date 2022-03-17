package tema5;

public class HomeworkEx2 {

	public static void main(String[] args) {
		
		System.out.println("Eu invat Java");
		String[] sentence = {"Eu invat Java"};
		
		boolean flag = false;
		int counter = 0;
		
		for (int index=0; index<sentence.length; index++) {
			
			char vowelLetter = sentence.charAt(index);
			
			if (vowelLetter == 'A', 'E', "I", "O", "U" || vowelLetter == "a", "e", "i", "o", "u") {
				flag = true;
				counter++;
			}
		}
		if(flag) {
			System.out.println("Vocale: " + counter);
		}
			
		
	
}
}
