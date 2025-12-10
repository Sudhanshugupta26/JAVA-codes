package JavaCodingRestart;

import java.util.Stack;

public class l48EvalPostfix {
    public static void main(String[] args) {
        String postfix = "953+4*6/-"; //4
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < postfix.length(); i++) {
            char a = postfix.charAt(i);
            if ((int)a >= 48 && (int)a<=57) {     //0-->48 & 9-->57
                st.push((int)a - 48);
            }
            else{
                int v2 = st.pop();
                int v1 = st.pop();
                if (a=='+')st.push(v1+v2);
                if (a=='-')st.push(v1-v2);
                if (a=='*')st.push(v1*v2);
                if (a=='/')st.push(v1/v2);
            }
        }
        System.out.println(st.peek());
    }
}
