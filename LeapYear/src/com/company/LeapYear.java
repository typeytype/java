package com.company;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if(year < 1 || year > 9999) {
            System.out.println("False");return false;}
        else if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            System.out.println("True");return true;}
        else if(year % 4 == 0 && (year % 100) > 0) {
            System.out.println("True");return true;}
        else {
            System.out.println("False");return false;}
    }
    }
