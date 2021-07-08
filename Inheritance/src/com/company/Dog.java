package com.company;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog is chewing.");
    }

    @Override
    public void eat() {
        System.out.println("Dog eat called.");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog walks.");
        move(5);
    }

    private void moveLegs(int speed){
        System.out.println("Dog legs are moving.");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog is on the move.");
        moveLegs(speed);
        super.move(speed);
    }

    public void run(){
        System.out.println("Dog runs.");
        move(10);
    }
}
