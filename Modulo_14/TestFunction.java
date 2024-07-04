package Modulo_14;

import java.util.function.Function;

public class TestFunction {
    public static void main(String[] args) {
        /*Function<Integer, String> convertidor_ = new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return null;
            }
        };*/

        Function<Integer, String> convertidor = x -> Integer.toString(x);
        System.out.println("convertidor.apply( 3).length() = " + convertidor.apply( 3).length());
        System.out.println("convertidor.apply(30).length() = " + convertidor.apply(30).length());
    }
}
