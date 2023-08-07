package presentation;
class that{
	int num1;
	int num2;
	public that(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
}

public class This {
	public static void main(String[] args) {
		that sd = new that(4,5);
		System.out.println("number 1 is: "+sd.num1);
		System.out.println("number 2 is: "+sd.num2);
	}
}
