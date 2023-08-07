package ExceptionHandling;

public class Finally {
	public static void main(String args[]) {
		int a=10,b=0,c;
		try {
			c=a/b;
			System.out.print(c);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {// This block will execute rather exception is there or not
			System.out.println("END");
		}
	}
}
