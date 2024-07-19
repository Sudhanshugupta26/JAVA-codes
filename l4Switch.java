package JavaCodingRestart;

import java.util.Scanner;

public class l4Switch {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                default:
                    System.out.println("Other");
                    break;
            }
        }
    }
    
}
