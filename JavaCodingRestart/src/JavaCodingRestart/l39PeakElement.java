package JavaCodingRestart;

public class l39PeakElement {
    static int peak(int[] arr){
        int n=arr.length-1,beg=0,end=n;
        while (beg<=end) {
            int mid=(beg+end)/2;
            if (mid+1>n) {
                return mid;
            }else if (arr[mid]>arr[mid+1]) {
                n=mid;
                end=mid-1;
            }else{
                beg=mid+1;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,3,2,1,2,3,4,5,4};
        System.out.println(peak(arr));
    }
}
