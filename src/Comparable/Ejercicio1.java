package Comparable;

import Flujos.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] numeros = new int[]{2, 5, 1, 4};

        Arrays.sort(numeros);
        Arrays.stream(numeros).forEach(System.out::println);

        List<Person> personas = new ArrayList<>();
        Person p = new Person("Eyooou", "Gangsta", 1111);
        personas.add(p);
        p = new Person("Tuma", "Macita", 2222);
        personas.add(p);

        personas.stream()
                .sorted()
                .forEach(System.out::println);
    }

}