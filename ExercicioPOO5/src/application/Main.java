package application;

import entities.Account;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char answer = sc.next().charAt(0);

        if (answer == 'y'){
           System.out.print("Enter initial deposit value: ");
            double value = sc.nextDouble();
            account = new Account(number, holder, value);
        } else {
            account = new Account(number, holder);
        }
        System.out.println();
        System.out.println("Account Data: \n" + account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double value = sc.nextDouble();
        account.deposit(value);
        System.out.println("Updated Account Data: \n" + account);
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        value = sc.nextDouble();
        account.withdraw(value);
        System.out.println("Updated Account Data: \n" + account);




    }
}
