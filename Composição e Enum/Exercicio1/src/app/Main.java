package app;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter department's name: ");
        Department department = new Department(sc.nextLine());
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Level: ");
        String level = sc.nextLine();
        System.out.print("Base salary: ");
        double salary = sc.nextDouble();
        System.out.println();
        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();

        Worker worker = new Worker(name, WorkerLevel.valueOf(level), salary, department);

        for (int i = 0; i < n; i++){
            System.out.println("Enter contract #" + (i+1) + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            sc.nextLine();
            System.out.print("Value per hour: ");
            double value = sc.nextDouble();
            sc.nextLine();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            sc.nextLine();
            HourContract contract = new HourContract(date, value, hours);
            worker.addContract(contract);
        }

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String date = sc.nextLine();
        int month = Integer.parseInt(date.substring(0, 2));
        int year = Integer.parseInt(date.substring(3));

        System.out.println(
                "Name: " + worker.getName() +
                "\nDepartment: " + worker.getDepartment() +
                "\nIncome of " + date + ": " + worker.income(year, month));
    }




}
