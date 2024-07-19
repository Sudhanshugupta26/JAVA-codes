package JavaCodingRestart;
import java.util.Scanner;
public class l8BinaryToDecimal {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int bnum = sc.nextInt();
            int pw = 1;
            int dnum=0;
            while(bnum>0){
                int unit = bnum%10;
                dnum += unit*pw;
                bnum/=10;
                pw*=2;
            }
            System.out.println(dnum);
        }
    }
}