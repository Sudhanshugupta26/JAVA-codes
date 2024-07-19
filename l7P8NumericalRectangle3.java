package JavaCodingRestart;

import java.util.Scanner;

public class l7P8NumericalRectangle3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            for(int i=1;i<=a;i++){
                for(int j=1;j<=b;j++){
                    if((i+j-1)%2==0){
                    System.out.print(2);
                    continue;
                    }
                    System.out.print(1);
                }
                System.out.println();
            }
        }
    }
}
