package com.company;

public class Vehicle {
    private String mode;

    public Vehicle(String mode){
        this.mode=mode;
    }

    public String getMode(){
        System.out.println("The type of vehicle is a "+this.mode);
        return this.mode;
    }

public void move(){
    System.out.println("The "+this.mode+" has begun to move.");
}}
