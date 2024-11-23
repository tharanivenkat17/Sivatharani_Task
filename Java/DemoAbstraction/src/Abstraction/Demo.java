package Abstraction;

import java.util.Scanner;
abstract class Company{
	abstract void login();
	abstract void login(int empId, String empName);
	abstract void work();
	abstract void logout();
}
class Employee extends Company{
	void login() {
		System.out.println("Logged In");
	}
	void login(int empId, String empName) {
		System.out.println(empId + "  " + empName + "  " + "Logged In");
	}
	void work() {
		System.out.println("At Work");
	}
	void logout() {
		System.out.println("Logged Out");
	}
}

public class Demo {
	public static void main(String[] args) {
		Employee e = new Employee();
		Scanner scan = new Scanner(System.in);
		int empId = scan.nextInt();
		scan.nextLine();
		String empName = scan.nextLine();
		e.login(empId, empName);
		e.work();
		e.logout();
			
	}
}
