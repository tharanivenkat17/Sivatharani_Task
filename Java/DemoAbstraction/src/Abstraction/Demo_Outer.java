package Abstraction;
import java.util.*;
import java.util.Scanner;

public class Demo_Outer {

	public static void main(String[] args) {
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
        
        System.out.println("Enter Array");
        int array[]=new int[5];
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<6;i++) {
        	array[i]=scan.nextInt();
        }
        
	}
}
