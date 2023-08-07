package collections;

import java.util.LinkedList;

public class linkedList {
	
	public static void main(String args[]) {
		String b;
		LinkedList<String> al = new LinkedList<String>();
		al.add("ankit");//adding element.
		al.addFirst("kalyan");//adding element at 0th.
		al.addLast("prakash");//adding element at last.
		for(String r:al) {
			System.out.println(r);
		}
		System.out.println(al);
		al.add(1,"amit");//adding element at given index.
		System.out.println(al);
		b=al.remove();//removing element from 0th index (default).
		System.out.println(b);// that removed element.
		System.out.println(al);
		al.removeFirst();//removing element from 0th index 
		System.out.println(al);
		al.removeLast();//removing element from last index 
		System.out.println(al);
		al.remove(0);//removing element at given index.
		System.out.println(al);
		al.add("rohit");
		System.out.println(al);
		al.clear();//removes all elements.
		System.out.println(al);
	}
}
