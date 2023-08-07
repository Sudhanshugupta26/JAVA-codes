package presentation;
class Emp{
	public static int areaRect(int a, int b){
		return a*b;
	}
}

public class Static {
	public static void main(String[] args) {
		int area = Emp.areaRect(4, 5);
		System.out.println(area);
		
	}
}
