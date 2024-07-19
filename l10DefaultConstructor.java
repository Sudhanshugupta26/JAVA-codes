package JavaCodingRestart;

import java.util.Scanner;

class Algebra1{
    Algebra1(){                  // this is Default Constructor of class Algebra.
        System.out.println("Enter two numbers: ");
    }
    int addition(int a,int b){
        return a+b;
    }
}
public class l10DefaultConstructor {
    public static void main(String[] args) {
        Algebra1 A = new Algebra1();
        try (Scanner sc = new Scanner(System.in)) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(A.addition(a, b));
        }
    }
}
