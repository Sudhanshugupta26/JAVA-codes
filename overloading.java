package bbd1stJavaassignment;

public class overloading {
	static int product(int a,int b,int c) {
		return a*b*c;
	}
	static int product(int a, int b) {
		return a*b;
	}
	public static void main(String[] args) {
		System.out.println("product() with three parameter: ");
		System.out.println(product(5,7,9));
		System.out.println("product() with two parameter: ");
		System.out.println(product(5,7));
	}
}
