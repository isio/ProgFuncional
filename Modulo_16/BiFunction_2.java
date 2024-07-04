package Modulo_16;

public class BiFunction_2 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        String resultado = calculadora.calc((x,y) -> ": " + x * y, 2 ,3);

        System.out.println("resultado.length() = " + resultado.length());
    }
}
