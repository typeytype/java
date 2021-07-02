package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;

        calculateInitScore(800);
        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score " + highScore);
        calculateScore(true, 10000, 8, 200);


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore+=2000;
            return finalScore;
        } else { return -1; }
    }

    public static void calculateInitScore(int mainScore) {
        if(mainScore < 5000 && mainScore > 1000) {
            System.out.println("Your score was less than 5000 but more than 1000.");
            System.out.println("The if was executed");
        } else if (mainScore < 1000) {
            System.out.println("Your score was less than 1000.");
            System.out.println("The elseif was executed.");
        } else {
            System.out.println("The else was executed.");
        }
    }
}