package Modulo_30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MethodoReferenciadoConstructor {
    public static void main(String[] args) {
        List<String> numeros = Arrays.asList("10", "10", "15", "15", "25", "30", "40", "6", "30");

        /*List<Integer> resultado = getResultados(numeros, numEnString -> new Integer(numEnString));
        for (Integer numerosInteger: resultado) {
            System.out.println("numerosInteger * 10 = " + numerosInteger * 10);
        }*/

        // Lo mismo pero más barato.
        // getResultados(numeros, Integer::new).forEach(num -> System.out.println("num = " + num * 2));
        // getResultados(numeros, Integer::new).forEach(num -> MethodoReferenciadoConstructor.multiplicarPor10(num));
        getResultados(numeros, Integer::new).forEach(MethodoReferenciadoConstructor::multiplicarPor10);
    }

    public static List<Integer> getResultados(List<String> datos, Function<String, Integer> func) {

        List<Integer> resultados = new ArrayList<>();
        datos.forEach(strNum -> resultados.add(func.apply(strNum)));

        return resultados;
    }

    public static void multiplicarPor10(int numero) {
        System.out.println("El nuevo valor del dato " + numero + " es : \t " + numero * 10);
    }

}
