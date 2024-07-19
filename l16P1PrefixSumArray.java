package JavaCodingRestart;

public class l16P1PrefixSumArray {
    // Prefix sum array means each element in array is sum of the previuos element(including it self).
    static void preSumArray(int[] arr){
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];
        }
    }
    public static void main(String[] args) {
        int arr[]={2,1,3,4,5};
        preSumArray(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }System.out.println();
    }
}
