package Thread;

public class l03ThreadNaming extends Thread {
    @Override
    public void run() {
        System.out.println("Task by: " + Thread.currentThread().getName()); // This name is provided by JVM because it
                                                                            // is executed by main thread and main
                                                                            // thread is created by JVM.
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()); // printing thread name
        Thread.currentThread().setName("Sudhanshu Gupta"); // Changing thread name
        System.out.println(Thread.currentThread().getName()); // printing thread name
        // System.out.println(10 / 0); // checking thread name in exception

        // Order of execution of thread isn't determined by the order in which it is
        // written.
        l03ThreadNaming t1 = new l03ThreadNaming();
        t1.start();
        l03ThreadNaming t2 = new l03ThreadNaming();
        t2.start();
        l03ThreadNaming t3 = new l03ThreadNaming();
        t3.setName("Thread 3");
        t3.start();

        // Alive method
        System.out.println(Thread.currentThread().isAlive());
        System.out.println(t3.isAlive());
    }
}
