package com.company;

public class Main {

    public static void main(String[] args) {
    canPack(4,2,22);
    getLargestPrime(16);
    }

    public static int getLargestPrime(int number){
        if(number<2){
            System.out.println("too low");return -1;}
        int equiv = number;
        for(int i = equiv; i>1; i--) {
            if(number%i==0){ // if divisor cleanly
// check if i prime
                int i = iequiv;
                for(int j = iequiv; j>2)


//                int equivb = i;
//
//                for(int j = equivb-1; j>1; j--){ //iterate down from divisor
//
//                    if(i%j==0){break;} //if divisor divides cleanly, stop
//
//                    if(j<2){ //if all factors incl. two weren't clean, return it as the prime factor
//                        System.out.println(i);
//                        return i;}
//                }
//            }
//        }
//        System.out.println("end");return -1;
    }}

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount<0 || smallCount<0 || goal<0){
            System.out.println("False");return false;}
        int big=bigCount;
        int small=smallCount;

        if((big*5 + small) == goal){
            System.out.println("True1");return true;}

        for(int i = 0; i<=big; i++){

            for(int j = 0; j<=small; j++){

                if((i*5)+j==goal){
                    System.out.println("True2");return true;}
                continue;
            } continue;
        }


        System.out.println("False");return false;
    }

}
