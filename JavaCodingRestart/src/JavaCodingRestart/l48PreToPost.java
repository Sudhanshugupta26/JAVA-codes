package JavaCodingRestart;

import java.util.Stack;

public class l48PreToPost {
    public static void main(String[] args) {
        String postfix = "-9/*+5346"; //4
        Stack<String> st = new Stack<>();
        for (int i = postfix.length()-1; i >=0 ; i--) { // loop reversed
            char a = postfix.charAt(i);
            if ((int)a >= 48 && (int)a<=57) {     //0-->48 & 9-->57
                st.push(""+a);
            }
            else{
                String v1 = st.pop();  // difference
                String v2 = st.pop();
                String str = v1+v2+a;
                st.push(str);
            }
        }
        System.out.println(st.peek());
    }
}
