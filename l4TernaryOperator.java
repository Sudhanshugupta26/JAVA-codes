package JavaCodingRestart;

import java.util.Scanner;

public class l4TernaryOperator {
    public static void main(String[] args) {
        int a =7;
        try (Scanner sc = new Scanner(System.in)) {
            int b = sc.nextInt();
            System.out.println((a==b)?"true":"false");
        }
    }
}
