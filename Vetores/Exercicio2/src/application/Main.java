package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        double sum = 0;
        System.out.print("Valores: ");
        for (int i = 0; i<vect.length; i++){
            System.out.printf("%.1f  ",vect[i]);
            sum+= vect[i];
        }
        System.out.println();

        System.out.printf("Soma: %.2f", sum);
        System.out.println();

        System.out.printf("Média: %.2f", sum/vect.length);

        sc.close();

    }
}
