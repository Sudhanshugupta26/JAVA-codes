package JavaCodingRestart;

import java.util.Scanner;

public class l18P2TurnMatrixBy90DegCWInPlace { // CW - Clockwise
                                                // writing rows in reverse of transpose of matrix
    static void Turn90InPlaceCW(int[][] arr){
        TransposeInPlace(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<(arr[0].length/2);j++){
                int temp = arr[i][j];
                arr[i][j]= arr[i][arr[0].length-1-j];
                arr[i][arr[0].length-1-j]=temp;
            }
        }return;
    }

    static void TransposeInPlace(int[][] a){
        for(int i=0 ; i<a.length;i++){
            for(int j=i;j<a[0].length;j++){     // If we dont define j=i initialization the values are swapped 2 times.
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }return;
    }

    static int[][] Input2DArray(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number of rows:");
            int x=sc.nextInt();
            System.out.println("Enter number of columns:");
            int y=sc.nextInt();
            int a[][]=new int[x][y];
            for(int i=0;i<x;i++){
                for(int j=0;j<y;j++){
                    System.out.println("Enter element "+i+"*"+j+" : ");
                    a[i][j]=sc.nextInt();
                }
            System.out.println();
            }
            return a;
        }
    }

    static void Print2DArray(int[][] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][]a =Input2DArray();
        Print2DArray(a);
        Turn90InPlaceCW(a);
        Print2DArray(a);
    }
}
