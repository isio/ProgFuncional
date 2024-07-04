package Modulo_19.evaluaEmpleados;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

/*
* Se requiere obtener un reporte con todos los empleados que cumplan con alguno de estos dos conjuntos de criterios.
* 1) 25 años en adelante y que estén en el departamento de Ventas ó
* 2) 25 años en adelante y que estén en el mostrador
* */

public class Principal {
    public static void main(String[] args) {
        List<Empleado> listaEmpleados = Arrays.asList(
                new Empleado("Sienna", 33, 8492.01, "Ventas"),
                new Empleado("Sequoia", 21, 5342.02, "Recursos Humanos"),
                new Empleado("Rav4", 22, 543.03, "Operaciones"),
                new Empleado("Cheyenne", 25, 7251.04, "Comercial"),
                new Empleado("Lobo", 28, 7362.05, "Mostrador"),
                new Empleado("Avalanche", 30, 6473.06, "Ventas"),
                new Empleado("Sierra", 40, 372.07, "Operaciones"),
                new Empleado("Traverse", 19, 999.08, "Recursos Humanos"),
                new Empleado("Super Duty", 18, 7652.09, "Operaciones"),
                new Empleado("Blazer", 26, 491.10, "Comercial"),
                new Empleado("Highlander", 29, 1000.11, "Dirección"),
                new Empleado("Sorento", 34, 2918.12, "Mostrador"),
                new Empleado("Silverado", 21, 9027.13, "Comercial")
        );

        BiPredicate<Integer, String> primerCriterio = (edad, departamento) -> (edad > 25) && (departamento.equals("Ventas"));
        BiPredicate<Integer, String> segundoCriterio = (edad, departamento) -> (edad > 25) && (departamento.equals("Mostrador"));

        BiPredicate<Integer, String> criterio = primerCriterio.or(segundoCriterio);

        Evaluador evaluador = new Evaluador();
        System.out.println("Empleados de Mostrador o Ventas Mayores a 25 años");

        List<Empleado> listaActualizada = evaluador.evaluar(listaEmpleados, criterio);

        for (Empleado empleado: listaActualizada) {
            System.out.println("Nombre : " + empleado.getNombre() + " Edad : " + empleado.getEdad() + " Depto : " + empleado.getDepartamento());
        }
    }
}
