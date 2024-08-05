package app;

import entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

            List<Product> list = new ArrayList<>();

            list.add(new Product("TV", 900.00));
            list.add(new Product("Mouse", 50.00));
            list.add(new Product("Tablet", 350.00));
            list.add(new Product("HD case", 80.90));

            list.removeIf(x -> x.getPrice() >= 100);
            

            for (Product p : list) {
                System.out.println(p);
            }
    }
}
