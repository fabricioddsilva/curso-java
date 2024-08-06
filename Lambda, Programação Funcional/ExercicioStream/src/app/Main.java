package app;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o caminho do arquivo: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            List<Employee> list = new ArrayList<>();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            System.out.print("Email das pessoas cujo salario é maior que: ");
            double value = sc.nextDouble();
            sc.nextLine();

            Comparator<String> comp = String::compareTo;

            List<String> emails = list.stream()
                    .filter(e -> e.getSalary() > value)
                    .map(Employee::getEmail)
                    .sorted(comp)
                    .toList();

            double sum = list.stream()
                    .filter(e -> e.getName().toUpperCase().charAt(0) == 'M')
                    .map(Employee::getSalary)
                    .reduce(0.0, Double::sum);

            emails.forEach(System.out::println);
            System.out.printf("Soma dos salários das pessoas cujo nome começa com a letra 'M': %.2f%n", sum);



        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        sc.close();
    }
}
