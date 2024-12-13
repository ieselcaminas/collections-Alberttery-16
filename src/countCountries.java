import java.io.*;
import java.util.*;

public class countCountries {
    public static Map<String, Integer> countCountries() throws IOException {
        Map<String, Integer> map = new HashMap<>();

        BufferedReader reader = new BufferedReader(new FileReader("Colfuturo-Seleccionados.csv"));
        String line;
        String[] campos;
        String pais;
        Integer cuantos;


        while ((line = reader.readLine())!=null) {
            campos = line.split(",");
            pais = campos[6];
            cuantos = map.get(pais);

            if (pais == null)
                map.put(pais, 1);
            else
                map.put(pais, cuantos + 1);
        }
        reader.close();
        return map;
    }
    public static void main(String[] args) throws IOException {
        Map<String, Integer> map = countCountries();

        Scanner sc = new Scanner(System.in);
        System.out.println("nombre del pais: ");
        String pais = sc.nextLine(    );

        int cuantos = map.get(pais);
        System.out.println("Hay " + cuantos + " alumnos");

    }
}
