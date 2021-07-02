package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int mainScore = 800;
        if(mainScore < 5000 && mainScore > 1000) {
            System.out.println("Your score was less than 5000 but more than 1000.");
            System.out.println("The if was executed");
        } else if (mainScore < 1000) {
            System.out.println("Your score was less than 1000.");
            System.out.println("The elseif was executed.");
        }
        else {
            System.out.println("The else was executed.");
        }


        if (gameOver == true) {
            int score = 800;
            int levelCompleted = 5;
            int bonus = 100;
            int finalScore = score + (levelCompleted * bonus);
            finalScore+=1000;
            System.out.println("Your final score " + finalScore);

        }
        if (gameOver == true) {
            int score = 10000;
            int levelCompleted = 8;
            int bonus = 200;
            int finalScore = score + (levelCompleted * bonus);
            finalScore+=1000;
            System.out.println("Your final score " + finalScore);
        }
    }
}