package JavaCodingRestart;

import java.util.Scanner;

public class l7P6NumericalRectangle1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            for(int i=1;i<=a;i++){
                for(int j=i;j<=a;j++){
                    System.out.print(j);
                }
                for(int k=1;k<i;k++){
                    System.out.print(k);
                }
                System.out.println();
            }
        }
    }
}
