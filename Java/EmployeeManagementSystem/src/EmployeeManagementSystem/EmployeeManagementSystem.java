package EmployeeManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

class Employee{
	private int EmployeeId;
	private String EmployeeName;
	private String Position;
	
	//Default Constructor
	public Employee() {
		
	}
	//Constructor
	public Employee(int EmployeeId, String EmployeeName, String Position){
		this.EmployeeId = EmployeeId;
		this.EmployeeName = EmployeeName;
		this.Position = Position;
	}
	//Getter
	public int getEmployeeId(){
		return EmployeeId;
	}
	public String getEmployeeName(){
		return EmployeeName;
	}
	public String getPosition(){
		return Position;
	}
	
	//Display
	void display() {
		System.out.println(getEmployeeId());
		System.out.println(getEmployeeName());
		System.out.println(getPosition());
	}
	void delete() {
	}
}

class Data extends Employee{
	Scanner scanner = new Scanner(System.in);
	// Method to Add Employee Details
	void addEmployee() {
		System.out.println("Enter Employee Id");
		int EmployeeId = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Employee Name");
		String EmployeeName = scanner.nextLine();
		System.out.println("Enter Employee Position");
		String Position = scanner.nextLine();
		Employee employee = new Employee( EmployeeId ,EmployeeName, Position);
		employee.display();
		choice();
	}
	
	// Method to Display Employee Details
	void viewEmployee() {
		display();
	}
	
	// Method to Delete Employee Details
	void deleteEmployee() {
		delete();
	}
	
    void choice(){
    	System.out.println("\nEmployee Management System");
        System.out.println("1. Add Employee");
        System.out.println("2. View Employees");
        System.out.println("3. Delete Employee");
        System.out.println("4. Exit");
        System.out.print("Enter Your Choice ");
        int choice = scanner.nextInt();
        scanner.nextLine();
            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    viewEmployee();
                    break;
                case 3:
                    deleteEmployee();
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
		}
}

public class EmployeeManagementSystem {
	public static void main(String[] args) {
		Data data = new Data();
		data.addEmployee();
		data.viewEmployee();
		data.deleteEmployee();
	}
}
