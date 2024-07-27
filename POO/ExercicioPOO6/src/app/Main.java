package app;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees? ");
        int n = sc.nextInt();
        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < n; i++){
            System.out.println("Employee #" + (i+1) + " data:");
            System.out.print("Outsourced (y/n)? ");
            char option = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if(option == 'y'){
                System.out.print("Additional charge: ");
                double charge = sc.nextDouble();
                employees.add(new OutsourcedEmployee(name, hours, valuePerHour, charge));
            } else {
                employees.add(new Employee(name, hours, valuePerHour));
            }

        }
        System.out.println("PAYMENTS:");
        for (Employee e : employees){
            System.out.println(e.getName() + " - $ " + String.format("%.2f", e.payment()));
        }
    }
}