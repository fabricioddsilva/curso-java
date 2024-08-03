package app;

import entities.AcessLog;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o caminho do arquivo: ");
        File file = new File(sc.nextLine());

        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            Set<AcessLog> set = new HashSet<>();
            String line = br.readLine();
            while(line != null){
                String[] data = line.split(" ");
                set.add(new AcessLog(data[0], Instant.parse(data[1])));
                line = br.readLine();
            }

            System.out.println(set.size());


        }catch (IOException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
