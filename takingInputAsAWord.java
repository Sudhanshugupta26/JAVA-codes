package project2;

import java.util.Scanner;

public class takingInputAsAWord {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("enter your name: ");
		 String num_1 = sc.next();
		 System.out.println("name is: " + num_1);
		 // BUT !!!! IF,
		 System.out.print("enter your full name: ");
		 String num_2 = sc.next();
		 System.out.println("name is: " + num_2);
		 // see, it only print the first word because next() method take input till 1st whitespace.
	}
	
}