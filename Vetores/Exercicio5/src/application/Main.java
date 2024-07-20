package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números vão ser digitados? ");
        int n = sc.nextInt();
        double[] v = new double[n];

        for (int i = 0; i < v.length; i++){
            System.out.print("Digite um numero: ");
            v[i] = sc.nextDouble();
        }

        double maior = v[0];
        int pos = 0;

        for(int i = 0; i<v.length ; i++){
            if(v[i] > maior){
                maior = v[i];
                pos = i;
            }
        }

        System.out.print("\nMaior Valor: " + maior);
        System.out.println("\nPosição do maior valor: " + pos);

    }
}
