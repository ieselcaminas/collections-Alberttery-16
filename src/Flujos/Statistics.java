package Flujos;

import java.util.ArrayList;
import java.util.List;
public class Statistics{
    public static void main(String[] args) {
        List<String> numeros = new ArrayList<>();
        int n;
        int suma = 0;
        int cuantos = 0;
        numeros.add("0");
        numeros.add("1");
        numeros.add("2");
        numeros.add("3");
        numeros.add("4");
        numeros.add("5");
        numeros.add("6");
        numeros.add("7");
        numeros.add("8");
        numeros.add("9");
        numeros.add("10");

        for(String numero : numeros){
            n = Integer.parseInt(numero);
            suma += n;
            if (n % 3 == 0) {
                cuantos++;
            }
            if (n == 0) {
                cuantos--;
            }
        }
        System.out.printf("Hay %d números múltiplos de 3 y la media es %f%n", cuantos, (float)suma/(float)numeros.size());

    }
}