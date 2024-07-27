package app;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();


        List<TaxPayer> payers = new ArrayList<>();

        for (int i = 0; i < n; i++){
            sc.nextLine();
            System.out.println("Tax payer #" + (i+1) + " data:");
            System.out.print("Individual or Company (i/c)? ");
            char option = sc.nextLine().charAt(0);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double income = sc.nextDouble();

            if(option == 'i'){
                System.out.print("Health expenditures: ");
                double expenditures = sc.nextDouble();
                payers.add(new Individual(name, income, expenditures));
            } else {
                System.out.print("Number of employees: ");
                int employees = sc.nextInt();
                payers.add(new Company(name, income, employees));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");
        double sum = 0;
        for(TaxPayer t: payers){
            System.out.println(t.getName() + ": $ " + String.format("%.2f", t.tax()));
            sum += t.tax();
        }
        System.out.println();
        System.out.printf("TOTAL TAXES: $ %.2f%n", sum);
    }
}
