package com.company;

public class DigitSum {
    public static int sumDigits(int number){
        if(number<10){return -1;}
        int sum = 0;
        while(number>10){
            sum += (number % 10);
            System.out.println(number%10);
            System.out.println("Rolling total of digits is " + sum);
            number /= 10;
            continue;}
        sum += Math.floor(number);
        System.out.println((int) Math.floor(number));
        System.out.println("Total sum of digits is " + sum);
        return sum;

        }

    }
