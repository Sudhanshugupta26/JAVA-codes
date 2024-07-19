package JavaCodingRestart;

import java.util.Scanner;

public class l18P1TransposeMatrix {
    static void TransposeInPlace(int[][] a){
        for(int i=0 ; i<a.length;i++){
            for(int j=i;j<a[0].length;j++){     // If we dont define j=i initialization the values are swapped 2 times.
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }return;
    }

    static int[][] TransposeMatrix(int [][]a){
        int [][]c=new int[a.length][a[0].length];
        for(int i=0 ; i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                c[j][i]=a[i][j];
            }
        }
        return c;
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
        int[][] a=Input2DArray();
        Print2DArray(a);
        System.out.println("transposed Matrix:");
        int[][] c=TransposeMatrix(a);
        Print2DArray(c);
        Print2DArray(a);
        System.out.println("transposed In Place Matrix:");
        TransposeInPlace(a);
        Print2DArray(a);
    }
}
