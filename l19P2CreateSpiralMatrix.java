package JavaCodingRestart;

import java.util.Scanner;

public class l19P2CreateSpiralMatrix {
    static void Print2DArray(int[][] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] CreateSpiralMat(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Rows: ");
            int a = sc.nextInt();
            System.out.print("Enter Coloumns: ");
            int b = sc.nextInt();
            int arr[][]=new int[a][b];
            int r = a;
            int bottomRow = a-1;
            int topRow = 0 ; 
            int leftCol = 0 ;
            int rightCol = b-1;
            int total = 0;
            int c = b;
            while (total<(r)*(c)) {
                // topRow
                for (int j = leftCol; j <= rightCol && total<(r)*(c); j++) {
                    System.out.println("Enter element "+topRow+" "+j);
                    arr[topRow][j]=sc.nextInt();
                    total++;
                }
                topRow++;
                // rightCol
                for (int i = topRow; i <= bottomRow && total<(r)*(c); i++) {
                    System.out.println("Enter element "+i+" "+rightCol);
                    arr[i][rightCol]=sc.nextInt();
                    total++;
                }
                rightCol--;
                // bottomRow
                for (int j = rightCol; j >= leftCol && total<(r)*(c);j--) {
                    System.out.println("Enter element "+bottomRow+" "+j);
                    arr[bottomRow][j]=sc.nextInt();
                    total++;
                }
                bottomRow--;
                // leftCol
                for (int i = bottomRow; i >= topRow && total<(r)*(c); i--) {
                    System.out.println("Enter element "+i+" "+leftCol);
                    arr[i][leftCol]=sc.nextInt();
                    total++;
                }
                leftCol++;
            }
            System.out.println();
            return arr;
        }
    }
    public static void main(String[] args) {
        int [][]arr=CreateSpiralMat();
        Print2DArray(arr);
}}
