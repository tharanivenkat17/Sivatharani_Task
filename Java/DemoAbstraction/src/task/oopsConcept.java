package task;
import java.util.Scanner;
// ABSTRACTION
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
	
	private String emp_name;
	private int emp_id;
	
	// CONSTRUCTOR
	public Employee(){
//		System.out.println("Inside Constructor");
	}
	
	public Employee(int emp_id,String emp_name){
		System.out.println("ENCAPSULATION");
		System.out.println(emp_id);
		System.out.println(emp_name);
	}
	
	//SETTER
	public void setData(int emp_id, String emp_name) {
		this.emp_id = emp_id;
		this.emp_name = emp_name;
	}
	
	//GETTER
	public int getId() {
		return emp_id;
	}
	public String getName() {
		return emp_name;
	}
}


public class oopsConcept {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Employee Id");
		int emp_id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Employee Name");
		String emp_name = scanner.nextLine();
		//ENCAPSULATION
		Employee employee = new Employee();
//		Employee e = new Employee(emp_id,emp_name);
		
		// SETTER AND GETTER
		System.out.println();
		System.out.println("CONSTRUCTOR");
		employee.setData(emp_id,emp_name);
//		System.out.println(e.getId());
//		System.out.println(e.getName());
		
		// ABSTRACTION
//		System.out.println("ABSTRACTION");
		Employee employee1 = new Employee();
		employee1.login(emp_id, emp_name);
		employee1.work();
		employee1.logout();
	}
}
