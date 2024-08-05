package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\temp\\in.txt"))){
            Map<String, Integer> candidates = new HashMap<>();
            String line = br.readLine();
            while(line != null){
                String[] vect = line.split(",");
                if(candidates.containsKey(vect[0])){
                    candidates.put(vect[0], candidates.get(vect[0]) + Integer.parseInt(vect[1]));
                } else {
                    candidates.put(vect[0], Integer.parseInt(vect[1]));
                }
                line = br.readLine();
            }

            for (String candidate : candidates.keySet()){
                System.out.println(candidate + ": " + candidates.get(candidate));
            }

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
