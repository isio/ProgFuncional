package Modulo_43;

import Modulo_41.Pojos.Empleado;

import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class OperacionesMap {

    public static void main(String[] args) {
        /*IntStream.rangeClosed(1, 5)
                .map(new IntUnaryOperator() {
                    @Override
                    public int applyAsInt(int numero) {
                        return numero * numero;
                    }
                })
                .forEach(System.out::println);

        IntStream.rangeClosed(1, 10)
                .map(n -> n * 2)
                .forEach(System.out::println);*/

        List<Empleado> empleadoList = Empleado.empleados();

        System.out.println("Promedio de Ingresos de Personal Femenino Mayor de 25 Años!");

        Double suma = empleadoList
                .stream()
                .filter(Empleado::esMujer)
                .filter(n -> n.getEdad() > 25)
                .mapToDouble(k -> k.getIngresos())
                .sum();

        Long count = empleadoList
                .stream()
                        .filter(Empleado::esMujer)
                                .filter(o -> o.getEdad() > 25)
                                        .count();

        System.out.println("Promedio >>>> " + suma / count);

    }
}
