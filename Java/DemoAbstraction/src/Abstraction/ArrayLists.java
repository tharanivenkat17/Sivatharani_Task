package Abstraction;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class ArrayListClass{
	void method() {
		List<String> alist = new ArrayList<>();
		alist.add("Siva");
		alist.add("Ram");
		alist.add("Sam");
		alist.add("Siva");
		System.out.println(alist);
		System.out.println(alist.contains("John"));
		System.out.println(alist.get(2));
		alist.set(2, "Kiran");
		System.out.println(alist);
		System.out.println(alist.indexOf("Ram"));
		
		Collections.sort(alist);
		for(String name : alist) {
			System.out.println(name);
		}
		alist.remove(3);
		System.out.println();
		Collections.sort(alist , Collections.reverseOrder());
		for(String name : alist) {
			System.out.println(name);
		}
		alist.removeAll(alist);
		System.out.println(alist);	
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
