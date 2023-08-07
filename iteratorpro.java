package collections;

import java.util.*;

public class iteratorpro {
	
	public static void main(String args[]) {
		ArrayList<String> an =new ArrayList<String>();
		an.add("ankit");//adding element.
		an.add("kalyan");//adding element.
		an.add("prakash");//adding element.
		System.out.println(an);
		
		Iterator<String> itr =  an.iterator(); //object of iterator for an ArrayList.
		
		while(itr.hasNext()) {//checking of next element.
			System.out.println(itr.next());//printing the element where cursor is.
			itr.remove();//remove the element which cursor reads before.
			System.out.println(an);
		}
		System.out.println(an);
}
}