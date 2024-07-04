package Modulo_17;

import java.util.function.BiFunction;

public class Funciones {
    public Double incrementaSalario(
            Empleado empleado, double incremento, BiFunction<Double, Double, Double> bi) {
        return bi.apply(empleado.getSalario(), incremento);
    }
}
