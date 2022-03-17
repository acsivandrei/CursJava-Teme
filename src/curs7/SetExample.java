package curs7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		System.out.println(set.isEmpty());
		
		set.add("Rosu");
		set.add("Verde");
		set.add("Galben");
		set.add("Maro");
				
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-------------");
		
		for (String x : set) {
			System.out.println(x);
		}
		System.out.println("-------------");
		
		System.out.println(set.contains("mov"));
		System.out.println(set.contains("Rosu"));
		
		System.out.println("-------------");
		
		set.clear();
		
		for (String x : set) {
			System.out.println(x);
		}

	}

}
