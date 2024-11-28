package Abstraction;

import java.util.LinkedHashSet;
import java.util.Set;

class LinkedHashSetClass{
	void display() {
		Set<Integer> lhashset= new LinkedHashSet<>();
		lhashset.add(12);
		lhashset.add(93);
		lhashset.add(47);
		lhashset.add(12);
		System.out.println(lhashset);
		System.out.println(lhashset.contains(93));
		System.out.println(lhashset.contains(98));
		lhashset.remove(12);
		System.out.println(lhashset);
		System.out.println(lhashset.isEmpty());
		System.out.println(lhashset.size());
		Set<Integer> lhashset1= new LinkedHashSet<>();
		lhashset1.add(13);
		lhashset1.add(94);
		lhashset1.add(45);
		lhashset1.add(13);
		lhashset.addAll(lhashset1);
		System.out.println(lhashset);
		for(int number : lhashset) {
			System.out.println(number);
		}
		lhashset.removeAll(lhashset1);
	}
}

public class LinkedHashSets {

	public static void main(String[] args) {
		LinkedHashSetClass linkedhashsetclass = new LinkedHashSetClass();
		linkedhashsetclass.display();

	}

}
