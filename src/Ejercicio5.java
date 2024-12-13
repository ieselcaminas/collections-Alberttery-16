import java.util.Arrays;

public class Ejercicio5 {
    public static double mediana(int [] numeros) {
        double mediana;
        Arrays.sort(numeros);
        if(numeros.length % 2 == 0){
            double a = numeros[numeros.length/2];
            double b = numeros[numeros.length/2+1];
            mediana = (a+b)/2;
        }else{
            mediana = numeros[numeros.length/2];
        }
        return mediana;

    }
    public static void main(String[] args){
        int[] numeros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        System.out.println(mediana(numeros));

    }
}
