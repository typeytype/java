package com.company;

public class Car extends Vehicle {
    private String make;
    private String model;
    private int year;
    private int topSpeed;
    private double price;

    public Car(String make, String model, int year, int topSpeed, double price){
        super("Car");
        this.make = make;
        this.model = model;
        this.year = year;
        this.topSpeed = topSpeed;
        this.price = price;

    }

    public String getMake() {
        System.out.println(this.make);
        return this.make;
    }

    public String getModel() {
        System.out.println(this.model);
        return this.model;
    }

    public int getYear() {
        System.out.println(this.year);
        return this.year;
    }

    public int getTopSpeed() {
        System.out.println(this.topSpeed);
        return this.topSpeed;
    }

    public double getPrice() {
        System.out.println(this.price);
        return this.price;
    }

    public void buy(){
        System.out.println("You purchased the "+this.make+" "+this.model+" for a price of £"+this.price);
    }
    public void drive(){
        move();
        System.out.println("The car accelerates to "+this.topSpeed+"mph");
    }

}
