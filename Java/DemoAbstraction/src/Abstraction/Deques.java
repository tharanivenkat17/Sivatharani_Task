package Abstraction;

import java.util.ArrayDeque;
import java.util.Deque;

class DequesClass{
	void display() {
		Deque<String> deque = new ArrayDeque<>();
		 
	     deque.addFirst("Front 1");
	     deque.addLast("Back 1");
	     deque.addFirst("Front 2");
	     deque.addLast("Back 2");

	     System.out.println(deque);
	     System.out.println( deque.removeFirst());
	     System.out.println(deque.removeLast()); 
	     System.out.println(deque);
	     System.out.println(deque.peekFirst()); 
	     System.out.println(deque.peekLast()); 
	     System.out.println(); 
	     
	     
	     Deque<Integer> stack = new ArrayDeque<>();
	     stack.push(10);
	     stack.push(20);
	     stack.push(30);
	     
	     System.out.println(stack);
	     System.out.println(stack.pop());
	     System.out.println(stack);
	}
}

public class Deques {

	public static void main(String[] args) {
		 DequesClass dequesclass = new DequesClass();
		 dequesclass.display();

	}

}
