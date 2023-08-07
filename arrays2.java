package assignment3;
import java.util.*;
public class arrays2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		int b[] =new int[10];  
		for(int i=0;i<=9;i++){
			System.out.print("Enter element number "+(i+1)+" : ");
			int c = sc.nextInt();
			a[i]=c;
		
		}
		System.out.println("Reverse array is:");
		for(int j=0;j<=9;j++){
		b[j]=a[9-j];
			
		}
		for(int x : b)
		System.out.println(x);
		}
	}
