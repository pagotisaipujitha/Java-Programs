
class Reservation {
    int availableSeats = 10;

    synchronized void reserve(String name, int requestedSeats) {
        System.out.println(name + " entered.");
        System.out.println("Available seats: " + availableSeats
                + " Requested seats: " + requestedSeats);

        if (requestedSeats <= availableSeats) {
            System.out.println("Seat Available. Reserve now :-)");
            availableSeats = availableSeats - requestedSeats;
            System.out.println(requestedSeats + " seats reserved.");
        } else {
            System.out.println("Requested seats not available :-)");
        }

        System.out.println(name + " leaving.");
        System.out.println("----------------------------------------------");
    }
}

class Person extends Thread {
    Reservation reservation;
    int requestedSeats;

    Person(Reservation reservation, String name, int requestedSeats) {
        super(name);
        this.reservation = reservation;
        this.requestedSeats = requestedSeats;
    }

    public void run() {
        reservation.reserve(getName(), requestedSeats);
    }
}

public class ReservationDemo {
    public static void main(String[] args) {
        Reservation r = new Reservation();

        Person p1 = new Person(r, "Person-1", 5);
        Person p2 = new Person(r, "Person-2", 2);
        Person p3 = new Person(r, "Person-3", 4);

        p1.start();
        try {
            p1.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }

        p2.start();
        try {
            p2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }

        p3.start();
    }
}
