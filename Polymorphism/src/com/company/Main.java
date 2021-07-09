package com.company;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = engine;
        this.name = name;
        this.wheels = 4;
        this.cylinders = cylinders;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public String startEngine() {
        return "Car => startEngine()";
    }

    public String accelerate(){
        return "Car => accelerate()";
    }

    public String brake(){
        return "Car => brake()";
    }
}





class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi => startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi => accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi => brake()";
    }
}



public class Main {

    public static void main(String[] args) {
Car car = new Car(8, "Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRW 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(6, "Fiesta Zetec FF");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
    }
}


//package com.company;
//
//class Movie {
//    private String name;
//
//    public Movie(String name) {
//        this.name = name;
//    }
//
//    public String plot(){
//        return "No plot here";
//    }
//
//    public String getName() {
//        return name;
//    }
//}
//
//class Jaws extends Movie{
//    public Jaws(){
//        super("Jaws");
//    }
//
//    public String plot(){
//        return "Giant shark attacks coastal town.";
//    }
//}
//
//class IndependenceDay extends Movie {
//    public IndependenceDay() {
//        super("Independence Day");
//    }
//
//    @Override
//    public String plot() {
//        return "Aliens attempt to take over planet Earth.";
//    }
//}
//
//class MazeRunner extends Movie {
//    public MazeRunner() {
//        super("Maze Runner");
//    }
//
//    @Override
//    public String plot() {
//        return "Young adults try to escape a maze.";
//    }
//}
//
//class StarWars extends Movie {
//    public StarWars() {
//        super("Star Wars");
//    }
//
//    @Override
//    public String plot() {
//        return "Imperial forces attempt to conquest the known universe.";
//    }
//}
//
//class Forgettable extends Movie {
//    public Forgettable() {
//        super("Forgettable");
//    }
//
//    // No plot method.
//}
//
//
//
//
//public class Main {
//
//    public static void main(String[] args) {
//    for(int i=1;i<11;i++){
//    Movie movie = randomMovie();
//            System.out.println("Movie #" + i + " : " + movie.getName() + "\n" +"Plot: " + movie.plot() + "\n");
//        }
//    }
//
//    public static Movie randomMovie(){
//        int randomNumber = (int) (Math.random() * 5) + 1;
//        System.out.println("Random generation: "+ randomNumber);
//        switch(randomNumber) {
//            case 1:
//                return new Jaws();
//
//            case 2:
//                return new IndependenceDay();
//
//            case 3:
//                return new MazeRunner();
//
//            case 4:
//                return new StarWars();
//
//            case 5:
//                return new Forgettable();
//
//        }
//        return null;
//
//    }
//
//
//
//
