package app;

import model.entities.Contract;
import model.entities.Installments;
import model.services.ContractService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContractService service = new ContractService();

        System.out.println("Entre com os dados do contrato");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Data: ");
        LocalDate date = LocalDate.parse(sc.nextLine(),DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.print("Valor do contrato: ");
        double value = sc.nextDouble();
        sc.nextLine();
        System.out.print("Entre com o número de parcelas: ");
        int months = sc.nextInt();

        Contract contract = new Contract(number, date, value);
        service.processContract(contract, months);

        System.out.println();
        System.out.println("Parcelas:");
        for (Installments i : contract.getInstallments()){
            System.out.println(i);
        }


    }
}
