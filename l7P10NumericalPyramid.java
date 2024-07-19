package JavaCodingRestart;

import java.util.Scanner;

public class l7P10NumericalPyramid {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            for(int i=1;i<=a;i++){
                for(int j=1;j<=(a-i);j++){
                    System.out.print(" ");
                }
                for(int k=1;k<=i;k++){
                    System.out.print(k);
                }
                for(int l=(i-1);l>=1;l--){
                    System.out.print(l);
                }
                System.out.println();
            }
        }
    }
}