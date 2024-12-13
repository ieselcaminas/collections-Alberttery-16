import java.util.Stack;

public class ExpresionesAritmeticas {
    public static boolean esNumero(String cadena) {
        return Character.isDigit(cadena.charAt(0));
    }
    public static int calcular(String expresion) {
        String terminos[] = expresion.split(" ");
        Integer numero;
        Integer n1;
        Integer n2;
        Integer resultado = 0;
        Stack<Integer> pila = new Stack<>();

        for (int i = 0; i < terminos.length; i++) {
            if (esNumero(terminos[i])) {
                numero = Integer.parseInt(" " + terminos[i]);
                pila.push(numero);
            }else{
                n1 = pila.pop();
                n2 = pila.pop();
                if (terminos[i].equals("+")) {
                    resultado = resultado + n1 + n2;
                }
            }
        }
        for (int i = 0; i < terminos.length; i++) {
            if (esNumero(terminos[i])) {
                numero = Integer.parseInt(" " + terminos[i]);
                pila.push(numero);
            }else{
                n1 = pila.pop();
                n2 = pila.pop();
                if (terminos[i].equals("-")) {
                    resultado = resultado + n1 - n2;
                }
            }
        }
        for (int i = 0; i < terminos.length; i++) {
            if (esNumero(terminos[i])) {
                numero = Integer.parseInt(" " + terminos[i]);
                pila.push(numero);
            }else{
                n1 = pila.pop();
                n2 = pila.pop();
                if (terminos[i].equals("*")) {
                    resultado = resultado + n1 * n2;
                }
            }
        }
        for (int i = 0; i < terminos.length; i++) {
            if (esNumero(terminos[i])) {
                numero = Integer.parseInt(" " + terminos[i]);
                pila.push(numero);
            }else{
                n1 = pila.pop();
                n2 = pila.pop();
                if (terminos[i].equals("/")) {
                    resultado = resultado + n1 / n2;
                }
            }
        }
        return resultado;
    }
    public static void main(String[] args) {
        System.out.println(esNumero("1 2 3"));

    }
}
