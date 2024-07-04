package Modulo_48;

import Modulo_41.Pojos.Empleado;

import java.util.*;
import java.util.stream.Collectors;

public class OperacionDeReduccion_01 {

    public static void main(String[] args) {
        /*List<String> nombres = Empleado.empleados()
                .stream()
                .map(Empleado::getNombre)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        System.out.println("nombres = " + nombres);

        for (String nombre: nombres) {
            System.out.println("nombre = " + nombre);
            
        }*/

        /*Set<String> nombres = Empleado.empleados()
                .stream()
                .map(Empleado::getNombre)
                .collect(Collectors.toSet());

        System.out.println("nombres = " + nombres);

        for (String nombre: nombres) {
            System.out.println("nombre = " + nombre);

        }*/

        SortedSet<String> nombres = Empleado.empleados()
                .stream()
                .map(Empleado::getNombre)
                .collect(Collectors.toCollection(TreeSet::new));

        System.out.println("nombres = " + nombres);

        for (String nombre: nombres) {
            System.out.println("nombre = " + nombre);

        }
    }
}
