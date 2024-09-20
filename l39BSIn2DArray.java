package JavaCodingRestart;

public class l39BSIn2DArray {
    static boolean search(int[][] arr,int target){
        int n=arr.length,m=arr[0].length;
        int beg=0,end=m-1,row=0;
        while (beg<=end && row<n) {
            int mid = (beg+end)/2;
            if (arr[row][mid]==target) {
                    return true;
            }else if (arr[row][end]<target) {
                row++;
            }else{
                if (arr[row][mid]>target) {
                    end = mid-1;
                }else{
                    beg = mid+1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(search(arr,99));
    }
}
