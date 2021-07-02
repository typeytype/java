package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver;
        calculateInitScore(800);
        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score " + highScore);

        int leaderboardScore = calculateHighScorePosition(1500);
        displayHighScorePosition("Kermit", leaderboardScore);

        leaderboardScore = calculateHighScorePosition(900);
        displayHighScorePosition("Elmo", leaderboardScore);

        leaderboardScore = calculateHighScorePosition(400);
        displayHighScorePosition("Cookie Monster", leaderboardScore);

        leaderboardScore = calculateHighScorePosition(50);
        displayHighScorePosition("Big Bird", leaderboardScore);

        leaderboardScore = calculateHighScorePosition(1000);
        displayHighScorePosition("Percy", leaderboardScore);

        leaderboardScore = calculateHighScorePosition(500);
        displayHighScorePosition("Graeme", leaderboardScore);

        leaderboardScore = calculateHighScorePosition(100);
        displayHighScorePosition("Tristan", leaderboardScore);
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int rankingScore) {
        if(rankingScore>=1000){return 1;}
        else if(rankingScore>=500){return 2;}
        else if(rankingScore>=100){return 3;}
        else {return 4;}
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
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