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
		Employee employee = new Employee();
		Scanner scanner = new Scanner(System.in);
		int empId = scanner.nextInt();
		scanner.nextLine();
		String empName = scanner.nextLine();
		employee.login(empId, empName);
		employee.work();
		employee.logout();
			
		

        System.out.println("Enter Array");
        int array[]=new int[5];
        for(int i=0;i<6;i++) {
        	array[i]=scanner.nextInt();
        }
	}
}
