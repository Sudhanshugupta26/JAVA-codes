package JavaCodingRestart;

public class l17Printing2DArray {
    static void Print2DArray(int[][] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6,7},{8,9}};
        Print2DArray(a);
    }
}
