package Thread;

class BookTheaterSeat {
    int totalSeats = 10;

    synchronized void bookSeat(int seats) {
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

public class l12SynchronizedMethod extends Thread {
    static BookTheaterSeat b;
    int seats;

    @Override
    public void run() {
        b.bookSeat(seats);
    }

    public static void main(String[] args) {
        b = new BookTheaterSeat();
        l12SynchronizedMethod gupta = new l12SynchronizedMethod();
        gupta.seats = 7;
        gupta.start();

        l12SynchronizedMethod sharma = new l12SynchronizedMethod();
        sharma.seats = 3;
        sharma.start();
    }
}
