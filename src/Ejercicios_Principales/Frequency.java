package Ejercicios_Principales;

import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {
        System.out.println(repetido(new String[]{"uno","dos","dos","tres"}));
    }
    public static Map<String, Integer> repetido(String[] palabras){
        Map<String, Integer> repetido = new HashMap<>();
        Integer contador;

        for (String palabra : palabras){
            contador = repetido.get(palabra);

            if (contador == null){
                repetido.put(palabra, 1);
            } else {
                repetido.put(palabra, contador + 1);
            }
        }
        return repetido;
    }
}
