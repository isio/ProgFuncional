package Modulo_21;

import java.util.function.BiConsumer;

public class InterfazBiConsumerTest {
    public static void main(String[] args) {

        BiConsumer<Double, Double> biConsumer = (num01, num02) -> {
            Double num = num01 * num02;
            System.out.println("num = " + num);
        };

        biConsumer.accept(92.1, 38.22);

    }
}
