package bbd1stJavaassignment;

public class Employee {
	String employeeName = "Sudhanshu Gupta";
	int UID = 8342790 ;
	void greeting() {System.out.println("Hola!! User.....");
	}

}

class Manager extends Employee{
	int age = 28;
	int salary = 100000;
	public static void main(String[] args){
	Manager Emp = new Manager();
	Emp.greeting();
	System.out.println("Name of the Employee: "+Emp.employeeName);
	System.out.println("UID of the Employee: "+Emp.UID);
	System.out.println("Age of the Employee: "+Emp.age);
	System.out.println("Salary of the Employee: "+Emp.salary);
	
}}