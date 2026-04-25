package Thread;

class TotalEarning extends Thread {
    int total = 0;

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                total += 100;
            }
            this.notifyAll(); // this will release lock from this thread and give chance to all other threads
        }
    }
}

public class l15InterThread {
    public static void main(String[] args) {
        TotalEarning te = new TotalEarning();
        te.start();

        // System.out.println(te.total);

        synchronized (te) {
            System.out.println("Total Earnings: " + te.total);
            try {
                te.wait(); // this will wait the main thread execution.
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Total Earnings: " + te.total);
        }
    }
}
