package Abstraction;


class Employee2{
	int empl_id;
	String empl_name;
	void EmployeeDetails(int empl_id, String empl_name) {
		this.empl_id = empl_id;
		this.empl_name = empl_name;
	}
}
class Manager1 extends Employee2{
	String manager = "Sandhya";
}

class Developer extends Manager1{
	String dept = "Developer";
}
class JavaDeveloper extends Developer{
	String position1;
	void JavaDeveloperDetails(String position){
		this.position1 = position;
		System.out.println(empl_id + " - " + empl_name + " - " + manager +  " - " + dept + " - " + position1);
	}
}
class ReactDeveloper extends Developer{
	String position2;
	void ReactDeveloperDetails(String position){
		this.position2 = position;
		System.out.println(empl_id + " - " + empl_name + " - " + manager +  " - " + dept + " - " + position2);
	}
}
public class multiLevel {

	public static void main(String[] args) {
			JavaDeveloper j = new JavaDeveloper();
			j.EmployeeDetails(123 , "siva");
			j.JavaDeveloperDetails("Java Developer");
			
			ReactDeveloper r = new ReactDeveloper();
			r.EmployeeDetails(129 , "tharani");
			r.ReactDeveloperDetails("React Developer");
	}
}
