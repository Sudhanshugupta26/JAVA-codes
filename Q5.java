package assignment1;

public class Q5 {
	int a = 8;
	int b = 45;
	int c = a;
	public static void main(String[] args){
		Q5 s1 = new Q5();
		s1.a=s1.b;
		s1.b=s1.c;
		System.out.println(s1.a+","+s1.b);
	}
}
