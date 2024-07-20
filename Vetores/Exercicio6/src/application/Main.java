package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos número vão ter cada vetor? ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < b.length; i++){
            b[i] = sc.nextInt();
        }

        System.out.println("Vetor resultante:");
        for (int i = 0; i < c.length; i++){
            c[i] = a[i] + b[i];
            System.out.println(c[i]);
        }
    }
}
