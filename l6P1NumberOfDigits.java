package JavaCodingRestart;

import java.util.Scanner;

public class l6P1NumberOfDigits {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int count=0;
            while(a>0){
                count++;
                a/=10;
            }
            System.out.println(count);
        }
    }
}
