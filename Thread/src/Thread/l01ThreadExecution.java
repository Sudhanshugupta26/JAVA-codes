package Thread;

public class l01ThreadExecution extends Thread {
    @Override
    public void run() {
        System.out.println("Thread Task!");
    }

    public static void main(String[] args) {
        l01ThreadExecution t = new l01ThreadExecution();
        t.start();
        // t.start(); // This will give error
    }
}
