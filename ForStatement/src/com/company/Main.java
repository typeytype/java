package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% = " + calculateInterest(10000, 2.0));
        System.out.println("10,000 at 2% = " + calculateInterest(10000, 2.0));
        System.out.println("10,000 at 2% = " + calculateInterest(10000, 2.0));
        System.out.println("10,000 at 2% = " + calculateInterest(10000, 2.0));

        for(int i=2; i<9; i++){
            System.out.println("10,000 at " + i + "% = " + String.format("%.2f", calculateInterest(10000, i)));
        }

        for(int i=8; i>1; i--){
            System.out.println("10,000 at " + i + "% = " + String.format("%.2f", calculateInterest(10000, i)));
        }

        int count = 0;
        for(int i = 1000; i<5000; i++){
            if(isPrime(i)){
                count++;
                System.out.println("Number " + i + " is a prime number");
                if(count == 10) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }

        }


        int counter = 0;
        int counterSum = 0;
        for(int i = 473; i<=1000; i++){
            if(i%3==0 && i%5==0){
                counterSum+=i;
                counter++;
                System.out.println(i + " can be divided by both 5 and 3");
                if(counter==5){
                    break;
                }
            }
        }
        System.out.println(counterSum + " is the sum of the above numbers");
    }


        public static boolean isPrime(int n) {
            if (n == 1) {return false;}
            for(int i=2; i<=n/2; i++) {
                if (n%i==0) {
                    return false;}}
            return true;}

    public static double calculateInterest(double amount, double interestRate){
        return (amount*(interestRate/100));
    }
}
