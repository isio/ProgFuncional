package Modulo_47;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OperacionesDeReduccion_03 {
    public static void main(String[] args) {
        System.out.println(
                IntStream.range(1, 20)
                        .summaryStatistics());

        System.out.println("Suma " +
                IntStream.range(1, 20)
                        .sum());

        System.out.println("Promedio " +
                IntStream.range(1, 20)
                        .average().getAsDouble());

        System.out.println("Max " +
                IntStream.range(1, 20)
                        .max().getAsInt());
    }
}
