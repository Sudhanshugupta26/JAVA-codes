package JavaCodingRestart;

import java.util.Stack;

public class l48EvalPrefix {
    public static void main(String[] args) {
        String prefix = "-9/*+5346"; //4
        Stack<Integer> st = new Stack<>();
        for (int i = prefix.length()-1; i >=0 ; i--) { // loop reversed
            char a = prefix.charAt(i);
            if ((int)a >= 48 && (int)a<=57) {     //0-->48 & 9-->57
                st.push((int)a - 48);
            }
            else{
                int v1 = st.pop();  // difference
                int v2 = st.pop();
                if (a=='+')st.push(v1+v2);
                if (a=='-')st.push(v1-v2);
                if (a=='*')st.push(v1*v2);
                if (a=='/')st.push(v1/v2);
            }
        }
        System.out.println(st.peek());
    }
}
