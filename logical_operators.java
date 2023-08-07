package project3;

public class logical_operators {
	public static void main(String[] args) {
		int p =10 , q=20 , r=5 ;
		System.out.println((p>q) && (p>r));	
		System.out.println((p>q) && (p<r));
		System.out.println((p<q) && (p>r));
		System.out.println((p<q) && (p<r));
		System.out.println((p>q) || (p>r));
		System.out.println((p>q) || (p<r));
		System.out.println((p<q) || (p>r));
		System.out.println((p<q) || (p<r));
		System.out.println(!(p<r));
		System.out.println(!(p>r));
		System.out.println(p==r);
		System.out.println(!(p==r));
		System.out.println((p==q));
		
}
}
