package com.company;

public class Main {

    public static void main(String[] args) {
        int value = 2;
        if(value == 1) {
            System.out.println("Value was 1");
        }
        else if(value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was not 1 or 2");
        }

        int switchValue = 3;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Value was 3, 4 or 5");
                System.out.println("It was in fact a " + switchValue);
                break;

            default:
                System.out.println("Value was not 1 or 2.");
        }

        char switchValue1 = 'N';

            switch(switchValue1) {
                case 'A':
                    System.out.println("Character was an A");
                    break;

                case 'B':
                    System.out.println("Character was a B");
                    break;

                case 'C':
                    System.out.println("Character was a C");
                    break;

                case 'D':
                    System.out.println("Character was a D");
                    break;

                case 'E':
                    System.out.println("Character was an E");
                    break;

                default:
                    System.out.println("Character was outside the range of A-E");
            }

            String month = "aPRiL";
            switch(month.toLowerCase()) {
                case "january":
                    System.out.println("Jan");
                    break;
                case "april":
                    System.out.println("Apr");
                    break;
                default:
                    System.out.println("Not sure.");
            }








    }
}
