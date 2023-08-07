package collections;

import java.util.ArrayList;

public class arrayList {
	
	public static void main(String args[]) {
		String b;
		ArrayList<String> an =new ArrayList<String>();
		an.add("ankit");//adding element.
		an.add("kalyan");//adding element.
		an.add("prakash");//adding element.
		System.out.println(an);
		an.add(0,"amit");//adding element at given index.
		System.out.println(an);
		// an.addAll(array); can add all elements of ArrayList "array" from "an".
		b=an.remove(1);//removing element from index 1.
		System.out.println(b);// that removed element.
		// an.removeAll(array); can remove all elements of ArrayList "array" from "an".
		System.out.println(an);
		an.set(0,"rohit");// replacing element at the given specified index.
		System.out.println(an);
		System.out.println(an.get(0));// printing the element of specified index.
		an.clear();//removes all elements.
		System.out.println(an);
	}
}
