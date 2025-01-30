package RefuerzoII;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println(moda(new int[]{1, 1, 1, 2, 2, 3, 4, 5}));
    }
    public static int moda(int[] numeros){
        Map<Integer, Integer> map = new HashMap<>();
        Integer veces;
        int clave;
        int maximo = 0;
        int moda = 0;


        for (int i = 0; i < numeros.length; i++) {
            veces = map.get(numeros[i]);
            if (veces == null) {
                map.put(numeros[i], 1);
            } else {
                map.put(numeros[i], veces + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            clave = entry.getKey();
            veces = entry.getValue();
            if (veces > maximo) {
                maximo = veces;
                moda = clave;
            }
        }

        return moda;

        /*
        map.put(numeros[i], getValuerOrDefault(numeros[i],1) + 1;
         */
    }
}
