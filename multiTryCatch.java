package ExceptionHandling;

public class multiTryCatch {
	public static void main(String args[]) {
		int a=10,b=0,c;
		try {
			c=a/b;
			System.out.print(c);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		int arr[] = {10,20,30,40};
		try {
			System.out.println(arr[4]);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
