package com.company;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.50);
        hamburger.addHamburgerAddition2("Gherkin", 2.50);
        hamburger.addHamburgerAddition3("Ketchup", 4.50);
        hamburger.addHamburgerAddition4("Cucumber", 0.50);
        System.out.println("Total burger price is "+hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Greasy meatballs", 4.20);
        healthyBurger.itemizeHamburger();
        System.out.println("Total price of the Healthy option is "+healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.itemizeHamburger();
        db.addHamburgerAddition1("Lettuce", 0.50);
    }
}
