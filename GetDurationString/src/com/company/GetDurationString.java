package com.company;

public class GetDurationString {
    public static String getDurationString(int minutes, int seconds) {
        if(minutes < 0 && seconds < 0 && seconds > 59) { return "Invalid value";
        } else {
        if(minutes>59) { int hours = (int) Math.floor(minutes /60); int mins = (int) minutes % 60;
            System.out.println(hours + "h " + mins + "m " + seconds + "s");
            return hours + "h " + mins + "m " + seconds + "s";}
        else {System.out.println("0h " + minutes + "m " + seconds + "s");
            return "0h " + minutes + "m " + seconds + "s";}


        }
    }

    public static String getDurationString(int seconds) {
        if(seconds < 0) {return "Invalid value";}
        else {
            int newMins = (int) Math.floor(seconds/60);
            int newSecs = seconds % 60;
            return getDurationString(newMins, newSecs);
        }
    }

    }
