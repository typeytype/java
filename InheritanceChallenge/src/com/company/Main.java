package com.company;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Car");
        vehicle.getMode();
        Car car = new Car("Ferrari", "F50", 2002, 180, 250000);
        car.getModel();
        car.getMake();
        car.buy();
        car.drive();
    }
}
