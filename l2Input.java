package JavaCodingRestart;

import java.util.Scanner;
public class l2Input {
    public static void main(String[] args) {
        System.out.println("Enter a integer number: ");
        try (Scanner sc = new Scanner(System.in)) {  // try{} is used for unexpected error in sc object creation. It can omittable.
            int a = sc.nextInt();
            System.out.println(a);
        }
    }    
}
