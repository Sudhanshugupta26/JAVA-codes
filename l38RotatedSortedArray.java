package JavaCodingRestart;

public class l38RotatedSortedArray {
    static int Smallest(int[] arr){
        int beg =0,end=arr.length-1,ans=-1;
        while (beg<=end) {
            int mid = (beg+end)/2;
            if (arr[arr.length-1]<arr[mid]) {
                beg=mid+1;
            }
            else{
                ans=mid;
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {5,6,7,8,9,10,1,2,3,4};
        System.out.println(Smallest(arr));
    }
}
