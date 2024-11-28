package task;

import java.util.Scanner;

class ReverseStrings{
	void reverse() {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		String reverseString ="";
		char character;
		for(int i=0;i<name.length();i++) {
			character = name.charAt(i);
			reverseString = character + reverseString;
		}
		System.out.println("Reversed String: "+reverseString);
	}
}

public class ReverseString {

	public static void main(String[] args) {
		ReverseStrings reversestrings = new ReverseStrings();
		reversestrings.reverse();

	}

}
