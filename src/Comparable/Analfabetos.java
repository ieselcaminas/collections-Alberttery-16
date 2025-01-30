package Comparable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Analfabetos {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("illiterate.csv"));

        String line;

        /*

        while ((line = reader.readLine()) != null) {
            String[] split = line.split(",");
            String pais = split[0].trim();
            int cantidad = Integer.parseInt(split[0].trim());
            Analfabetos a = new Analfabetos(pais, cantidad);
            lista.add(a);
        }

        for (Analfabetos a : lista){
            System.out.println(a);
        }
        reader.close();

        */
    }
}
