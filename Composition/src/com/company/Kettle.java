package com.company;

public class Kettle {
    private boolean full;
    private boolean teabags;
    private boolean boiled;

    public Kettle(boolean full, boolean teabags, boolean boiled) {
        this.full = full;
        this.teabags = teabags;
        this.boiled = boiled;
    }

    public void putKettleOn(){
        System.out.println("You put the kettle on. It is now boiled.");
        this.boiled = true;
    }

    public void getBiscuit(){
        System.out.println("You helped yourself to a biscuit.");
    }

    public boolean isFull() {
        return full;
    }

    public boolean isTeabags() {
        return teabags;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
