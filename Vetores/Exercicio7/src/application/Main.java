package application;

import entities.Aluguel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluguel[] aluguel = new Aluguel[10];

        System.out.print("Quantos quartos vão ser alugados? ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Aluguel #" + (i+1) + ":");
            System.out.print("Nome: ");
            String nome = sc.next();
            sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            sc.nextLine();
            System.out.print("Quarto: ");
            int quarto = sc.nextInt();
            aluguel[quarto] = new Aluguel(nome, email, quarto);
            System.out.println();
        }

        System.out.println("Quartos Ocupados: ");
        for (Aluguel quartos : aluguel){
            if(quartos != null){
                System.out.println(quartos.getQuarto() + ": " + quartos.getNome() + ", " + quartos.getEmail());
            }
        }
    }
}
