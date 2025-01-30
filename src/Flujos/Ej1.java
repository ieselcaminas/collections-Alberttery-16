package Flujos;

import java.util.ArrayList;
import java.util.List;

public class Ej1 {
    public static void main(String[] args) {
        List<Person> personas = new ArrayList<>();
        Person p = new Person("Francisco", "Franco", 1975);
        personas.add(p);
        Person p2 = new Person("Ana", "Boueles", 1969);
        personas.add(p2);
        Person p3 = new Person("Tocan", "Donabos", 1967);
        personas.add(p3);

        long cuantas = personas.stream()
                .filter(persona -> persona.getBirthYear() < 1970)
                .count();

        System.out.println("Hay " + cuantas + " personas que nacieron antes de 1970");
    }
}
