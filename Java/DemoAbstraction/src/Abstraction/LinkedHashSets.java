package Abstraction;

import java.util.LinkedHashSet;
import java.util.Set;

class LinkedHashSetClass{
	void display() {
		Set<Integer> linkedhashset= new LinkedHashSet<>();
		linkedhashset.add(12);
		linkedhashset.add(93);
		linkedhashset.add(47);
		linkedhashset.add(12);
		System.out.println(linkedhashset);
		System.out.println(linkedhashset.contains(93));
		System.out.println(linkedhashset.contains(98));
		linkedhashset.remove(12);
		System.out.println(linkedhashset);
		System.out.println(linkedhashset.isEmpty());
		System.out.println(linkedhashset.size());
		Set<Integer> linkedhash= new LinkedHashSet<>();
		linkedhash.add(13);
		linkedhash.add(94);
		linkedhash.add(45);
		linkedhash.add(13);
		linkedhash.addAll(linkedhash);
		System.out.println(linkedhash);
		for(int number : linkedhash) {
			System.out.println(number);
		}
		linkedhash.removeAll(linkedhash);
	}
}

public class LinkedHashSets {

	public static void main(String[] args) {
		LinkedHashSetClass linkedhashsetclass = new LinkedHashSetClass();
		linkedhashsetclass.display();

	}

}
