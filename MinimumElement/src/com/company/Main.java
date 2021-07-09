package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = readElements(readInteger());
        for(int i = 0; i < arr.length; i++){System.out.println("Entry "+(i+1)+" at position "+i+" is "+arr[i]);}
        System.out.println("Entries in totality per input order: "+Arrays.toString(arr));
        System.out.println("The minimum value among the input is "+findMin(arr));
    }

    public static int readInteger(){
        System.out.println("Enter your desired count into the console:");
        return scanner.nextInt();
    }

    public static int[] readElements(int count){
        int[] values = new int[count];
        System.out.println("Enter "+count+ " integers into the console.");
        for(int i=0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static int findMin(int[] array){
        int[] temp = Arrays.copyOf(array, array.length);
        Arrays.sort(temp);
        return temp[0];
    }


}
