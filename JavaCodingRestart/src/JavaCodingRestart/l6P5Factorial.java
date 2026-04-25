package JavaCodingRestart;

import java.util.Scanner;

public class l6P5Factorial {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int fact = 1;
            int i = 1;
            if (a == 0) {
                System.out.println(a + "'s factorial is : " + fact);
            }
            while (a >= i && i > -1) {
                fact *= i;
                System.out.println(i + "'s factorial is : " + fact);
                i++;
            }
        }
    }
}
