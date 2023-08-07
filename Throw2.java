package ExceptionHandling;
import java.util.*;
public class Throw2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age<18) {
			throw new RuntimeException("Can't go for vote.");
		}
		else {
			System.out.println("Eligible for vote.");
		}
	}
}
