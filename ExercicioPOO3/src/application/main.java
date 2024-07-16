package application;

import entities.Student;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.print("Student Name: ");
        student.name = sc.nextLine();
        System.out.println("Grades:");
        student.first = sc.nextDouble();
        student.second = sc.nextDouble();
        student.third = sc.nextDouble();

        System.out.println(student);
    }
}
