package JavaCodingRestart;

import java.util.Scanner;

public class l4IfElse {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            if(a%2==0){
                System.out.println("even");
            }
            else{
                System.out.println("odd");
            }
        }
    }
}
