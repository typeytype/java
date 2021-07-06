package com.company;

public class SumOdd {
    public static boolean isOdd(int number){
        if(number<0){
            System.out.println("Number is negative");return false;}
        if(number%2==0){
            System.out.println("Number is even");return false;}
        System.out.println("Number is odd");return true;
    }

    public static int sumOdd(int start, int end){
        if(end<start || start<0){return -1;}
        int oddSum = 0;
        for(int i=start; i<=end; i++){
            if(isOdd(i)){
                oddSum+=i;
            }
        }
        System.out.println(oddSum);return oddSum;
    }
}