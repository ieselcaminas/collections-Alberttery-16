package RefuerzoII;

public class Ejercicio3 {
    public static void main(String[] args) {
        String numero = "2345";
        System.out.println(suma(numero));
    }
    public static String suma(String numero){
        int suma = 0;
        String res = "";

        for (int i = 0; i < numero.length(); i++) {
            suma += Integer.parseInt("" + numero.charAt(i));
            if (i < numero.length() - 1)
                res += numero.charAt(i) + " + ";
            else
                res += numero.charAt(i) + " = " + suma;
        }

        return res;
    }
}
