package JavaCodingRestart;

import java.util.Stack;

public class l48PostToPre {
    public static void main(String[] args) {
        String prefix = "953+4*6/-"; //4
        Stack<String> st = new Stack<>();
        for (int i = 0; i <prefix.length() ; i++) { // loop reversed
            char a = prefix.charAt(i);
            if ((int)a >= 48 && (int)a<=57) {     //0-->48 & 9-->57
                st.push(""+a);
            }
            else{
                String v2 = st.pop();
                String v1 = st.pop();
                String str = a+v1+v2;
                st.push(str);
            }
        }
        System.out.println(st.peek());
    }
}
