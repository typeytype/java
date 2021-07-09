package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,0};
        reverse(array);
    }

    public static void reverse(int[] array){
        int[] temp = Arrays.copyOf(array, array.length);
        for(int i=0; i<array.length; i++){temp[i] = array[array.length-i-1];}
        System.out.println("Array = "+Arrays.toString(array));
        System.out.println("Reversed array = "+Arrays.toString(temp));
    }
}