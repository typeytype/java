package com.company;

public class Main {

    public static void main(String[] args) {
        byte myChallengeByte = (byte) 100;
        short myChallengeShort = (short) 10000;
        int myChallengeInt = (int) 1_000_000_000;
        long myChallengeLong = (long) (50000L + 10L * (myChallengeByte + myChallengeShort + myChallengeInt));
        System.out.println(myChallengeLong);

        short shortTotal = (short) (1000 + 10 * (myChallengeByte + myChallengeShort + myChallengeInt));
        System.out.println(shortTotal);
    }
}
