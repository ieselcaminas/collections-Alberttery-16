package Ejercicios_Principales;

import java.util.ArrayList;
import java.util.Collections;

public class Ejemplo {
    public static void main(String[] args) {
        ArrayList<String> coches = new ArrayList<String>();
        coches.add("1");     //i=0
        coches.add("2");     //i=1
        coches.add("3");     //i=2
        int media = 0;

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        /*

        for (int i = 0; i < coches.size(); i++) {
            media += numeros.get(i);
        }
        System.out.println(media);

         */

        for (int i = 0; i < coches.size(); i++) {
            media = media + Integer.parseInt(coches.get(i));
        }

        System.out.println(media);

        Collections.sort(numeros);  //ordenar numeros

        /*

        System.out.println(coches);
        System.out.println(coches.get(0));

        for (int i = 0; i < coches.size(); i++) {
            System.out.println(coches.get(i));
        }

        coches.remove("Audi");
        System.out.println(coches);

        if (coches.isEmpty()) {
            System.out.println("El array esta vacio :(");
        }

        */

    }
}
