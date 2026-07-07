package pack1;

interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car starts.");
    }

    @Override
    public void stop() {
        System.out.println("Car stops.");
    }
}

public class Interface {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.stop();
    }
}