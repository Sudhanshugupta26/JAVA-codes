package JavaCodingRestart;

import java.util.Scanner;

public class l5WhileLoop {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int i =1;
            while(i<=a){
                System.out.println(i);
                i++;
            }
        }
    }
}
