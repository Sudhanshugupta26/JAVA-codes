package JavaCodingRestart;

public class l39BSIn2DArray2 {
    static boolean search(int[][] arr,int target){
        int n=arr.length,m=arr[0].length;
        int end=m-1,row=0;
        while (0<=end && n>row) {
            if (arr[row][end]==target) {
                return true;
            }else if(arr[row][end]<target){
                row++;
            }else{
                end--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [][]arr = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        System.out.println(search(arr,-4));
    }
}
