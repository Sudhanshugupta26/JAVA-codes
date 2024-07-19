package JavaCodingRestart;

import java.util.Scanner;

public class l17P3ReverseEachRowInMatrix {
    static int[][] ReverseMatrix(int[][]a){
        int c[][]= new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++){
            int tc = a[i].length-1;
            for(int j=0;j<a[0].length;j++){
                c[i][tc-j] = a[i][j];
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
        System.out.println("Reversed Matrix:");
        int[][] c=ReverseMatrix(a);
        Print2DArray(c);
    }
}
