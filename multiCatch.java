package ExceptionHandling;

public class multiCatch {
	public static void main(String args[]) {
	int a=10,b=0,c;
	int arr[] = {10,20,30,40};
	String d= null;
	try {
		c=a/b;
		System.out.println(c); 
		System.out.println(arr[4]);
		System.out.println(d.toLowerCase());
	}
	catch(ArithmeticException e) {
		System.out.println(e);
	}

	catch(ArrayIndexOutOfBoundsException u) {
		System.out.println(u);
	}
	catch(Exception f) {
		System.out.println(f);
	}
}
}
