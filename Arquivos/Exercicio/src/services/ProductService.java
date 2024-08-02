package services;

import entities.Product;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ProductService {
    public static void summary(List<Product> products, String path){

        boolean mkdir = new File(path + "\\out").mkdir();

        String summary = path + "\\out\\summary.csv";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(summary))){
            for (Product product : products){
                bw.write(product.toString());
                bw.newLine();
            }
        } catch (IOException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
