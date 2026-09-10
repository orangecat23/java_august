package abstractExamples;

abstract class Vehicle {
    int noOfTyres;

    void displayTyres() {
        System.out.println("No. of tyres: " + noOfTyres);
    }

    abstract void start();
}

class Car extends Vehicle {

    void start() {
        noOfTyres = 4;
        System.out.println("Car is starting...");
    }

}

class Bike extends Vehicle {

    void start() {
        noOfTyres = 2;
        System.out.println("Bike is starting...");
    }

}

public class AbstractExample {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.displayTyres();
        Vehicle bike = new Bike();
        bike.start();
        bike.displayTyres();

    }

}
