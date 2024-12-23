package Abstraction;

class Calculate{
	int add(int n1, int n2) {
		return n1+n2;
	}
	int add(int n1, int n2, int n3) {
		return n1+n2+n3;
	}
	static  int add(int n1, int n2, int n3,int n4) {
		return n1+n2+n3+n4;
	}
}

class Student{
	  public void display() {
	    System.out.println("Students");
	  }
	}

	class CSE extends Student {
	  public void display() {
	    System.out.println("CSE");
	  }
	}

	class ECE extends Student {
	  public void display() {
	    System.out.println("ECE");
	  }
	}
	
interface Red{
		void red();
	}
interface Blue{
		void blue();
	}
class Paint implements Red,Blue{
	public void blue(){
		System.out.println("Blue");
	}
	public void red(){
		System.out.println("Red");
	}
}

	    
public class Polymorphism {
	public static void main(String[] args) {
		
		Calculate c= new Calculate();
		System.out.println(c.add(4, 9));
		System.out.println(c.add(4, 9,19));
		System.out.println(Calculate.add(4, 9,37,29));
		
		Student cse = new CSE(); 
	    Student ece = new ECE(); 
	    cse.display();
	    ece.display();
	    
	    Paint p = new Paint();
	    p.blue();
	    p.red();
	    
	}

}
