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

        
    }
}
