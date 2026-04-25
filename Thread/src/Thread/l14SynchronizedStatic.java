package Thread;

class BookTheaterSeatStatic {
    static int totalSeats = 20;

    static synchronized void bookSeat(int seats) {
        if (totalSeats >= seats) {
            System.out.println(seats + " seats booked successfully");
            totalSeats = totalSeats - seats;
            System.out.println("Seats left: " + totalSeats);
        } else {
            System.out.println("Sorry seats can't be booked!!!");
            System.out.println("Seats left: " + totalSeats);
        }
    }
}

class MyThread1 extends Thread {
    static BookTheaterSeatStatic b;
    int seats;

    MyThread1(BookTheaterSeatStatic b, int seats) {
        this.b = b;
        this.seats = seats;
    }

    @Override
    public void run() {
        b.bookSeat(seats);
    }
}

class MyThread2 extends Thread {
    static BookTheaterSeatStatic b;
    int seats;

    MyThread2(BookTheaterSeatStatic b, int seats) {
        this.b = b;
        this.seats = seats;
    }

    @Override
    public void run() {
        b.bookSeat(seats);
    }
}

public class l14SynchronizedStatic {
    public static void main(String[] args) {
        BookTheaterSeatStatic b1 = new BookTheaterSeatStatic();
        MyThread1 t1 = new MyThread1(b1, 7);
        t1.start();
        MyThread2 t2 = new MyThread2(b1, 6);
        t2.start();

        BookTheaterSeatStatic b2 = new BookTheaterSeatStatic();
        MyThread1 t3 = new MyThread1(b2, 9);
        t3.start();
        MyThread2 t4 = new MyThread2(b2, 5);
        t4.start();
    }
}
