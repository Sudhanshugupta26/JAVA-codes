package JavaCodingRestart;

import java.util.Stack;

public class l46StackCopy {
    public static void pushAtBottom(Stack<Integer> st, int x){
        if (st.size()==0) {
            st.push(x);
            return;
        }
        int ele = st.pop();
        pushAtBottom(st, x);
        st.push(ele);
    }
    public static void displayRec(Stack<Integer> s){
        if (s.empty()) return;
        int x= s.pop();
        displayRec(s);
        System.out.println(x);
        s.push(x);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());// check empty.
        for (int i = 1; i < 6; i++) {
            st.push(i); // inserting element.
        }
        System.out.println(st); // printing stack.
        System.out.println(st.size());  // print size of stack.
        System.out.println(st.peek()); // gives top most ele.
        System.out.println(st.pop());   //removes top most ele.
        System.out.println(st);
        
        //Question
        Stack<Integer> rt = new Stack<>();
        while (st.size()>0) {
            rt.push(st.pop());
        }
        System.out.println(rt); // reverse stack.
        Stack<Integer> ans = new Stack<>();
        while (rt.size()>0) {
            ans.push(rt.pop());
        }
        System.out.println(ans); // Copy created.
        displayRec(ans);
        System.out.println(ans);
        pushAtBottom(ans, 213);
        System.out.println(ans);
    }
}
