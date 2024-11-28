package Abstraction;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class ArrayListClass{
	void method() {
		List<String> arraylist = new ArrayList<>();
		//Add elements
		arraylist.add("Siva");
		arraylist.add("Ram");
		arraylist.add("Sam");
		arraylist.add("Siva");
		
		System.out.println(arraylist);
		System.out.println(arraylist.contains("John"));
		System.out.println(arraylist.get(2));
		arraylist.set(2, "Kiran");
		System.out.println(arraylist);
		System.out.println(arraylist.indexOf("Ram"));
		
		Collections.sort(arraylist);
		for(String name : arraylist) {
			System.out.println(name);
		}
		arraylist.remove(3);
		System.out.println();
		Collections.sort(arraylist , Collections.reverseOrder());
		for(String name : arraylist) {
			System.out.println(name);
		}
		arraylist.removeAll(arraylist);
		System.out.println(arraylist);	
	}
	
	void floatMethod() {
		Collection<Double> collection = new ArrayList<>();
        collection.add(123.0);
        collection.add(1234.0);
        collection.add(654.0);
        collection.add(123.0);

        // Using specific collection class methods
        System.out.println("Collection contains 123.0: " + collection.contains(123.0));
        System.out.println("Size of collection: " + collection.size());

        // Iterating through collection elements
        for (double item : collection) {
            System.out.println(item);
        }
        
        Collection<Integer> collect = new ArrayList<>();
        collect.add(123);
        collect.add(1234);
        collect.add(654);
        collect.add(123);

        // Using specific collection class methods
        System.out.println("Collection contains '123': " + collect.contains(123));
        System.out.println("Size of collection: " + collect.size());

        // Iterating through collection elements
        for (Integer item : collect) {
            System.out.println(item);
        }  
        

	}
}

public class ArrayLists {

	public static void main(String[] args) {
		ArrayListClass arraylistclass = new ArrayListClass();
		arraylistclass.method();
		arraylistclass.floatMethod();
	}

}
