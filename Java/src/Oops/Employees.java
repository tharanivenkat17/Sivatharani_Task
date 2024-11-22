package Oops;

import java.util.Scanner;

abstract class Company{
	abstract void login(int emp_id, String emp_name);
	abstract void work();
	abstract void logout();
	String emp_name;
	int emp_id;
}
class Employee extends Company{
	void login(int emp_id, String emp_name) {
		System.out.println(emp_id + "  " + emp_name + "  " + "Logged In");
		work();
	}
	void work() {
		System.out.println(emp_name + " is at Work");
		logout();
	}
	void logout() {
		System.out.println(emp_id + " is Logged Out");
	}
	
	void EmployeeDetails(int emp_id, String emp_name) {
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		login(emp_id, emp_name);
	}
}


class Manager1 extends Employee{
	String manager = "Sandhya";
}

class Developer extends Manager1{
	String dept = "Developer";
}
class JavaDeveloper extends Developer{
	String position1;
	void JavaDeveloperDetails(String position){
		this.position1 = position;
		System.out.println(emp_id + " - " + emp_name + " - " + manager +  " - " + dept + " - " + position1);
	}
}
class ReactDeveloper extends Developer{
	String position2;
	void ReactDeveloperDetails(String position){
		this.position2 = position;
		System.out.println(emp_id + " - " + emp_name + " - " + manager +  " - " + dept + " - " + position2);
	}
}

public class Employees {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int emp_id = scan.nextInt();
		scan.nextLine();
		String emp_name = scan.nextLine();
		
		JavaDeveloper j = new JavaDeveloper();
		j.EmployeeDetails(123 , "siva");
		j.JavaDeveloperDetails("Java Developer");
		
		ReactDeveloper r = new ReactDeveloper();
		r.EmployeeDetails(129 , "tharani");
		r.ReactDeveloperDetails("React Developer");
	}

}
