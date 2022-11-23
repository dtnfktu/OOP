package lesson01;

public class Chocolate extends Product {
    private Double calories = 0.0;
    private String color = "black";

    public Chocolate(String name) {
        super(name);
    }

    public Chocolate(String name, Double price, Double calories, String color){
        super(name, price);
        this.calories = calories;
        this.color = color;
    }

    public Double getCalories(){
        return calories;
    }

    public String getColor(){
        return color;
    }
    
    @Override
    public String toString() {
        return String.format("%s %,.2f %.2f %s", this.getName(), this.getPrice(), getCalories(),getColor());
    }
}
