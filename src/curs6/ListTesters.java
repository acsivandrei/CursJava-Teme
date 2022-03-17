package curs6;

import java.util.ArrayList;
import java.util.List;

public class ListTesters {

	public static void main(String[] args) {
		
		Tester t1 = new Tester("Oana", 25, "QA");
		Tester t2 = new Tester("Maria", 30, "DEV");
		Tester t3 = new Tester("Gabi", 32, "QA");
		
		List<Tester> listaTesteri = new ArrayList<>();
		listaTesteri.add(t1);
		listaTesteri.add(t2);
		listaTesteri.add(t3);
		
		System.out.println(t1.name);
		
		System.out.println(listaTesteri.get(0).name);
		System.out.println(listaTesteri.get(0).printCeva());
		
		for (Tester t : listaTesteri) {
			System.out.println(t.name + " | " + t.age + " | " + t.departament);
		}

	}

}
