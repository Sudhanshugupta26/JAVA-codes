package JavaCodingRestart;

import java.util.Scanner;

public class l17P2MultiplicationOfMatrices {
    static int[][] Multiply2Matrices(int[][]a,int[][] b){
        if (a[0].length!=b.length) {
            System.out.println("Not Possible.");
            int [][]c={{0,0}};
            return c;
        }
        int c[][]= new int[a.length][b[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b[0].length;j++){
                c[i][j]=0;
                for(int k=0;k<a[0].length;k++){ // since additions are done a[0].length times or b.length times.
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        return c;
    }
    static int[][] Input2DArray(){
            Scanner sc = new Scanner(System.in);
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
    static void Print2DArray(int[][] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Input 1st Matrix: ");
        int a[][]=Input2DArray();
        Print2DArray(a);
        System.out.println("Input 2nd Matrix: ");
        int b[][]=Input2DArray();
        Print2DArray(b);
        int c[][]=Multiply2Matrices(a,b);
        System.out.println("Multiplied Matrix is:");
        Print2DArray(c);
    }
}
