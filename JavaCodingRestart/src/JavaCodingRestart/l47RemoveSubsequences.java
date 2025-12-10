package JavaCodingRestart;

import java.util.Scanner;
import java.util.Stack;

public class l47RemoveSubsequences {

    public static int[] subsequenced(int[] arr){
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]==st.peek()) {
                count++;
                continue;
            }
            else{
                if (count>0) st.pop();
                st.push(arr[i]);
                count=0;
            } 
        }
        if(count>0)st.pop();
        int ans[] = new int[st.size()];
        for (int i = ans.length-1; i >=0 ; i--) {
            ans[i] = st.pop();
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,4,4,4,5,10,10,10,6,7,7,2};
        int ans[] = subsequenced(arr);
        for (int i : ans) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
