package app;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        List<Product> products = new ArrayList<>();

        for (int i = 0; i < n; i++){
            System.out.println("Product #" + (i+1) + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char option = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            if(option == 'u'){
                sc.nextLine();
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String date = sc.nextLine();
                products.add(new UsedProduct(name, price, LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"))));

            } else if (option == 'i'){
                System.out.print("Customs fee: ");
                double fee = sc.nextDouble();
                products.add(new ImportedProduct(name, price, fee));

            } else {
                products.add(new Product(name, price));
            }
        }
        System.out.println("PRICE TAGS:");
        for (Product p : products){
            System.out.println(p.priceTag());
        }

    }
}
