package typeCasting;

public class Vehicle {
    public void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    public void drift() {
        System.out.println("Car is drifting");
    }
}

 class TestCasting {
    public static void main(String[] args) {
        // Upcasting
        Vehicle v = new Car();
        v.move(); // Output: "Car is moving"

        Car c = (Car) new Vehicle(); // Runtime Error: java.lang.ClassCastException
        c.move();
        c.drift();
    }
}