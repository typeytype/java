package com.company;

public class Kitchen {
    private int chairs;
    private int mugs;
    private boolean biscuits;
    private boolean teabags;
    private boolean milk;


    public Kitchen(int chairs, int mugs, boolean biscuits, boolean teabags, boolean milk) {
        this.chairs = chairs;
        this.mugs = mugs;
        this.biscuits = biscuits;
        this.teabags = teabags;
        this.milk = milk;
    }

    public int getChairs() {
        return chairs;
    }

    public int getMugs() {
        return mugs;
    }

    public boolean isBiscuits() {
        return biscuits;
    }

    public boolean isTeabags() {
        return teabags;
    }

    public boolean isMilk() {
        return milk;
    }
}
