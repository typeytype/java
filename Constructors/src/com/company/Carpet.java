package com.company;

public class Carpet {

        private double cost;

        public Carpet(double cost) {
            this.cost = cost;
            if (this.cost < 0) {
                this.cost = 0;
            }
            System.out.println("Carpet cost called.");
        }

        public double getCost() {
            return cost;
        }

        public void setCost(double cost) {
            this.cost = cost;
            if (this.cost < 0) {
                this.cost = 0;
            }
        }
    }
