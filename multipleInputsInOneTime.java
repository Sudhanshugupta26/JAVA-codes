package project2;

import java.util.Scanner;

public class multipleInputsInOneTime {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 //let input is : " 08 Sudhanshu Gupta".
		 System.out.print("enter : ");
		 int num_1 = sc.nextInt();
		 String num_2 = sc.next();
		 System.out.println(num_1);
		 System.out.println(num_2);
		 //nextInt() reads till first whitespace.
		 //next() only reads first word till whitespace.
		 //if integer given after the word then it will show "InputMismatchException".
	}}
