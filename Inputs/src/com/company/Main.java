package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int high = 0;
        int low = 0;
        Scanner scanner = new Scanner(System.in);
        {
        System.out.println("Enter any number:");
        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt){
            high = scanner.nextInt();
            low = high;
            scanner.nextLine();
        }}

        for(int i = 1; i<10; i++){
        System.out.println("Now enter an additional number:");
        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt){
            int val = scanner.nextInt();
            if(val>high){high=val;}
            if(val<low){low=val;}
            scanner.nextLine();
        }

    }
        System.out.println("The highest number entered was " + high + " and the lowest was " + low);
    }
}
