package JavaCodingRestart;

import java.util.Scanner;

public class l7P11NumericalHollowPyramid {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            for(int i=1;i<=(a-1);i++){
                for(int j=1;j<=(a-i);j++){
                    System.out.print(" ");
                }
                for(int k=1;k<=i;k++){
                    if(k==1){
                    System.out.print(i);
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                for(int l=(i-1);l>=1;l--){
                    if(l==1){
                    System.out.print(i);
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            for(int m = 1;m<2*a;m++){
                System.out.print(a);
            }
        }
    }
}