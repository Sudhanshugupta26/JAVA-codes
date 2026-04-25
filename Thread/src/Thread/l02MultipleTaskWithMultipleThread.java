package Thread;

class MyThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("Task 1");
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("Task 2");
    }
}

class MyThread3 extends Thread {
    @Override
    public void run() {
        System.out.println("Task 3");
    }
}

public class l02MultipleTaskWithMultipleThread {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        t1.start();
        MyThread2 t2 = new MyThread2();
        t2.start();
        MyThread3 t3 = new MyThread3();
        t3.start();
    }
}
