package JavaCodingRestart;
import java.util.Scanner;
public class l2inputChar {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a char: ");
            char c = sc.next().charAt(0);
            System.out.println(c);
        }
    }
}
