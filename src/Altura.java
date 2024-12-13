import java.util.ArrayList;
import java.util.Scanner;

public class Altura {
    public static void main(String[] args) {
        System.out.println("Introduce el numero de alumnos: ");
        int numAlumnos = numeroAlumnos();
        double media;
        int alumnosAlturaSuperior;
        int alumnosAlturaInferior;
        ArrayList<Double> alturas = new ArrayList<>();

        alturas = leerAlturas(alturas, numAlumnos);
        System.out.print(numeroAlumnos());

        media = calcularMedia(alturas, numAlumnos);
        System.out.println("La media es: " + media);

        alumnosAlturaSuperior = calcularAlumnosAlturaSuperior(alturas, numAlumnos);
        alumnosAlturaInferior = calcularAlumnosAlturaInferior(alturas, numAlumnos);

        System.out.println("Hay " + alumnosAlturaSuperior + " alumnos de superior altura a la media");
        System.out.println("Hay " + alumnosAlturaInferior + " alumnos de inferior altura a la media");

    }
    public static int numeroAlumnos () {
        Scanner entrada = new Scanner(System.in);

        return entrada.nextInt();

    }
    public static ArrayList<Double> leerAlturas(ArrayList<Double> alturas, int numAlumnos ) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numAlumnos; i++) {
            System.out.println("Dime la altura (en cm): ");
            alturas.add(sc.nextDouble());
        }
        return alturas;
    }
    public static double calcularMedia (ArrayList<Double> alturas, int numAlumnos) {
        double media = 0;

        for (int i = 0; i < numAlumnos; i++) {
            media += alturas.get(i);
        }
        return media / numAlumnos;
    }
    public static int calcularAlumnosAlturaSuperior (ArrayList<Double> alturas, double media) {
        int contador = 0;

        for (int i = 0; i < alturas.get(i); i++) {
            if (media > alturas.get(i)) {
                contador++;
            }
        }
        return contador;
    }
    public static int calcularAlumnosAlturaInferior (ArrayList<Double> alturas, double media) {
        int contador = 0;

        for (int i = 0; i < alturas.get(i); i++) {
            if (media < alturas.get(i)) {
                contador++;
            }
        }
        return contador;
    }
    public static void mostrarResultados (ArrayList<Integer> alturas, int alumnosAlturaSuperior, int alumnosAlturaInferior, double media) {
        System.out.println("Hay " + alumnosAlturaSuperior + "con una altura mayor a la media.");
        System.out.println("Hay " + alumnosAlturaInferior + "con una altura menor a la media.");
        System.out.println("La media de altura de la clase es de " + media);

    }
}
