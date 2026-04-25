package Thread;

public class l08YeildThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        l08YeildThread t = new l08YeildThread();
        t.start();
        Thread.yield(); // trying to stop main thread execution and provide chance to other threads.
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread " + i);
        }
    }
}
