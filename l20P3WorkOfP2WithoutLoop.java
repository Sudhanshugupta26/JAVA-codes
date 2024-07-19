package JavaCodingRestart;

import java.util.Scanner;

public class l20P3WorkOfP2WithoutLoop {
    static void PrefixByColMatrix(int [][]arr){
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(j==0){
                    arr[j][i] = arr[j][i];
                }
                else{
                    arr[j][i]=arr[j-1][i] + arr[j][i];
                }
            }
        }
    }
    static int[][] PrefixByRowMatrix(int[][] arr){
        int c[][]= new int [arr.length][arr[0].length];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                if(j==0){
                    c[i][j] = arr[i][j];
                }
                else{
                    c[i][j]=c[i][j-1] + arr[i][j];
                }
            }
        }
        return c;
    }
    static void PrefixSum2(int[][] arr, int l1,int c1,int l2,int c2){
        int sum=0;
        if(c1==0){
            if(l1==0){
                sum = arr[l2][c2];
            }
            else{
                sum = arr[l2][c2]-arr[l1-1][c2];
            }
        }
        else{
            if(l1==0){
                sum = arr[l2][c2]-arr[l2][c1-1];
            }
            else{
                sum = arr[l2][c2]-arr[l2][c1-1]-arr[l1-1][c2]+arr[l1-1][c1-1];
            }
        }
        System.out.println(sum);
    }
    static void Print2DArray(int[][] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
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
    public static void main(String[] args) {
        int arr[][] = Input2DArray();
        Print2DArray(arr);
        // PrefixByColMatrix(arr);
        // Print2DArray(arr);
        int sparr[][] = PrefixByRowMatrix(arr);
        Print2DArray(sparr);
        PrefixByColMatrix(sparr);
        Print2DArray(sparr);
        PrefixSum2(sparr,1,1,1,1);
    }
}