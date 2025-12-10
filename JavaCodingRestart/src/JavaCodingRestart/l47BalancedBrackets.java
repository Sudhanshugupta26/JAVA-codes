package JavaCodingRestart;

import java.util.Scanner;
import java.util.Stack;

public class l47BalancedBrackets {
    public static boolean isBalanced(String s){
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (a=='(') {
                st.push('(');
            }
            else{
                if(st.size()==0)return false;
                if(st.peek()=='(')st.pop();
            }
        }
        if (st.size()>0) return false;
        return true;
    }
    
    public static boolean isBalancedAll(String s){
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char a = s.charAt(i);
            if (a=='('||a=='['||a=='{') {
                st.push(a);
            }
            else if(a==')'){
                if(st.size()==0)return false;
                if(st.peek()=='(')st.pop();
                else return false;
            }
            else if(a==']'){
                if(st.size()==0)return false;
                if(st.peek()=='[')st.pop();
                else return false;
            }
            else if(a=='}'){
                if(st.size()==0)return false;
                if(st.peek()=='{')st.pop();
                else return false;
            }
        }
        if (st.size()>0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String balanced = sc.nextLine();
        System.out.println(isBalanced(balanced));
        System.out.println(isBalancedAll(balanced));
        sc.close();
    }
}
