package com.company;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = myArray(5);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Value " + i + " entered as: " + array[i]);
        }
        Arrays.sort(array);
        System.out.println("Sorted input in ascending order: "+Arrays.toString(array));
    }



    public static int[] myArray(int number) {
        int[] values = new int[number];
        System.out.println("Enter " +number+ " new values:");
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

//    private static Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        int[] myIntegers = getIntegers(5);
//        for(int i = 0; i< myIntegers.length; i++){
//            System.out.println("Element "+i+", typed value was "+myIntegers[i]);
//        }
//        System.out.println("The average is "+getAverage(myIntegers));
//    }
//    public static int[] getIntegers(int number){
//        System.out.println("Enter "+number+" integer values.\r");
//        int[] values = new int[number];
//        for(int i = 0; i< values.length; i++){
//            values[i] = scanner.nextInt();
//        }
//        return values;
//    }
//    public static double getAverage(int[] array){
//        int sum = 0;
//        for(int i=0; i<array.length;i++){
//            sum += array[i];
//        }
//        return (double) sum / (double) array.length;
//    }
//}
}