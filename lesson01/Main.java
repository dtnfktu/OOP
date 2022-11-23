package lesson01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Chocolate("Алёнка", 75.0, 550.0, "Молочный"));
        products.add(new Chocolate("AlpenGold", 54.99, 570.0, "Чёрный"));
        products.add(new Product("Чипсы", 60.0));
        products.add(new Product("Масло", 50.0));
        products.add(new Product("Хлеб", 40.0));
        products.add(new Product("Снек", 20.0));
        products.add(new ChocolatePaste("Nutella", 349.0, 541.0, "Фундук", 0.450));
        VendingMachine v1 = new VendingMachine(products);
        System.out.println(v1);
        System.out.println(v1.getProductBy("Масло"));
        System.out.println(v1.getProductBy("Алёнка"));
        System.out.println(v1.getProductBy(54.99));
        System.out.println(v1.getProductBy("Nutella"));
    }
}