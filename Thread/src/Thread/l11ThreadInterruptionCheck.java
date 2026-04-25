package Thread;

public class l11ThreadInterruptionCheck extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.interrupted()); // true ==> false
        // System.out.println(Thread.currentThread().isInterrupted());
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread " + i);
                Thread.sleep(1000);
                System.out.println(Thread.interrupted()); // but not false => true
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        l11ThreadInterruptionCheck t = new l11ThreadInterruptionCheck();
        t.start();
        t.interrupt();
    }
}
