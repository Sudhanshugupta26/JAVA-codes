package bbd1stJavaassignment;
class Btech{
	void print() {
		System.out.println("B Tech");
	}
}
class Engineering extends Btech{
	void print() {
		System.out.println("Engineering");
	}
	
}
class CSE extends Engineering{
	void print() {
		System.out.println("CSE");
	}
}
public class overriding {
	public static void main(String[] args) {
		Btech a;
		a = new Btech();
		a.print();
		a = new CSE();
		a.print();
	}
}