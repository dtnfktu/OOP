package lesson02;

public class Turtle extends Animal implements SwimAble,RunAble {
    private Integer velocity;

    public Turtle(String name, String breed, String colour, Integer age, Integer countLegs, Integer velocity) {
        super(name, breed, colour, countLegs, age);
        this.velocity = velocity;
    }

    @Override
    public String run() {
        return "10 km/h";
    }

    @Override
    public String swim() {
        return breed + " - " + velocity + " км/ч";
    }

}