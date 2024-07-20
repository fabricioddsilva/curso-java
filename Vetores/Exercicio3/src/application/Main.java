package application;

import entities.People;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hSum = 0;
        int aSum = 0;

        String[] underAge;
        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        People[] vect = new People[n];

        for (int i = 0; i < vect.length; i++){
            System.out.println("Dados da " + (i+1) + "a pessoa: ");
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            vect[i] = new People(nome, idade, altura);
            hSum += vect[i].getHeight();

            if (vect[i].getAge() < 16) {
                aSum++;
            }
        }

        System.out.printf("Altura Média: %.2f", hSum/ vect.length);
        System.out.printf("\nPessoas com menos de 16 anos: %.2f%% ", (double)(aSum*100)/ vect.length);

        for (People people : vect){
            if(people.getAge() < 16){
                System.out.println("\n" + people.getName());
            }
        }


    }
}
