package JavaCodingRestart;

import java.util.Scanner;

public class l6P2SumOfDigits {
        public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int sum=0;
            while(a>0){
                sum+=(a%10);
                a/=10;
            }
            System.out.println(sum);
        }
    }
}

