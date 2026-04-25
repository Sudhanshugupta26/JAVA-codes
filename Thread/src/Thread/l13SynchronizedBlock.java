package Thread;

class BookTheaterSeatBlock {
    int totalSeats = 10;

    void bookSeat(int seats) {
        System.out.println("Hi: " + Thread.currentThread().getName());
        System.out.println("Hi: " + Thread.currentThread().getName());
        System.out.println("Hi: " + Thread.currentThread().getName());
        System.out.println("Hi: " + Thread.currentThread().getName());
        System.out.println("Hi: " + Thread.currentThread().getName());
        synchronized (this) {
            if (totalSeats >= seats) {
                System.out.println(seats + " seats booked successfully");
                totalSeats = totalSeats - seats;
                System.out.println("Seats left: " + totalSeats);
            } else {
                System.out.println("Sorry seats can't be booked!!!");
                System.out.println("Seats left: " + totalSeats);
            }
        }
        System.out.println("Bye: " + Thread.currentThread().getName());
        System.out.println("Bye: " + Thread.currentThread().getName());
        System.out.println("Bye: " + Thread.currentThread().getName());
        System.out.println("Bye: " + Thread.currentThread().getName());
        System.out.println("Bye: " + Thread.currentThread().getName());
    }
}

public class l13SynchronizedBlock extends Thread {
    static BookTheaterSeatBlock b;
    int seats;

    @Override
    public void run() {
        b.bookSeat(seats);
    }

    public static void main(String[] args) {
        b = new BookTheaterSeatBlock();
        l13SynchronizedBlock gupta = new l13SynchronizedBlock();
        gupta.seats = 7;
        gupta.start();

        l13SynchronizedBlock sharma = new l13SynchronizedBlock();
        sharma.seats = 3;
        sharma.start();
    }
}
