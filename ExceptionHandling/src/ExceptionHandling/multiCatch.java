package ExceptionHandling;

public class multiCatch {
	public static void main(String args[]) {
		int a = 10, b = 0, c;
		int arr[] = { 10, 20, 30, 40 };
		String d = null;
		try {
			c = a / b;
			System.out.println(c);
			System.out.println(arr[4]);
			System.out.println(d.toLowerCase());
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException u) {
			System.out.println(u);
		} catch (Exception f) {
			System.out.println(f);
		}
		// catch (FileAlreadyExistsException m) { // this will throw error because
		// parent class Exception already written above and it will handle all the
		// exceptions remaining and since also java compiler uses top to bottom approach
		// so any perticular exception below Exception parent class is wrong.
		// System.out.println(m);
		// }
	}
}
