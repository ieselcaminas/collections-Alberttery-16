package Ejercicios_Principales;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PaisCapital {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Alemania", "Berlin");
        map.put("Rumania","Bucarest");
        map.put("France", "Paris");
        map.put("España", "Madrid");
        map.put("Italia", "Roma");
        map.put("Inglaterra", "Londres");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre de un país europeo: ");
        String pais = scanner.nextLine();

        if (map.containsKey(pais)) {
            System.out.println("La capital de " + pais + " es " + map.get(pais) + ".");
        } else {
            System.out.println("El pais introducido no está en la lista o no es válido.");
        }

        scanner.close();
    }
}
