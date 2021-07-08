package com.company;

public class Floor {

    private double width;
    private double length;

    public Floor(double width, double length) {
        System.out.println("Dimensions called.");
        this.width = width;
        if (this.width < 0) {this.width = 0;}
        this.length = length;
        if (this.length < 0) {this.length = 0;}
    }

    public double getArea() {
        return width * length;
    }
}