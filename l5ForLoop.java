package JavaCodingRestart;

import java.util.Scanner;

public class l5ForLoop {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            for(int i =0;i<a;i++){
                System.out.println(i);
            }
        }
    }
    
}
