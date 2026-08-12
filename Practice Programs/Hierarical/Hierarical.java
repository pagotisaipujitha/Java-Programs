package typesofinheritence;
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting.");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is moving.");
    }
}

class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike is running.");
    }
}

public class Hierarical{
    public static void main(String[] args) {

        Car c = new Car();
        System.out.println("Car:");
        c.start();
        c.drive();

        System.out.println();

        Bike b = new Bike();
        System.out.println("Bike:");
        b.start();
        b.ride();
    }
}
