package com.company;

public class PrintFactors {
    public static void printFactors(int number){
        if(number<1){
            System.out.println("Invalid Value");}
        else {
        String factors = "1";
        for(int i=2; i<=number; i++){
            if(number%i==0){factors+=(" " +i);
                ;}
        } System.out.println(factors);
    }}
}
