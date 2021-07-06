package com.company;

public class SumEvenDigits {
    public static int getEvenDigitSum(int number){
        if(number<0){return -1;}
        int counter=0;
        while(number>10){
            int eval = number%10;
            if(eval%2==0){counter+=eval;}
            number/=10;
            continue;
            }
        if(number%2==0){
            counter+=number;
        }
        System.out.println(counter);
        return counter;

    }
}
