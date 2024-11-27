package Abstraction;

class OuterClass {
    private class PrivateClass {
        void display() {
            System.out.println("Inside private nested class");
        }
    }

    void Class() {
        PrivateClass inner = new PrivateClass();
        inner.display();
    }
}

public class class_Private {

	public static void main(String[] args) {
		OuterClass outerclass = new OuterClass();
		outerclass.Class();

	}

}
