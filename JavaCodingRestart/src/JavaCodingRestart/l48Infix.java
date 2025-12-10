package JavaCodingRestart;

import java.util.Stack;

public class l48Infix {
    public static void main(String[] args) {
        String s = "9-(5+3)*4/6"; // 4
        Stack<Integer> val = new Stack<>();
        Stack<Character> ops = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if ((int)a >= 48 && (int)a<=57) {     //0-->48 & 9-->57
                val.push((int)a - 48);
            }
            else if(ops.empty()||a=='('||ops.peek()=='(')ops.push(a);
            else if (a==')') {
                while (ops.peek()!='(') {
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if (ops.peek()=='+')val.push(v1+v2);
                    if (ops.peek()=='-')val.push(v1-v2);
                    if (ops.peek()=='*')val.push(v1*v2);
                    if (ops.peek()=='/')val.push(v1/v2);
                    ops.pop();
                }
                ops.pop();// '(' hata diya
            }
            else{
                if (a=='+' || a=='-') {
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if (ops.peek()=='+')val.push(v1+v2);
                    if (ops.peek()=='-')val.push(v1-v2);
                    if (ops.peek()=='*')val.push(v1*v2);
                    if (ops.peek()=='/')val.push(v1/v2);
                    ops.pop();
                    ops.push(a);
                }
                else if (a=='*'||a=='/') {
                    if (ops.peek()=='*'||ops.peek()=='/') {
                        int v2=val.pop();
                        int v1=val.pop();
                        if(ops.peek()=='*')val.push(v1*v2);
                        if(ops.peek()=='/')val.push(v1/v2);
                        ops.pop();
                        ops.push(a);
                    }
                    else ops.push(a);
                }
            } 
        }
        while (val.size()>1) {
            int v2=val.pop();
            int v1=val.pop(); 
            if (ops.peek()=='+')val.push(v1+v2);
            if (ops.peek()=='-')val.push(v1-v2);
            if (ops.peek()=='*')val.push(v1*v2);
            if (ops.peek()=='/')val.push(v1/v2);
            ops.pop();
        }
        System.out.println(val.peek());
    }
}
