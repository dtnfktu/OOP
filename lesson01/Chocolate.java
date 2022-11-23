package lesson01;

public class Chocolate extends Product {
    private Double calories = 0.0;      // калории
    private String color = "black";     // цвет или, скорее, тип шоколада - черный, молочный, с орехом...

    // конструктор с учётом новых свойств
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
    
    // переопределение метода
    @Override
    public String toString() {
        return String.format("%s %,.2f %.2f %s", this.getName(), this.getPrice(), getCalories(),getColor());
    }
}
