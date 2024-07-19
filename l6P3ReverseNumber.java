package JavaCodingRestart;

import java.util.Scanner;

public class l6P3ReverseNumber {
        public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int reverse=0;
            while(a>0){
                reverse*=10;
                reverse+=(a%10);
                a/=10;
            }
            System.out.println(reverse);
        }
    }
}

