package Modulo_19;

import java.util.function.BiPredicate;

public class Test_BiPredicate {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> biPredicate = (x, y) -> x > y;

        System.out.println("biPredicate.test(10, 20) = " + biPredicate.test(10, 20));
        
    }
}
