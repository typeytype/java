package com.company;

public class Main {

    public static void main(String[] args) {
isPerfectNumber(28);
    }

    public static boolean isPerfectNumber(int number){
        if(number<1){
            System.out.println("Imperfect");return false;}
        int isPerfectMult=1;
        for(int i=2; i<number; i++){
            if(number%i==0){
                isPerfectMult+=i;
                System.out.println(isPerfectMult);}
        } if(isPerfectMult==number){
            System.out.println("Perfect");return true;}
        System.out.println("Imperfect");return false;
    }
}
