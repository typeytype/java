package com.company;

public class Chair {
    private boolean comfy;

    public Chair(boolean comfy) {
        this.comfy = comfy;
    }

    public void getComfy(){
        this.comfy = true;
        System.out.println("You moved from the hard wooden chair to a plush, comfier one.");
    }

    public boolean isComfy() {
        return comfy;
    }

}
