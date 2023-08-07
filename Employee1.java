package bbd1stJavaassignment;

public class Employee1 {
	String Name = "Tessa";
	String Surname = "William" ;
	
}

class Manager1 extends Employee1{
	String position = "CEO";
	int salary = 100000;
	public static void main(String[] args){
	Manager1 Emp = new Manager1();
	System.out.println("Name: "+Emp.Name);
	System.out.println("Surname: "+Emp.Surname);
	System.out.println("Salary: "+Emp.salary);
	System.out.println("Position: "+Emp.position);

}
}