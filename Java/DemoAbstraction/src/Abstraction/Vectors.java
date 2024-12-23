package Abstraction;

import java.util.Vector;

class VectorClass{
	void display() {
		Vector<String> vector = new Vector<>();
        
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Kiwi");
        
        System.out.println(vector);
        System.out.println("index 1 - " + vector.get(1));
        vector.set(2, "Mango");
//        vector.remove("Banana");
        System.out.println(vector.size()); 
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        System.out.println(vector.get(1));
        System.out.println(vector.contains("Mango"));
        for (String fruit : vector) {
            System.out.println(fruit);
        }
	}
}

public class Vectors {
	public static void main(String[] args) {
		VectorClass vectorclass = new VectorClass();
		vectorclass.display();
	}

}
