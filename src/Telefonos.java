import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Telefonos {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Mama", "624253424");
        map.put("Papa", "666666666");
        map.put("Brothie", "634570359");
        map.put("Jesucristo", "642783737");
        map.put("Miau", "616616616");

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un contacto: ");
        String contacto = sc.nextLine();

        if (map.containsKey(contacto))
            System.out.println("El contacto es: " + map.get(contacto));
    }
}
