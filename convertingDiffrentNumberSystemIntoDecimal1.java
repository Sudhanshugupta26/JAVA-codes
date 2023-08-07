package project4;

import java.util.Scanner;

public class convertingDiffrentNumberSystemIntoDecimal1 {
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		int h,a,b,c,d;
		System.out.println("Number input :");
		a=ob.nextInt();
		System.out.println("base which you want to convert into decimal : ");
		b=ob.nextInt();
		c=0;//converted number
		d=1;//base power
		while(a>0) {
			if(b==16) {
				System.out.println("hexa decimal is not possible at this time");
			}
			else {
			h=a%10;
			c+=(h*d);
			a/=10;
			d*=b;
			}
			}
		System.out.println("Converted decimal number is: "+c);
		
	}

}