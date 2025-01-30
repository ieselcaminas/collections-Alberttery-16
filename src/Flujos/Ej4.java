package Flujos;

import java.util.ArrayList;
import java.util.List;

public class Ej4 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(-2);
        numeros.add(3);
        numeros.add(-4);
        numeros.add(5);
        numeros.add(-6);
        numeros.add(7);

        numeros.stream()
                .filter(n -> n >= 1 && n <= 5)
                .forEach(System.out::println);
    }
}
