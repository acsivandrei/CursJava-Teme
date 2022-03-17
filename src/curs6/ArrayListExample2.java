package curs6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample2 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(Arrays.asList("rosu", "negru", "galben", "maro"));
		
		System.out.println(list.size());
		
		for(String culoare : list) {
			System.out.println(culoare);
		}
		//String masina ---> substring(3,6) - (mas)ina
		System.out.println("---------------------------");
		list.subList(1, 3).clear();
		for(String culoare : list) {
			System.out.println(culoare);
		}
		System.out.println("---------------------------");
		String element = "maro";
		if(list.contains(element)) {
			System.out.println(element + " se afla in lista!");
		}else {
			System.out.println(element + "Nu se afla in lista!");
		}
		System.out.println("---------------------------");
		list.set(0, "galben");
		for(String culoare : list) {
			System.out.println(culoare);
		}
		list.add("oana");
		list.add("ion");
		list.add("maria");
		list.add("gabi");
		System.out.println(list.size());
		
		System.out.println("------------for each------------");
		for(String culoare : list) {
			System.out.println(culoare);
		}
		System.out.println("------------iterator------------");
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		

	}

}
