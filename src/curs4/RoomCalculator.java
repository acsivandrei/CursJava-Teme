package curs4;

public class RoomCalculator {

	public static void main(String[] args) {
		
		Rectangle obiect = new Rectangle();
		obiect.calculeazaAria();
		obiect.calculeazaPerimetrul();
		
		//System.out.println(obiect.calculeazaAria());
		
		
		System.out.println(obiect.calculeazaPerimetrul());
		//calculeazaPerimetrul()=8
		int num3 = obiect.calculeazaPerimetrul() + 2;
			
		
		Rectangle obiect2 = new Rectangle(3,3);
		obiect2.calculeazaAria();
		System.out.println(obiect2.calculeazaPerimetrul());
		
		

	}

}
