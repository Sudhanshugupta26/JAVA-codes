package Thread;

public class l09JoinThread extends Thread {
    static Thread mainthread;

    @Override
    public void run() {
        try {
            mainthread.join(); // t thread will wait to complete main thread.
            for (int i = 0; i < 5; i++) {

                Thread.sleep(1000);

                System.out.println("Child Thread " + i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        mainthread = Thread.currentThread();

        l09JoinThread t = new l09JoinThread();
        t.start();

        // try {
        // t.join(); // Main thread wait to complete t thread.
        // } catch (Exception e) {
        // e.printStackTrace();
        // }

        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Main thread " + i);
        }
    }
}
