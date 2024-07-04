package Modulo_24;

import java.util.function.BinaryOperator;

public class InterfazBinaryOperatorTest {

    public static void main(String[] args) {
        BinaryOperator<Integer> bOperator = (num_01, num_02) -> num_01 * num_02;

        // Utilizando el methodo Apply
        int resultado = bOperator.apply(10,20);
        System.out.println("resultado = " + resultado);

        // Útilizando el methodo MinBy
        BinaryOperator<Integer> binaryOperator_01 = BinaryOperator.minBy((Integer t_01, Integer t_02) -> t_01.compareTo(t_02));
        resultado = binaryOperator_01.apply(300, 200);
        System.out.println("MinBy = " + resultado );

        // Útilizando el methodo MaxBy
        BinaryOperator<Integer> binaryOperator_02 = BinaryOperator.maxBy((Integer t_01, Integer t_02) -> t_01.compareTo(t_02));
        resultado = binaryOperator_02.apply(300, 200);
        System.out.println("MaxBy = " + resultado );

    }

}
