package Flujos;

import java.util.ArrayList;
import java.util.List;

public class StatisticsStreams {
    public static void main(String[] args) {
        List<String> numeros = new ArrayList<>();

        numeros.add("1");
        numeros.add("2");
        numeros.add("3");
        numeros.add("4");
        numeros.add("5");
        numeros.add("6");

        long cuantos = numeros.stream()
                .mapToInt(s-> Integer.valueOf(s))
                .filter(n -> n % 3 == 0 && n - 3 != 0)
                .count();

        double media = numeros.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();

        System.out.printf("Hay %d números múltiplos de 3 y la media es %f%n", cuantos, media );

        numeros.stream().map(s->Integer.valueOf(s)).
                filter(n -> n % 3 == 0 && n - 3 != 0).
                forEach(value -> System.out.println("Num: " + value));

    }
}