package JavaCodingRestart;

import java.util.HashSet;

public class l54LongestConsecutive {
    static int longestConsecutive(int[] arr){
        int size = 0;
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (!hs.contains(arr[i]-1)) {
                int val = arr[i];
                int streak = 1;
                while (hs.contains(val+1)) {
                    streak++;
                    val++;
                }
                size = Math.max(size, streak);
            }
        }
        return size;
    }
    public static void main(String[] args) {
        int arr[] = {100,4,3,2,200,1,101,102,103,104};
        System.out.println(longestConsecutive(arr));
    }
}