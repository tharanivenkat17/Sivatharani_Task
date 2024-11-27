package Abstraction;

import java.util.Set;
import java.util.HashSet;

class HashSets{
	void display() {
		Set<Integer> hashset= new HashSet<>();
		hashset.add(12);
		hashset.add(93);
		hashset.add(47);
		hashset.add(12);
		System.out.println(hashset);
		System.out.println(hashset.contains(93));
		System.out.println(hashset.contains(98));
		hashset.remove(12);
		System.out.println(hashset);
		System.out.println(hashset.isEmpty());
		System.out.println(hashset.size());
		
		Set<Integer> hashset1= new HashSet<>();
		hashset1.add(13);
		hashset1.add(94);
		hashset1.add(45);
		hashset1.add(13);
		hashset.addAll(hashset1);
		System.out.println(hashset);
		for(int number : hashset) {
			System.out.println(number);
		}
		hashset.removeAll(hashset1);
	}
}

public class Sets {

	public static void main(String[] args) {
		HashSets hashsets = new HashSets();
		hashsets.display();
	}

}
