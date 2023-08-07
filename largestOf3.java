package assignment2bbd;
import java.util.*;
public class largestOf3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int e;
		if(a>b) {
			if(a>c){
				e=a;
			}
			else {
				e=c;
			}
		}
		else {
			if(b>c) {
				e=b;
			}
			else {
				e=c;
			}
			
		}
		System.out.println("Largest number is: "+e);
		}
	}