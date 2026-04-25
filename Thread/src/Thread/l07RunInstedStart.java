package Thread;

public class l07RunInstedStart extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(i + " " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        l07RunInstedStart t1 = new l07RunInstedStart();
        t1.run(); // Due to this it is treated as the execution of main thread or the normal
                  // method execcution and not seperate thread.
        // t1.start();

        l07RunInstedStart t2 = new l07RunInstedStart();
        t2.run();
        // t2.start();
    }
}
