package com.company;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(2);
        Cylinder cylinder = new Cylinder(circle.getRadius(), 7);
        System.out.println(cylinder.getVolume());

        Rectangle rectangle = new Rectangle(4, 4);
        Cuboid cuboid = new Cuboid(rectangle.getWidth(), rectangle.getLength(), 7);
        System.out.println(cuboid.getVolume());

        System.out.println(cylinder.getVolume()-cuboid.getVolume());
    }
}
