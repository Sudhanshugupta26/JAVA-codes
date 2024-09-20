package JavaCodingRestart;

public class l36P3 {
    static void optCSort(int[] arr){    // Based on Dutch Flag Algorithm
        int low=0,mid=0,hi=arr.length-1;
        while (mid<=hi) {
            if (arr[mid]==0) {
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            }
            else if (arr[mid]==1) {
                mid++;
            }
            else{
                int temp=arr[mid];
                arr[mid]=arr[hi];
                arr[hi]=temp;
                hi--;
            }
        }
    }
    static int[] csort(int[] arr){
        int[] count={0,0,0};
        int[] ans=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        for (int i = 1; i < count.length; i++) {
            count[i]+=count[i-1];   // prefix
        }
        for (int i = arr.length-1; i>=0; i--) { // Sorting happens
            int idx = count[arr[i]]-1;
            ans[idx] = arr[i];
            count[arr[i]]--;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr= {0,1,0,2,1,1,0,0,0,2,2,2};
        for (int i : csort(arr)) {
            System.out.println(i);
        }
        System.out.println();
        optCSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
