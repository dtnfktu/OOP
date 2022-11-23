package lesson01;

public class ChocolatePaste extends Chocolate {
    private Double weight = 0.0;                // вес нетто в граммах

    public ChocolatePaste(String name, Double price, Double calories, String color, Double weight){
        super(name,price,calories,color);
        this.weight = weight;
    }

    public Double getWeight(){
        return weight;
    }

    @Override
    public String toString() {
        return String.format("%s %,.2f руб. %.2f kCal %s %.2fg", this.getName(), this.getPrice(), getCalories(),getColor(),getWeight());
    }    

}
