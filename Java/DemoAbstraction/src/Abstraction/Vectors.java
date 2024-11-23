package Abstraction;

import java.util.Vector;

public class Vectors {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<>();
        
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Kiwi");
        
        System.out.println(vector);
        System.out.println("index 1 - " + vector.get(1));
        vector.remove("Banana");
        System.out.println(vector.size()); 
        System.out.println(vector.contains("Mango"));
        for (String fruit : vector) {
            System.out.println(fruit);
        }

	}

}