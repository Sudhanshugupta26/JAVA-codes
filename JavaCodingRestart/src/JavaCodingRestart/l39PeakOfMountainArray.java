package JavaCodingRestart;

public class l39PeakOfMountainArray {
    static int peak(int[] arr){
        int beg=0,end=arr.length-1,ans=-1;
        while (beg<=end) {
            int mid=(beg+end)/2;
            if(arr[mid]<arr[mid+1]){
                ans=mid+1;
                beg=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,5,4};
        System.out.println(peak(arr));
    }
}
