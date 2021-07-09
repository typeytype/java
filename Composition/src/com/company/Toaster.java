package com.company;

public class Toaster {
    private boolean on;
    private int outOfSix;
    private int breadSlots;

    public Toaster(boolean on, int outOfSix, int breadSlots) {
        this.on = on;
        this.outOfSix = outOfSix;
        this.breadSlots = breadSlots;
    }

    public void toastBread(int slices){
        this.on=true;
        System.out.println("You toasted "+slices+ " piece(s) of bread and ate it.");
        this.on=false;
    }

    public boolean isOn() {
        return on;
    }

    public int getOutOfSix() {
        return outOfSix;
    }

    public int getBreadSlots() {
        return breadSlots;
    }
}
