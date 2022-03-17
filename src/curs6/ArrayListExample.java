package curs6;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("oana");
		list.add("ion");
		list.add("maria");
		list.add("gabi");
		
		System.out.println(list.size());
		System.out.println(list.get(0));
		System.out.println("--------------");
		
		for (String nume : list) {
			System.out.println(nume);
		}
		
		System.out.println("--------------");
		
		list.add(0, "ozzy");
		System.out.println(list.size());
		
		for(String nume : list) {
			System.out.println(nume);
		}
		
		System.out.println("--------------");
		
		list.remove(0);
		list.remove("maria");
		
		for(String nume : list) {
			System.out.println(nume);
		}
		
		System.out.println("-------X------");
		
		list.clear();
		
		for(String nume : list) {
			System.out.println(nume);
		}

	}

}
