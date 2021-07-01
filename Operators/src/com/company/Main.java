package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult); // previousResult not updated

        result = result * 10; // 2 * 10 = 20;
        System.out.println("2 * 10 = " + result);

        result = result / 5;
        System.out.println("20 / 5 = " + result);

        result = result % 3; // gives the remainder
        System.out.println("4 % 3 = " + result);

        result++; // 1 + 1 = 2
        System.out.println(result);

        result--; // 2 + 1 = 1
        System.out.println(result);

        result += 2; // 1 + 2 = 3
        System.out.println(result);

        result *= 10; // 3 * 10 = 30
        System.out.println(result);

        result /= 3;
        System.out.println(result);

        result -= 2;
        System.out.println(result);

        boolean isAlien = false;
        if (isAlien == false) { // using a code block (curly braces) is best practice for conditional logic
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) { // && represents and
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) { // remember to use two equals, otherwise error due to only assigning of value
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar) { // this shorthand represents a boolean test for true/false depending on the exclamation mark
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false; // ternary operator ? conditionally assigns one of two values
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        double chValue1 = 20;
        double chValue2 = 80;
        double chValue3 = ((chValue1 + chValue2) * 100);
        double chRemain = chValue3 % 40;
        boolean zeroCheck = (chRemain == 0 ? true : false);
        System.out.println(zeroCheck);
        if (zeroCheck == false) {
            System.out.println("Got some remainder");
        }
    }
}
