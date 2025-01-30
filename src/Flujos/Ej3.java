package Flujos;

import java.util.ArrayList;
import java.util.List;

public class Ej3 {
    public static void main(String[] args) {
        List<Person> personas = new ArrayList<>();
        Person p = new Person("Ana", "Boueles", 1969);
        personas.add(p);
        Person p2 = new Person("Aimi", "Arma", 1975);
        personas.add(p2);
        Person p3 = new Person("Tocan", "Donabos", 1967);
        personas.add(p3);
        Person p4 = new Person("Dioni", "Calbo", 1965);
        personas.add(p4);

        personas.stream()
                .map(person -> person.getLastName())
                .distinct()
                .sorted()
                .forEach(apellido -> System.out.println(apellido));

        System.out.println(personas);
    }
}
