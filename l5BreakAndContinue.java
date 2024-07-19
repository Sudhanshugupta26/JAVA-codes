package JavaCodingRestart;

import java.util.Scanner;

public class l5BreakAndContinue {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a =sc.nextInt();
            System.out.println();
            for(int i =1 ; i<=a;i++){
                if(i%3==0){
                    break;
                }
                System.out.println(i);
            }
            System.out.println();
            for(int i =1 ; i<=a;i++){
                if(i%3==0){
                    continue;
                }
                System.out.println(i);
            }
        }
    }
}
