package JavaCodingRestart;

import java.util.Stack;

public class l48PostToIn {
    public static void main(String[] args) {
        String postfix = "953+4*6/-"; //4
        Stack<String> st = new Stack<>();
        for (int i = 0; i <postfix.length() ; i++) { // loop reversed
            char a = postfix.charAt(i);
            if ((int)a >= 48 && (int)a<=57) {     //0-->48 & 9-->57
                st.push(""+a);
            }
            else{
                String v2 = st.pop();
                String v1 = st.pop();
                String str = "("+v1+a+v2+")";
                st.push(str);
            }
        }
        System.out.println(st.peek());
    }
}
