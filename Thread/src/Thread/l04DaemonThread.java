package Thread;

public class l04DaemonThread extends Thread {
    @Override
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Daemon Thread");
        } else {
            System.out.println("Child Thread");
        }
    }

    public static void main(String[] args) {
        System.out.println("Main Thread"); // If this isn't written then daemon isn't executed.
        l04DaemonThread t = new l04DaemonThread();
        t.setDaemon(true);
        t.start();
    }
}
