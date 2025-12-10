package JavaCodingRestart;

public class l37BinarySearch {
    static boolean BinarySearch(int arr[],int target){
        boolean res = false;
        int beg = 0;
        int end = arr.length-1;
        while (beg<=end) {
            int mid = (int)(beg+end)/2;
            if (arr[mid]==target) {
                res=true;
                return res;
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

    static boolean RecBinarySearch(int arr[], int target,int beg,int end){
        if (beg>end) {  // base case
            return false;
        }
        int mid = (int)(beg+end)/2;
        if (arr[mid]==target) {
            return true;
        }
        else if (arr[mid]<target) {
            return RecBinarySearch(arr, target, mid+1, end);
        }
        else{
            return RecBinarySearch(arr, target, beg, mid-1);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,22,4444,99999,100000,9229999};
        System.out.println(BinarySearch(arr, 4567));
        System.out.println(RecBinarySearch(arr,4444,0,arr.length-1));
    }
}
