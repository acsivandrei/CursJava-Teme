package tema5;

public class HomeworkEx3 {

	public static void main(String[] args) {
		
		String[] myStringArray = {"Maria", "Bob", "Ion", "George", "Oana", "Bogdan", "Oana", "Ion"};
		System.out.println(myStringArray);
		
		boolean flag=false;
		
		for (int index=0; index<myStringArray.length; index++) {
			
			for(int index2=index+1; index2<myStringArray.length; index2++) {
				
				if(myStringArray[index]==myStringArray[index2]) {
					
					System.out.println("Duplicate names are: "+myStringArray[index]);
					flag=true;
				}
			}
		}
	}
}
