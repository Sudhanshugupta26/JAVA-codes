package project2;

import java.util.Scanner;

public class sumOfNumbersThatAreInputed {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("enter 1st number: ");
		 int num_1 = sc.nextInt();
		 
		 System.out.print("enter 2nd number: ");
		 int num_2 = sc.nextInt();
		 
		 int sum = num_1 + num_2;
		 
		 System.out.println("Sum is: " + sum);

}}
