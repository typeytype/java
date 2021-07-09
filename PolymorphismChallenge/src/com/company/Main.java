package com.company;

class Car {
    private boolean engine = true;
    private int cylinders;
    private String name;
    private int wheels = 4;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }

    public void startEngine(){
        System.out.println("Car's engine has started.");
    }

    public void accelerate(){
        System.out.println("Car has accelerated.");
    }

    public void brake(){
        System.out.println("Car has braked.");
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}

class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("Ford's engine has started.");
    }

    @Override
    public void accelerate() {
        System.out.println("Ford has accelerated.");
    }

    @Override
    public void brake() {
        System.out.println("Ford has braked.");
    }
}

class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("Holden's engine has started.");
    }

    @Override
    public void accelerate() {
        System.out.println("Holden has accelerated.");
    }

    @Override
    public void brake() {
        System.out.println("Holden has braked.");
    }
}





class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("Mitsubishi's engine has started.");
    }

    @Override
    public void accelerate() {
        System.out.println("Mitsubishi has accelerated.");
    }

    @Override
    public void brake() {
        System.out.println("Mitsubishi has braked.");
    }
}




public class Main {

    public static void main(String[] args) {

        Car car = new Car(12, "Porsche");
        car.startEngine();
        car.accelerate();
        car.brake();

        Mitsubishi mitsubishi = new Mitsubishi(10, "Lancer Evo");
        mitsubishi.startEngine();
        mitsubishi.accelerate();
        mitsubishi.brake();

        Ford ford = new Ford(6, "Fiesta");
        ford.startEngine();
        ford.accelerate();
        ford.brake();

        Holden holden = new Holden(10, "Ute");
        holden.startEngine();
        holden.accelerate();
        holden.brake();
    }
}
