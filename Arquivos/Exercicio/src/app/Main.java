package app;

import entities.Product;
import services.ProductService;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File source = new File(sc.nextLine());

        try(BufferedReader br = new BufferedReader(new FileReader(source))){
            String line = br.readLine();
            List<Product> products = new ArrayList<>();

            while(line != null){
                String[] product = line.split(",");
                String name = product[0];
                double unitPrice = Double.parseDouble(product[1]);
                int quantity = Integer.parseInt(product[2]);

                products.add(new Product(name, unitPrice, quantity));
                line = br.readLine();
            }

            String summaryPath = source.getParent();

            ProductService.summary(products, summaryPath);

        } catch (IOException e){
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();
    }
}
