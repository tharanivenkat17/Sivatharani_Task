package Abstraction;

import java.util.Stack;

class StackClass{
	void display() {
		Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Kiwi");

        System.out.println(stack.peek()); 
        System.out.println(stack.pop()); 
        System.out.println(stack.empty()); 
        System.out.println(stack.search("Apple")); 
        System.out.println( stack.size()); 
        stack.clear();
        System.out.println( stack.empty());  
	}
}

public class Stacks {

	public static void main(String[] args) {
		StackClass stackclass = new StackClass();
		stackclass.display();
	}

}
