package Modulo_09;

public class LambdaTest {
    public static void main(String[] args) {
        engine((x, y) -> x + y);
        engine((x, y) -> x / y);
        engine((x, y) -> x * y);
        engine((x, y) -> x - y);
    }

    private static void engine(Calculadora calc) {
        int x = 2; int y = 4;
        int resultado = calc.calcular(x, y);
        System.out.println(resultado);
    }
}
