package JavaCodingRestart;

import java.util.Scanner;

public class l16P2RangeOfPrefixSumInArray {// On one based indexing.

    // static int prefixSum(int[] arr, int l,int r){   // On brute force approach
    //     int prefs=0;
    //     for(int i = (l-1); i<r;i++){
    //         prefs+=arr[i];
    //     }
    //     return prefs;
    // }
    static int[] preSumArray(int[] arr){    // Optimised approach
        int[] ans = new int[arr.length];
        ans[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            ans[i]=ans[i-1]+arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={2,4,1,3,6};
        int[] ans= preSumArray(arr);
        try (Scanner sc = new Scanner(System.in)) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            for (int i : ans) {
                System.out.println(i+" ");
            }System.out.println();
            System.out.println(ans[r-1]-ans[l-2]);
        }
    }
}
