package com.company;

public class Main {

    public static void main(String[] args) {
    printSquareStar(5);
    }

    public static void printSquareStar(int number){
        if(number<5){System.out.println("Invalid Value");}
        else {

        String stars = "";

        for(int i=1; i<=number; i++){
            for(int j=1; j<=number; j++){
                if(j==number){
                    if(j==1 || j==number){stars+="*\n"; continue;}
                    if(j==i){stars+="*\n"; continue;}
                    if(j==(number-i+1)){stars+="*\n"; continue;}
                    stars+=" ";}
                else{
                    if(j==1 || j==number || i==1 || i==number){stars+="*"; continue;}
                    if(j==i){stars+="*"; continue;}
                    if(j==(number-i+1)){stars+="*"; continue;}
                    stars+=" ";}

            }
        }
        System.out.println(stars);
    }}
//          Conditions
// First or last in a row or column
// Equal row and column number
// Column = (totalrows-currentrow)+1
}