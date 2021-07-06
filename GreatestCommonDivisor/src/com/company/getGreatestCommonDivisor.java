package com.company;

public class getGreatestCommonDivisor {
    public static int greatestCommonDivisor(int first, int second){
        if(first<10 || second<10){
            System.out.println("Invalid input");return -1;}
        int highDiv = first;

        for(int i = highDiv; i>1; i--){
            if(second%i==0 && first%i==0){
                System.out.println("Common divisor is " + i);return i;}
        }

        System.out.println("Common divisor is 1");
        return 1;
    }}
