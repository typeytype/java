package com.company;

public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.carpet = carpet;
        this.floor = floor;
    }
    public double getTotalCost() {
        double totalcost = carpet.getCost()*floor.getArea();
        System.out.println(totalcost);
        return totalcost;
    }
}
