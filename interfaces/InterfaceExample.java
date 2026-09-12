package interfaces;

interface Vehicle {
    void start();

    void stop();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting...");
    }

    public void stop() {
        System.out.println("Car is stopping...");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();
        v.stop();

    }

}
