package interfaces;
import java.util.*;
interface client{
	void input();// by default has public + abstract type
	void output();// by default has public + abstract type
}
public class pro1 implements client { // using interface.
	String name;
	double sal;
	public void input() {//in this we specify access specifier as public because interface method is by default public+abstract but we need to define that method, if we use default specifier it will give error.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		name = sc.nextLine();
		System.out.println("Enter salary: ");
		sal = sc.nextDouble();
		
	}
	public void output() {
		System.out.println(name+" "+sal);
	}
	public static void main(String args[]) {
		client ob = new pro1();
		ob.input();
		ob.output();
	}

}
