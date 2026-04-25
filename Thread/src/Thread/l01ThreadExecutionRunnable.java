package Thread;

public class l01ThreadExecutionRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread Task 2!");
    }

    public static void main(String[] args) {
        l01ThreadExecutionRunnable t = new l01ThreadExecutionRunnable();
        Thread th = new Thread(t);
        th.start();
    }
}