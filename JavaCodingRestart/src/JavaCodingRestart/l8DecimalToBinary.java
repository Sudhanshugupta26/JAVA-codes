package JavaCodingRestart;

import java.util.Scanner;

public class l8DecimalToBinary {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Below 1023");
            System.out.println("Enter Decimal Number: ");
            int dnum = sc.nextInt();
            int pw = 1;
            int bnum = 0;
            while (dnum > 0) {
                int parity = dnum % 2;
                bnum += parity * pw;
                dnum /= 2;
                pw *= 10;
            }
            System.out.println(bnum);
        }
    }
}
