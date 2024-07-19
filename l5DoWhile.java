package JavaCodingRestart;

import java.util.Scanner;

public class l5DoWhile {
    public static void main(String[] args) {
        
    
    try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int i =1;
            do{
                System.out.println(i);
                i++;
            }while(i<=a);
        }    
    }
}
