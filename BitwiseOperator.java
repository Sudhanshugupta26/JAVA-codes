package project3;

public class BitwiseOperator {
	public static void main(String args[]) {
		int p=9 ; int q=10; //Bitwise operators work on binary values of number
		System.out.println(p|q);//Bitwise OR
		System.out.println(p&q);//Bitwise AND
		System.out.println(p^q);//Bitwise XOR (convert values of same type in 0 and different type in 1.
		System.out.println(~q);//Bitwise NOT
		System.out.println(p>>1);//Bitwise RIGHT SHIFT (a>>b = a/((2)^b))
		System.out.println(p<<1);//Bitwise LEFT SHIFT (a<<b = a*((2)^b))
		System.out.println(p<<2);
		System.out.println(q>>2);
	}
}
