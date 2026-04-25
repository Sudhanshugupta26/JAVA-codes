package Thread;

public class l10InterruptThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread " + i);
                // Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        l10InterruptThread t = new l10InterruptThread();
        t.start();
        t.interrupt();
    }
}
