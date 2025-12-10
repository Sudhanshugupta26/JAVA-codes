package JavaCodingRestart;

import java.util.HashMap;

public class l53TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int []ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
            if (map.containsKey(target - nums[i])) {
                ans[0] = map.get(target - nums[i]);
                ans[1] = i;
                return ans;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int arr[] = {14,9,10,4,2,1,5};
        int[] ans = twoSum(arr, 13);
        for (int i : ans) {
            System.out.println(i);
        }
    }
}
