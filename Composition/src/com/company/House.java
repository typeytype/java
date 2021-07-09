package com.company;

public class House {
    private int rooms;
    private int ftWidth;
    private int ftLength;
    private int floors;


    public House(int rooms, int ftWidth, int ftLength, int floors) {
        this.rooms = rooms;
        this.ftWidth = ftWidth;
        this.ftLength = ftLength;
        this.floors = floors;
    }

    public int getRooms() {
        return rooms;
    }

    public int getFtWidth() {
        return ftWidth;
    }

    public int getFtLength() {
        return ftLength;
    }

    public int getFloors() {
        return floors;
    }
}
