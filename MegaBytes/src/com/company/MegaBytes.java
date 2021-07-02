package com.company;

import org.w3c.dom.ls.LSOutput;

public class MegaBytes {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if(kiloBytes<0) {
            System.out.println("Invalid Value");
        }else{
        int megs = (int) Math.floor(kiloBytes/1024);
        int kils = kiloBytes % 1024;

        System.out.println(kiloBytes + " KB = " + megs + " MB and " + kils + " KB");

    }}

}
