package JavaCodingRestart;

import java.util.Arrays;

public class l12SmallestAndLargestElementArray {
    static int[] S$LArray(int[] arr){
        Arrays.sort(arr);                   // Inbuilt function to sort Arrays.
        int a[]={arr[0],arr[arr.length-1]};
        return a;
    }
    public static void main(String[] args) {
        int arr[]={1,2,0,5,6,7,66,3,7,7,9,3,53,89};
        int r_array[]=S$LArray(arr);
        for (int i : r_array) {
            System.out.println(i);
        }
    }
}