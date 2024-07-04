package Modulo_22;

import java.util.function.Supplier;

public class InterfazSupplierTest {
    public static void main(String[] args) {
        Supplier<String> i = () -> "Hola";

        System.out.println("i.get() = " + i.get().toUpperCase());
    }
}
