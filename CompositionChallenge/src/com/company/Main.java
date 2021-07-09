package com.company;

public class Main {

    public static void main(String[] args) {
    Lamp lamp = new Lamp("Scandinavian minimalist", true, 527);
    Bed bed = new Bed("Scottish tartan", 4, 3, 2, 1);
    Ceiling ceiling = new Ceiling(11, 2);
    Wall wall1 = new Wall("North");
    Wall wall2 = new Wall("East");
    Wall wall3 = new Wall("South");
    Wall wall4 = new Wall("West");
    Bedroom bedroom = new Bedroom("Montinho", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

    bedroom.getLamp().turnOn();
    bedroom.makeBed();


    }
}
