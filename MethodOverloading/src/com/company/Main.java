package com.company;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        MethodOverloading.calcFeetAndInchesToCentimeters(7,5);
        MethodOverloading.calcFeetAndInchesToCentimeters(100);
        int newScore = calculateScore("Montinho", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
    }
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore() {
        System.out.println("Unnamed player logged no score");
        return 0;
    }



}
