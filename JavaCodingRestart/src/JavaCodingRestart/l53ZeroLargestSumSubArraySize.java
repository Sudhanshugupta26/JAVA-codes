package JavaCodingRestart;

import java.util.HashMap;

public class l53ZeroLargestSumSubArraySize {
    static int ZeroSumLargestSubArray(int[] arr, int n){
        int sum = 0;
        int mxLen = -1;
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(sum, -1);
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
            if (mp.containsKey(sum)) {
                mxLen = Math.max(mxLen, i-mp.get(sum));
                continue;
            }
            mp.put(sum, i);
        }
        return mxLen;
    }
    public static void main(String[] args) {
        int arr[] = {15,2,-2,-8,1,10};
        System.out.println(ZeroSumLargestSubArray(arr, 6));
    }
}
