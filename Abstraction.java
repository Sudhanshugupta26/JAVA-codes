package assignment3;

abstract class bank{
	abstract void getBalance();
}

class BankA extends bank{
	public int getBalance(int n){
		return n;
	}
}

class BankB extends bank{
	public int getBalance(int n){
		return n;
	}
}
	
class BankC extends bank{
		public int getBalance(int n){
			return n;
	}
}

public class Abstraction{
	public static void main(String []args){
		BankA a = new BankA();
		BankB b = new BankB();
		BankC c = new BankC();
		System.out.println(a.getBalance(100));
		System.out.println(b.getBalance(150));
		System.out.println(c.getBalance(200));
	}
}
