package Modulo_17;

import java.util.function.Predicate;

public class Predicate_01 {
    public static void main(String[] args) {
        Predicate<Integer> predicate = valor -> valor > 0;

        System.out.println("predicate.test(123) = " + predicate.test(123));
    }
}
