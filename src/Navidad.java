import java.util.HashMap;
import java.util.Map;

public class Navidad {
    public static void main(String[] args) {
        System.out.println(numFinal(new String[]{"12345","12344","12345","12343"}));

    }
    public static Map<Character, Integer> numFinal(String[] boletos){
        Map<Character, Integer> numFinal = new HashMap<>();
        Character ultimo;
        Integer contador;

        for (String boleto : boletos){
            ultimo = boleto.charAt(boleto.length() - 1);
            contador = numFinal.get(ultimo);

            if (contador == null){
                numFinal.put(ultimo, 1);
            } else {
                numFinal.put(ultimo, contador + 1);
            }
        }

        return numFinal;
    }
}
