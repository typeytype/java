package com.company;

public class NoDaysInMonth {
    public static boolean isLeapYear(int year){
        if(year<1 || year>9999){
            System.out.println("False");return false;}
        else if(year%400==0){
            System.out.println("False");return true;}
        else if(year%4==0 && year%100==0){
            System.out.println("False");return false;}
        else if(year%4 == 0){
            System.out.println("True");return true;}
        else{
            System.out.println("False");return false;}
    }

    public static int getDaysInMonth(int month, int year){
        if(year<1 || year>9999 || month<1 || month>12){
            System.out.println("Invalid date");return -1;}
        else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 ){
            System.out.println("31 days");return 31;
        }
        else if (month == 4 ||month == 6 ||month == 9 ||month == 11){
            System.out.println("30 days");return 30;
        } else if (year%400 == 0 || (year%4==0 && year%100 != 0)){
            System.out.println("29 days");return 29;}
        else{
            System.out.println("28 days");return 28;}
    }
}
