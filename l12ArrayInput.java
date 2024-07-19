package JavaCodingRestart;

import java.util.Scanner;

public class l12ArrayInput {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int arr[] = new int[5];
            for (int i=0;i<arr.length;i++) {
                System.out.print("Enter element at index "+i+" : ");
                arr[i]=sc.nextInt();
            }
        }
    }
}