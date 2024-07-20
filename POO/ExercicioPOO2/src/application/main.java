package application;

import entities.Employee;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();
        employee.name = "João Silva";
        employee.grossSalary = 6000.00;
        employee.tax = 1000.00;

        System.out.println("Employee: " + employee);
        System.out.println();

        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println();
        System.out.println("Updated Data: " + employee);



    }
}
