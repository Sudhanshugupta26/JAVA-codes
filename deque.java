package collections;

import java.util.ArrayDeque;

public class deque {
	
	public static void main(String args[]) {  // FIFO
		ArrayDeque<String> dq= new ArrayDeque<>();
		dq.add("ankit");
		dq.add("amit");
		dq.add("aryan");
		System.out.println(dq);
		dq.remove();
		System.out.println(dq);
	}
}
