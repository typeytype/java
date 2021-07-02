package com.company;

public class MethodOverloading {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if((feet < 0) || (inches < 0) || (inches > 12)) {
            System.out.println("Invalid Value");return -1;}
        else {
            double totalInches = (feet*12) + inches;
            double centim = totalInches * 2.54;
            System.out.println(centim + "cm");
            return centim;

        }
    }
    public static double calcFeetAndInchesToCentimeters(double inches) {
    if(inches<0){
        System.out.println("Invalid Value");return -1;}
    else {

        double feet = (int) inches/12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + "inches is equal to " + feet + "feet and " + remainingInches);
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }

    }}
