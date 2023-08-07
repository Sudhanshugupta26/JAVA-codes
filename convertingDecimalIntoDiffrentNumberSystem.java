package project4;
import java.util.*;
public class convertingDecimalIntoDiffrentNumberSystem {
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		int h,a,b,c,d;
		System.out.println("Decimal number input :");
		a=ob.nextInt();
		System.out.println("what base ?: ");
		b=ob.nextInt();
		c=0;//converted number
		d=1;//base power
		while(a>0) {
			h=a%b;
			c+=(h*d);
			a/=b;
			d*=10;
		}
		System.out.println("number is: "+c+"( in base: "+b+")");

}
}
