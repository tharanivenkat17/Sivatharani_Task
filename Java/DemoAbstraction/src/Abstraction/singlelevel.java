package Abstraction;

//SINGLE LEVEL
class Employees{
	int emp_id;
	String emp_name;
	void EmployeeDetail(int emp_id, String emp_name) {
		this.emp_id = emp_id;
		this.emp_name = emp_name;
	}
}

class Manager extends Employees{
	String position;
	void ManagerDetails(String position) {
		System.out.println(emp_id + " - " + emp_name + " - " + position );
	}
}


public class singlelevel {

	public static void main(String[] args) {
		//SINGLE LEVEL INHERITANCE
		Manager m = new Manager();
		m.EmployeeDetail(17, "siva");
		m.ManagerDetails("Manager");
	}

}
