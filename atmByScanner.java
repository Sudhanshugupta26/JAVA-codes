package assignment2bbd;
import java.util.*;
public class atmByScanner {
	int a;
	int c;
	int d;
	int e = 4263;//Actual pin
	public static void main(String[] args) {
		atmByScanner ob = new atmByScanner();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Account Number : ");
		ob.a=sc.nextInt();
		System.out.print("Enter Amount : ");
		ob.c=sc.nextInt();
		System.out.print("Enter Pin : ");
		ob.d=sc.nextInt();
		if(ob.d==ob.e) {
			System.out.println("You have taken "+ob.c+" from your account "+ob.a);
			
		}
		else {
			System.out.println("Invalid Pin");
		}
	}
}
