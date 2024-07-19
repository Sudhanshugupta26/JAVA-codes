package JavaCodingRestart;

import java.util.Scanner;

public class l6P6Power {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int power = 1;
            int i = 1;
            while(b>=i){
                power*=a;
                i++;
            }
            System.out.println(power);
        }
    }
}
