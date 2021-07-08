package com.company;

public class Point {

    private int x;
    private int y;

    public Point(){
        System.out.println("Empty constructor called.");
    }

    public Point(int x, int y){
        System.out.println("Points called.");
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public double distance() {
        double distance = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        System.out.println(distance);
        return distance;
    }

    public double distance(int a, int b) {
        double distance = Math.sqrt(Math.pow((x-a),2) + Math.pow((y-b),2));
        System.out.println(distance);
        return distance;
    }


    public double distance(Point p) {
        double distance = Math.sqrt(Math.pow((x-p.x),2) + Math.pow((y-p.y),2));
        System.out.println(distance);
        return distance;
    }
}
