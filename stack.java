package collections;

import java.util.Stack;

public class stack {
	
	public static void main(String args[]) {  // LIFO
		Stack<String> st = new Stack<String>();
		st.push("ankit");// In stack we use push rather than add.
		st.push("amit");
		st.push("aryan");
		System.out.println(st);
		st.pop();// In stack we use pop rather than remove.
		System.out.println(st);
	}
}
