package Thread;

public class l05ThreadPriority extends Thread {
    @Override
    public void run() {
        Thread.currentThread().setPriority(6);
        System.out.println(Thread.currentThread().getPriority());
        System.out.println("Task");
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        l05ThreadPriority t = new l05ThreadPriority();
        t.start();
    }
}
