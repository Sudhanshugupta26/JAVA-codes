package JavaCodingRestart;

import java.util.Stack;

public class l47NextGreater {
    public static int[] nextGreater(int[] arr){ // T.C -> O(n) because stack is emptied every time and only few iterations(in while) will happen and they seems like O(1)
        int n = arr.length;
        int res[] = new int[n];
        res[n-1] = -1;
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        for (int i = n-2; i >=0; i--) {
            while ( st.size()>0 && st.peek()<arr[i] ) {
                st.pop();
            }
            if (st.size()==0) {
                res[i] = -1;
            }
            else{
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {1,4,3,7,8,9,5,2};
        int ans[] = nextGreater(arr);
        for (int i : ans) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
