package com.company;

public class SumFirstLast {
    public static int sumFirstAndLastDigit(int number){
        if(number<0){return -1;}
        if((number<10 && number>=0) || (number>-10 && number<0)){return number*2;}

        int lastDigit = number % 10;
        System.out.println(lastDigit);
        int counter = 0;
        int equiv = number;
        while(number>=10){
            counter++;
            number /= 10;
            continue;

        }
        int firstDigit = (int) Math.floor(equiv/(Math.pow(10, counter)));
        System.out.println(firstDigit);
        System.out.println(firstDigit+lastDigit);
        return firstDigit+lastDigit;
    }
}
