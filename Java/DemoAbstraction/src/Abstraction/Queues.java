package Abstraction;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class LinkedListQueue{
	void display() {
		System.out.println("Linked List Queue");
		Queue<Integer> queue = new LinkedList<>();
        
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.add(50);
        System.out.println(queue);
        System.out.println("Removed: " + queue.poll()); 
        System.out.println("First element: " + queue.peek());
        queue.poll();
        queue.poll();
        System.out.println("Is queue empty? " + queue.isEmpty());

	}
}

class PriorityQueues{
		void show() {
			System.out.println("Priority Queue");
			Queue<Integer> pqueue = new PriorityQueue<>();
	        
	        pqueue.offer(30);
	        pqueue.offer(10);
	        pqueue.offer(20);
	        System.out.println(pqueue); 
	        System.out.println(pqueue.poll()); 
	        System.out.println(pqueue.poll());
	        System.out.println(pqueue.isEmpty());
		}
}

public class Queues {

	public static void main(String[] args) {
		LinkedListQueue linkedlistqueue = new LinkedListQueue();
		linkedlistqueue.display();
		
		PriorityQueues priorityqueues = new PriorityQueues();
		priorityqueues.show();

	}

}
