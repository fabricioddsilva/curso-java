package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quanto números você vai digitar? ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for(int i = 0; i < vect.length; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        int sum = 0;
        System.out.println("Numeros Pares: ");
        for (int j : vect) {
            if (j % 2 == 0) {
                System.out.print(j + "  ");
                sum++;
            }
        }
        System.out.println("\nQuantidade de Pares: " + sum);
    }
 }
