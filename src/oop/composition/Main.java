package oop.composition;

class Engine {
    private int horsePower;

    public Engine(int horsePower) {
        this.horsePower = horsePower;
    }

    public void start() {
        System.out.println("Car has started with " + horsePower + " horse power");
    }
}

class Wheel {
    private String type;

    public Wheel(String type) {
        this.type = type;
    }

    public void rotate() {
        System.out.println(type + " Wheel is rotating");
    }
}
class Car {
    private String carName;
    private Engine engine;
    private Wheel wheel;

    public Car(String carName, Engine engine, Wheel wheel) {
        this.carName = carName;
        this.engine = engine;
        this.wheel = wheel;
    }

    public void showCarDetails() {
        System.out.println("Car Name: " + carName);
        engine.start();
        wheel.rotate();
    }

}
public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(1200);
        Wheel wheel = new Wheel("Alloy");

        Car car = new Car("BMW", engine, wheel);
        car.showCarDetails();
    }
}
