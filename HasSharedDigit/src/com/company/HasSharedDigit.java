package com.company;

public class HasSharedDigit {
    public static boolean hasSharedDigit(int one, int two){
        if(one<10 || one>99 || two<10 || two>99){
            System.out.println("No matches");return false;}
        if( one%10 == two%10 || Math.floor(one/10) == Math.floor(two/10) ||
        one%10 == (int) Math.floor(two/10) || two%10 == (int) Math.floor(one/10) ){
            System.out.println("Matching digit(s)");
            return true;}
        System.out.println("No matches");return false;
    }
}
