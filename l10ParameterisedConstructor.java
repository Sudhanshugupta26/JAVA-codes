package JavaCodingRestart;

import java.util.Scanner;

class Algebra2{         // 2 classes in the same package doesn't have same names.
    int a,b;
    Algebra2(int x,int y){                  // this is Parameterised Constructor of class Algebra.
        a=x;
        b=y;
    }
    int add(){
        return a+b;
    }
    int sub(){
        return a-b;
    }
    int mul(){
        return a*b;
    }
}
public class l10ParameterisedConstructor {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        Algebra2 A = new Algebra2(a,b);
        System.out.println(A.add()+" "+A.mul()+" "+A.sub());
        }
    }
}