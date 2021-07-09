package com.company;


class Hamburger {
    private int breadType;
    private int meatType;
    private double price = 10.00;
    private int toppings;

    public Hamburger(int breadType, int meatType, double price) {
        this.breadType = breadType;
        this.meatType = meatType;
        this.price = price;
        int toppings = 0;
    }

    public int getBreadType() {
        return breadType;
    }

    public int getMeatType() {
        return meatType;
    }

    public double getPrice() {
        return price;
    }
    public double getBasePrice() {
        return price-toppings;
    }

    public double addTop(int topping) {
        if (this.price >= 14.00) {
            System.out.println("Maximum number of toppings selected.");
            return this.price;
        } else {
            switch (topping) {
                case 1:
                    price += 1.00;
                    toppings +=1;                    System.out.println("Additional Topping 1 added at cost of £1.00. New price: " + this.price);
                    return this.price;

                case 2:
                    price += 1.00;
                    toppings +=1;                    System.out.println("Additional Topping 2 added at cost of £1.00. New price: " + this.price);
                    return this.price;

                case 3:
                    price += 1.00;
                    toppings +=1;                    System.out.println("Additional Topping 3 added at cost of £1.00. New price: " + this.price);
                    return this.price;

                case 4:
                    price += 1.00;
                    toppings +=1;                    System.out.println("Additional Topping 4 added at cost of £1.00. New price: " + this.price);
                    return this.price;

                case 5:
                    price += 1.00;
                    toppings +=1;
                    System.out.println("Additional Topping 5 added at cost of £1.00. New price: " + this.price);
                    return this.price;

                default:
                    System.out.println("Invalid selection.");
                    return this.price;

            }
        }


    }
}

class Healthburger extends Hamburger {
    private int toppings;
    public Healthburger() {
        super(4, 3, 8.00);
        int toppings = 0;
    }
}

class Deluxeburger extends Hamburger {
    private int toppings;
    public Deluxeburger() {
        super(2, 1, 18.00);
        int toppings = 0;
    }


}



public class Main {

    public static void main(String[] args) {
        Hamburger ham = new Hamburger(2, 2, 10);
        Healthburger health = new Healthburger();
        Deluxeburger deluxe = new Deluxeburger();

        System.out.println(ham.getBreadType());
        System.out.println(health.getBreadType());
        System.out.println(deluxe.getBreadType());
        System.out.println(ham.getMeatType());
        System.out.println(health.getMeatType());
        System.out.println(deluxe.getMeatType());
        System.out.println(ham.getPrice());
        System.out.println(health.getPrice());
        System.out.println(deluxe.getPrice());
        ham.addTop(1);
        ham.addTop(2);
        ham.addTop(3);
        ham.addTop(4);
        ham.addTop(5);
        health.addTop(3);
        health.addTop(4);
        health.addTop(2);
        health.addTop(5);
        health.addTop(4);
        health.addTop(1);
        health.addTop(1);
        deluxe.addTop(5);

        System.out.println(ham.getPrice());
        System.out.println(ham.getBasePrice());

        System.out.println(health.getPrice());
        System.out.println(health.getBasePrice());

        System.out.println(deluxe.getPrice());
        System.out.println(deluxe.getBasePrice());

    }
}
