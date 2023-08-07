package assignment3;

public class arrays1 {
	public static void main(String args[]) {
		int a[] = {10,12,20,30,25,40,32,31,35,50,60};
		int b[] = new int[6];
		for(int i=3 ; i<=8;i++) {
			int c = i - 3;
			b[c] = a[i];
		}
		for(int j : b) {
			System.out.println(j);
		}
	}

}
