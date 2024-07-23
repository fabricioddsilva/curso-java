package application;

import entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos funcionarios serão registrados? ");
        int n = sc.nextInt();
        List<Funcionario> funcionarios = new ArrayList<>();

        for (int i = 0; i < n; i++){
            System.out.println("Funcionario #" + (i+1) + ":");
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Salario: ");
            double salario = sc.nextDouble();

            funcionarios.add(new Funcionario(id, nome, salario));

        }

        System.out.print("Insira o id do funcionario que tera seu salario aumentado: ");
        int id = sc.nextInt();
        Funcionario f = funcionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if(f == null){
            System.out.println("Id não encontrado...");
        } else{
            System.out.print("Insira a porcentagem: ");
            double porcentagem = sc.nextDouble();
            f.salaryIncrease(porcentagem);
        }

        for(Funcionario func : funcionarios){
            System.out.println(func);
        }








    }
}
