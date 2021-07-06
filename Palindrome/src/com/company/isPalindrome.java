package com.company;

public class isPalindrome {
    public static boolean palindrome(int number) {
        if(number<10 && number>-10){
            System.out.println("Palindrome");return true;}
        int compare = 0;
        int equiv = number;
        while(equiv>=10){
            compare *= 10;
            compare += equiv % 10;
            equiv /= 10;
            continue;
        }
        compare *= 10;
        compare += equiv;
        System.out.println(number);
        System.out.println(compare);
        if(compare==number){
            System.out.println("Palindrome");return true;}
        System.out.println("Not a palindrome");return false;
    }
}
