import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Coche {
    public static void main(String[] args) {
        ArrayList<String> coches = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String coche;

        do {
            System.out.print("Enter coche name: ");
            coche = sc.nextLine();
            coches.add(coche);
        } while (!coche.isEmpty());

        Collections.sort(coches) ;
        for (int i = 0; i < coches.size(); i++) {
            System.out.println(coches.get(i));
        }
    }
}
