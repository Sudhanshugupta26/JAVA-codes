package Thread; // By using RUNNABLE INTERFACE

class Hii implements Runnable{
	public void run() {

		for(int i=1; i<=5; i++) {
			System.out.println("Hi");
			try{Thread.sleep(1000);} catch(Exception e) {}

	}
}
}
class Helloo implements Runnable{

	public void run() {

		for(int i=1; i<=5; i++) {
			System.out.println("Hello");
			try{Thread.sleep(1000);} catch(Exception e) {}
		}

	}
}


public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable obj1 = new Hii();
		Runnable obj2 = new Helloo();
           
           Thread t1 = new Thread(obj1);
           Thread t2 = new Thread(obj2);
           
           
           t1.start();
           try{Thread.sleep(10);} catch(Exception e) {}
           t2.start();
           
           
          
	}

}
