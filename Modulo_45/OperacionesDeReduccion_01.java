package Modulo_45;

import Modulo_41.Pojos.Empleado;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OperacionesDeReduccion_01 {
    public static void main(String[] args) {

        // Arreglo de Números
        int [] numeros_00 = {4,6,10,12,15,55,7,8,9,10,2,5,8,9,10,45,6,9,33,66,85,97,81,24,99,1,100};

        // Suma de elementos
        int suma = 0;
        for (int i = 0; i < numeros_00.length; i++) {
            suma += numeros_00[i];
        }

        System.out.println("La suma es " + suma);
        
        // El promedio
        System.out.println("suma / numeros.length = " + suma / numeros_00.length);
        // Cantidad de elementos
        System.out.println("numeros = " + numeros_00.length);

        // Obtener el Máximo
        int  maximo = numeros_00[0];
        for (int numero: numeros_00) {
            if ( numero > maximo) {
                maximo = numero;
            }
        }
        System.out.println("maximo = " + maximo);
        
        // Obtener el Mínimo
        int minimo = numeros_00[0];
        for (int numero: numeros_00) {
            if ( numero < minimo) {
                minimo = numero;
            }
        }
        System.out.println("minimo = " + minimo);

        System.out.println("Operaciones de reducción con empleados");

        List<Empleado> empleados = Empleado.empleados();

        // Suma de Salarios
        double sumaSalarios = 0.0;

        for (Empleado empleado: empleados) {
            sumaSalarios += empleado.getIngresos();
        }
        System.out.println("sumaSalarios = " + sumaSalarios);
        System.out.println("Número de Empleados = " + empleados.size());

        // Obtener el empleado con salario Máximo
        Empleado empMaximo = empleados.get(0);

        for (Empleado empleado: empleados) {
            if ( empleado.getIngresos() > empMaximo.getIngresos() ) {
                empMaximo = empleado;
            }
        }

        System.out.println("Nombre y Salario Máximo " + empMaximo.getNombre() + "\t " + empMaximo.getIngresos());


        int [] numeros = {4,6,10,12,15,55,7,8,9,10,2,5,8,9,10,45,6,9,33,66,85,97,81,24,99,1,100};

        // Operaciones de Reducción con Números

        // Suma de los Elementos
        System.out.println("Suma IntStream " + IntStream.of(numeros).sum());

        // Obtener el promedio de los Elementos
        System.out.println("Promedio IntStream " + IntStream.of(numeros).average().getAsDouble());

        // Obtener el Màximo y el Mín
        System.out.println("Máx y Mín " + IntStream.of(numeros).max().getAsInt() + "\t " + IntStream.of(numeros).min().getAsInt() );

        // Contar Cantidad de Elementos
        System.out.println("Cantidad de Elementos " + IntStream.of(numeros).count());

        // Operaciones con Empleados
        // Sumar Los Salarios de Todos Los Empleados
        System.out.println("\nOperaciones con Empleados y Streams");

        System.out.println("Suma " + empleados
                .stream()
                .mapToDouble(Empleado::getIngresos)
                .sum());

        // Obtener el empleado con el Salario Máximo
        Empleado empMax = empleados
                .stream()
                .max( (empleado_01, empleado_02) -> (int)(empleado_01.getIngresos() - empleado_02.getIngresos()))
                .get();

        System.out.println("Nombre " + empMax.getNombre() + "\t " + empMax.getIngresos());




    }
}
