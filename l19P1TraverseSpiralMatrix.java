package JavaCodingRestart;

import java.util.Scanner;

public class l19P1TraverseSpiralMatrix {
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
    static void PrintSpiralMat(int arr[][]){
        int bottomRow = arr.length-1;
        int r = bottomRow+1;
        int topRow = 0 ; 
        int leftCol = 0 ;
        int rightCol = arr[0].length-1;
        int total = 0;
        int c = rightCol+1;
        while (total<(r)*(c)) {
            // topRow
            for (int j = leftCol; j <= rightCol && total<(r)*(c); j++) {
                System.out.print(arr[topRow][j]+" ");
                total++;
            }
            topRow++;
            // rightCol
            for (int i = topRow; i <= bottomRow && total<(r)*(c); i++) {
                System.out.print(arr[i][rightCol]+" ");
                total++;
            }
            rightCol--;
            // bottomRow
            for (int j = rightCol; j >= leftCol && total<(r)*(c);j--) {
                System.out.print(arr[bottomRow][j]+" ");
                total++;
            }
            bottomRow--;
            // leftCol
            for (int i = bottomRow; i >= topRow && total<(r)*(c); i--) {
                System.out.print(arr[i][leftCol]+" ");
                total++;
            }
            leftCol++;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [][]arr=Input2DArray();
        Print2DArray(arr);
        PrintSpiralMat(arr);
    }
}
