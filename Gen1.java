package Generics;

class Mygeneric<T1>{// Is a generic, since it defines the datatype .
	private T1 t1;
	public void setVal(T1 t1){
		this.t1=t1;}
	public T1 getVal() {
		return t1;
	}
	}

public class Gen1 {
	
	public static void main(String args[]) {
		Mygeneric my = new Mygeneric();
		my.setVal("This is a String.");
		System.out.println(my.getVal());
		my.setVal(456);
		System.out.println(my.getVal());
		
	}
}
