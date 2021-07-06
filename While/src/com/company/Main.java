package com.company;

public class Main {

    public static void main(String[] args) {
//        int count = 0;
//        while(count != 6){
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        for(int i=6; i!=6; i++){
//            System.out.println("Count value is " + count);
//        }
//
//        count = 5;
//        do{
//            System.out.println("Count value is " + count);
//            count++;
//        }while(count!=6);

        int number = 4;
        int finishNumber = 20;
        int counting = 0;

        while (number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even number " + number);
            counting++;
                    if(counting==5){
                        System.out.println(counting + " even numbers have been found");break;}
        }
    }


    public static boolean isEvenNumber(int number){
        if(number%2==0){return true;}return false;
    }
}
