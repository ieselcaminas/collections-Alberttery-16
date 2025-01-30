package Ejercicios_Principales;

import java.util.HashMap;
import java.util.Map;

public class Botin {
    public static Map<Integer, String> particion(int numLadrones, String[] billetes){
        Map<Integer, String> particion = new HashMap<>();
        int leTocaA;
        String billete;
        String botin;

        for (int i = 0; i < billetes.length; i++) {
            billete = billetes[i];
            leTocaA = i % numLadrones;
            botin = particion.get(leTocaA);
            if (botin == null){
                particion.put(leTocaA, billete);
            } else {
                particion.put(leTocaA, botin + " " + billete);
            }
        }
        return particion;

    }
    public static void main(String[] args) {
       Map<Integer, String> reparto = particion(3, new String[]{"1","2","3","4","5","6","7","8","9"});
       System.out.println(reparto.toString());
    }
}