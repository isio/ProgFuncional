package Modulo_16;

import java.util.function.BiFunction;

public class BiFunction_1 {
    public static void main(String[] args) {

        BiFunction<String, String, String> bi = (x, y) -> x + y;

        System.out.println(bi.apply("Israel ", "Cid"));
    }
}
