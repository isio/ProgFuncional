package Modulo_35;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        Stream<Integer> numStream = numeros.stream();

        int suma = numStream
                .filter(n -> n % 2 == 1)    // 1, 3, 5
                .peek(System.out::println)
                .map(n -> n * n)            // 1, 9, 25
                .peek(System.out::println)
                .reduce(0, Integer::sum);   // 35
                // .reduce(0, (n1, n2) -> n1 + n2);

        System.out.println("suma = " + suma);

    }
}
