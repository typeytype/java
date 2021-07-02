package com.company;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double decOne, double decTwo) {
        if (decOne < 0 && decTwo < 0) {decOne *= -1; decTwo *= -1;}

        int decOneA = (int) (Math.floor(1000 * decOne));
        int decTwoA = (int) (Math.floor(1000 * decTwo));
        if (decOneA == decTwoA) {
            System.out.println("True");return true;}
        else {
            System.out.println("False");return false;}

        }
}
