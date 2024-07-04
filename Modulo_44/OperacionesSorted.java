package Modulo_44;

import Modulo_41.Pojos.Empleado;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;

public class OperacionesSorted {
    public static void main(String[] args) {
        /* System.out.println("Nombres Ordenados");
        Arrays.asList("Alfredo", "Maria", "Daniel", "Brenda", "Abdías")
                .stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("\nNúmeros Ordenados");
        Arrays.asList(1,2,7,8,9,1,5,2,1,5,3,5,4,6)
                .stream()
                .sorted()
                .forEach(System.out::println); */
        System.out.println("Empleados Ordenados Alfabeticamente");
        List<Empleado> empleados = Empleado.empleados();

        empleados
                .stream()
                .sorted()
                .forEach(n -> System.out.println(n.getNombre()));

        System.out.println("\nEmpleados Ordenados por Edad. Clase Anonima");
        empleados
                .stream()
                .sorted(new Comparator<Empleado>() {
                    @Override
                    public int compare(Empleado o1, Empleado o2) {
                        return o1.getEdad() - o2.getEdad();
                    }
                })
                .forEach(f -> System.out.println(f.getNombre() + "\t " + f.getEdad()));

        System.out.println("\nEmpleados Mayores a 25, Ordenados por su Ingreso");
        empleados
                .stream()
                .filter(e -> e.getEdad() > 25)
                .sorted( (empleado_01, empleado_02) -> (int)(empleado_01.getIngresos() - empleado_02.getIngresos()))
                .forEach(q -> System.out.println(q.getNombre() + "\t " + q.getEdad() + "\t " + q.getIngresos() ));

    }
}
