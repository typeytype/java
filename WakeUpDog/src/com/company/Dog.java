package com.company;

public class Dog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if(barking && ((hourOfDay < 8 && hourOfDay >= 0) || (hourOfDay == 23))) {
            System.out.println("True");
            return true;}
        else {
            System.out.println("False");
            return false;}}
}
