package JavaCodingRestart;

import java.util.Stack;

public class l47PrevGreater {
    public static int[] prevGreater(int[] arr){ // In this we are taking indexes rather than the values.
        int n = arr.length;
        int res[] = new int[n];
        res[0] = -1;
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for (int i = 1; i < n; i++) {
            while ( st.size()>0 && arr[st.peek()]<arr[i] ) {
                st.pop();
            }
            if (st.size()==0) {
                res[i] = -1;
            }
            else{
                res[i] = st.peek();
            }
            st.push(i);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {1,4,3,7,8,9,5,2};
        int ans[] = prevGreater(arr);
        for (int i : ans) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
