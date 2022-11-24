package lesson02;

public class Fish extends Animal implements SwimAble {
    private Integer velocity;

    public Fish(String name, String breed, String colour, Integer age, Integer velocity) {
        super(name, breed, colour, age);
        this.velocity = velocity;
    }

    @Override
    public String swim() {
        return breed + " - " + velocity + " км/ч";
    }

}