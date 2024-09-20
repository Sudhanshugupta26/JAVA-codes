package JavaCodingRestart;

public class l38TargetRSA {
    static int target(int[] arr, int tar){
        int beg=0,end=arr.length-1,ans=-1,mid;
        while (beg<=end) {
            mid=(beg+end)/2;
            if (arr[mid]==tar){
                ans=mid;
                return ans;
            }
            else if (arr[mid]<arr[end]) {
                if (arr[mid]<tar && arr[end]>=tar) {
                    beg=mid+1;
                }
                else end=mid-1;
            }
            else{
                if (arr[mid]>tar && arr[beg]<=tar) {
                    end=mid-1;
                }
                else beg=mid+1;
            }
        }
        return ans;
    }

    // For Duplicate elements list
    static int targetDup(int[] arr, int tar){
        int beg=0,end=arr.length-1,ans=-1,mid;
        while (beg<=end) {
            mid=(beg+end)/2;
            if (arr[mid]==tar){
                ans=mid;
                return ans;
            }
            else if (arr[beg]==arr[mid] && arr[mid]==arr[end]) {
                beg++;
                end--;
            }
            else if (arr[mid]<=arr[end]) {
                if (arr[mid]<tar && arr[end]>=tar) {
                    beg=mid+1;
                }
                else end=mid-1;
            }
            else{
                if (arr[mid]>tar && arr[beg]<=tar) {
                    end=mid-1;
                }
                else beg=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[]  arr = {5,6,7,8,9,1,2,3,4};
        System.out.println(target(arr,8));
        int[] array = {1,1,1,2,2,2,3,1,1};
        System.out.println(targetDup(array, 3));
    }
}
