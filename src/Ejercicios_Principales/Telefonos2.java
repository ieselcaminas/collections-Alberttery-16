package Ejercicios_Principales;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Telefonos2 {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> map = new HashMap<>();
        ArrayList<String> lista = new ArrayList<>();
        lista.add("1111");
        lista.add("2222");
        map.put("A", lista);
        lista = new ArrayList<>();
        lista.add("3333");
        lista.add("4444");
        map.put("B", lista);
        lista = new ArrayList<>();
        lista.add("5555");
        lista.add("6666");
        map.put("C", lista);

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un contacto:");
        String contacto = sc.nextLine();

        if (map.containsKey(contacto))
            System.out.println("Sus numeros de telefono son: " + map.get(contacto));
    }
}
