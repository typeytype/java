package com.company;


class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford => startEngine()";
    }

    @Override
    public String accelerate() {
        return "Ford => accelerate()";
    }

    @Override
    public String brake() {
        return "Ford => brake()";
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
