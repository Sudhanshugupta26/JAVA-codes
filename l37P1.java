package JavaCodingRestart;

public class l37P1 {
    static int BinarySearch(int arr[],int target){
        int res = -1;
        int beg = 0;
        int end = arr.length-1;
        while (beg<=end) {
            int mid = (int)(beg+end)/2;
            if (arr[mid]==target) {
                res = mid;
                end = mid-1;
            }
            else if (target<arr[mid]) {
                end = mid-1;
            }
            else{
                beg = mid+1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        // First Occurence of a number in the list.
        int arr[] = {1,2,3,5,5,5,5,6,7,7,7,88,88,88};
        System.out.println(BinarySearch(arr,88));
    }
}
