package assignment3;

abstract class Constructor{
	void Constructor() {
		System.out.println("This is constructor of abstract class.");
	}
	abstract void a_method();
	public void b_method() {
		System.out.println("This is a normal method of abstract class.");
	}
}

class subClass extends Constructor{
	public void a_method() {
		System.out.println("This is abstract method.");
	}
}

public class Abstract2 {
	public static void main(String []args) {
		subClass sc = new subClass();
		sc.a_method();
		sc.b_method();
	}

}
