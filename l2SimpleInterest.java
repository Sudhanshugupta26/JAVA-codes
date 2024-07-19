package JavaCodingRestart;
import java.util.Scanner;
public class l2SimpleInterest {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter p: ");
            float p =sc.nextFloat();
            System.out.println("Enter r: ");
            float r =sc.nextFloat();
            System.out.println("Enter t: ");
            float t =sc.nextFloat();
            float si = (p*r*t)/100;
            System.out.println(si);
        }
    }
}
