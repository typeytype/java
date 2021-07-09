package com.company;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "80W", dimensions);

        Monitor theMonitor = new Monitor("The Beast", "Acer", 27, new Resolution(2540, 1440));
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4 , 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();

        House house = new House(2_000_000, 25, 30, 2_000_000);
        Kitchen kitchen = new Kitchen(4, 12, true, true, true);
        Chair woodenChair = new Chair(false);
        Toaster toaster = new Toaster(false, 3, 4);
        Kettle kettle = new Kettle(true, true, false);

        woodenChair.getComfy();
        kettle.putKettleOn();
        toaster.toastBread(2);


    }
}
