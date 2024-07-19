package JavaCodingRestart;

import java.util.Scanner;

class Algebra{
    int addition(int a,int b){
        return a+b;
    }
}
public class l10MethodAdd2Number {
    public static void main(String[] args) {
        Algebra A = new Algebra();
        try (Scanner sc = new Scanner(System.in)) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(A.addition(a, b));
        }
    }
}
