package Modulo_17;

import java.util.Arrays;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Empleado> listaEmpleados = Arrays.asList(
          new Empleado("Sienna", 33, 8492.01, "Ventas"),
          new Empleado("Sequoia", 21, 5342.02, "Recursos Humanos"),
          new Empleado("Rav4", 22, 543.03, "Operaciones"),
          new Empleado("Cheyenne", 25, 7251.04, "Comercial"),
          new Empleado("Lobo", 28, 7362.05, "Compras"),
          new Empleado("Avalanche", 30, 6473.06, "Ventas"),
          new Empleado("Sierra", 40, 372.07, "Operaciones"),
          new Empleado("Traverse", 19, 999.08, "Recursos Humanos"),
          new Empleado("Super Duty", 18, 7652.09, "Operaciones"),
          new Empleado("Blazer", 26, 491.10, "Comercial"),
          new Empleado("Highlander", 29, 1000.11, "Dirección"),
          new Empleado("Sorento", 34, 2918.12, "Compras"),
          new Empleado("Silverado", 21, 9027.13, "Comercial")
        );

        Evaluador evaluador = new Evaluador();

        System.out.println("Empleados con salarios Mayores a 5000");

        List<Empleado> empleadosSalariosAltos =
                evaluador.evaluar(listaEmpleados, empleado -> empleado.getSalario() > 5000 );

        for (Empleado empleado : empleadosSalariosAltos) {
            System.out.println("NOMBRE : " + empleado.getNombre() + " SALARIO : " + empleado.getSalario());
        }

        System.out.println("\nEmpelados que inician con la letra S");
        List<Empleado> empleadosQueInicianConS =
                evaluador.evaluar(listaEmpleados, empleado -> empleado.getNombre().startsWith("S"));
        for (Empleado empleado : empleadosQueInicianConS) {
            System.out.println("NOMBRE = " + empleado.getNombre());
        }

        System.out.println("\nEmpelados Jóvenes");
        List<Empleado> listaEmpleadosJovenes =
                evaluador.evaluar(listaEmpleados, empleado -> empleado.getEdad() < 25);
        for (Empleado empleado : listaEmpleadosJovenes) {
            System.out.println("NOMBRE = " + empleado.getNombre() + " EDAD = " + empleado.getEdad() + " SALARIO = " + empleado.getSalario() );

        }

        Funciones funciones = new Funciones();

        for (Empleado empleado : listaEmpleadosJovenes) {
            double nuevoSalario = funciones.incrementaSalario(
                    empleado,
                    10.0,
                    (salario, incremento) -> salario + (salario * (incremento/100)));

            empleado.setSalario(nuevoSalario);
        }

        System.out.println("\nNuevos Salarios con incremento");
        for (Empleado empleado : listaEmpleadosJovenes) {
            System.out.println("NOMBRE_ = " + empleado.getNombre() + " SALARIO = " + empleado.getSalario());
        }

        System.out.println("\nEmpelados Mayores");
        List<Empleado> listaEmpleadosMayores =
                evaluador.evaluarAlContrario(listaEmpleados, empleado -> empleado.getEdad() < 25);
        for (Empleado empleado : listaEmpleadosMayores) {
            System.out.println("NOMBRE = " + empleado.getNombre() + " EDAD = " + empleado.getEdad() + " SALARIO = " + empleado.getSalario() );
        }

    }
}
