package JavaCodingRestart;

import java.util.Scanner;

public class l4IfElseIf {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            if(a==0){
                System.out.println("ZERO");
            }
            else if (a==1) {
                System.out.println("ONE");
            }
            else{
                System.out.println("Anyother Number");
            }
        }
    }
}
