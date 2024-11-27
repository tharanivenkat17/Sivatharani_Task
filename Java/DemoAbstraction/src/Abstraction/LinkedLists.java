package Abstraction;

import java.util.LinkedList;
import java.util.List;

class LinkedListClass{
	void display() {
		List<String> alist = new LinkedList<>();
		alist.add("Siva");
		alist.addFirst("Ram");
		alist.addLast("Sam");
		alist.add("Sri");
		System.out.println(alist); 
		System.out.println(alist.getFirst()); 
		System.out.println(alist.getLast()); 
		System.out.println(alist.get(1)); 
		alist.set(2,"Kiran");
		System.out.println(alist.remove(1));
		System.out.println(alist.contains("John"));
		System.out.println(alist.isEmpty());
		System.out.println(alist.indexOf("Ram"));
		System.out.println(alist.lastIndexOf("Siva"));
	}
}

public class LinkedLists {
	public static void main(String[] args) {
		LinkedListClass linkedlistclass = new LinkedListClass();
		linkedlistclass.display();
	}

}
