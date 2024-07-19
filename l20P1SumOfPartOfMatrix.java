package JavaCodingRestart;

import java.util.Scanner;

public class l20P1SumOfPartOfMatrix {
    static void sumOfMatPart(int [][]arr ,int l1,int c1,int l2,int c2){
        int sum =0 ;
        for (int i = l1; i <=l2; i++) {
            for (int j = c1;j <= c2; j++) {
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);
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
        int arr[][] = Input2DArray();
        Print2DArray(arr);
        sumOfMatPart(arr, 1, 2, 2, 2);
    }
}
