package Modulo_20;

import java.util.function.Consumer;

public class Test_Consumer {
    public static void main(String[] args) {
        Consumer<String> consumer = x -> System.out.println(x.toUpperCase());

        consumer.accept("Hola Amigos!");
    }
}
