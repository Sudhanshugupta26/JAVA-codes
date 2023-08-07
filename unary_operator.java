package project3;

public class unary_operator {
	public static void main(String[] args) {
		int p =10 , q=20;
		System.out.println(p++);	// in this p prints 1st and incremented(p+1) later
		System.out.println(++p);	// in this p incremented((p+1)+1) 1st and then print later
		System.out.println(q++);
		System.out.println(++q);
		
		int x=p++;
		int y=++q;
		System.out.println(x);
		System.out.println(y);
		System.out.println(p);
		System.out.println(q);
	}

}
