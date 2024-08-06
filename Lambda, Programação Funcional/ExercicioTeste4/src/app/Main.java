package app;

import entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("c:\\temp\\in.txt"))){
            String line = br.readLine();
            List<Product> products = new ArrayList<>();
            while(line != null){
                String[] vet = line.split(",");
                products.add(new Product(vet[0], Double.parseDouble(vet[1])));
                line = br.readLine();
            }

            double avg = products.stream()
                    .map(Product::getPrice)
                    .reduce(0.0 , Double::sum) / products.size();

            Comparator<String> comp = Comparator.comparing(String::toUpperCase);

            List<String> names = products.stream()
                    .filter(p -> p.getPrice() < avg)
                    .map(Product::getName)
                    .sorted(comp.reversed())
                    .toList();

            System.out.printf("Preço médio: %.2f%n", avg);
            names.forEach(System.out::println);

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
