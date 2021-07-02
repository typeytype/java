package com.company;

public class YearsAndDays {
    public static void printYearsAndDays(long minutes) {
        if(minutes<0){
            System.out.println("Invalid Value");;}else{if(minutes<1440){
            System.out.println(minutes + " min = 0 y and 0 d");}else{
            long minDays = (long) Math.floor(minutes/1440);
            long years = (long) Math.floor(minDays/365);
            long days = (long) Math.floor(minDays % 365);
            long remainingMinutes = (minutes - (days*1440) - (years*525600));
            System.out.println(minutes + " min = " + years +" y and " + days + " d");
        }}
    }
}
