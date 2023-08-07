package presentation;
final class class1{
	public void show() {
		System.out.println("class 1");
	}
}

class class2 extends class1{
	public void show() {
		System.out.println("class 2");
	}
}
public class finalkey {
	public static void main(String[] args) {
		class2 ab = new class2();
		ab.show();
	}
}
