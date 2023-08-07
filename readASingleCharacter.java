package project2;

import java.util.Scanner;

public class readASingleCharacter {
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.print("enter your name: ");
	 char num_1 = sc.next().charAt(0);
	 System.out.println("1st character is: " + num_1);
}
}