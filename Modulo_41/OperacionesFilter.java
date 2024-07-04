package Modulo_41;

import Modulo_41.Pojos.Empleado;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

public class OperacionesFilter {
    public static void main(String[] args) {

        List<Empleado> empleados = Empleado.empleados();

        empleados.stream().forEach(empleado -> System.out.println(empleado.getNombre() + "\t " + empleado.getGenero()));

        System.out.println("\nFilter de solo Hombres");
        empleados
                .stream()
                // .filter(n -> n.esHombre() == true)
                .filter(new Predicate<Empleado>() {
                    @Override
                    public boolean test(Empleado empleado) {
                        return empleado.esHombre();
                    }
                })
                .forEach(empleado -> System.out.println(empleado.getNombre() + "\t " + empleado.getGenero()));

        System.out.println("\nFilter de solo Mujeres");
        empleados
                .stream()
                .filter(Empleado::esMujer)
                /*.filter(new Predicate<Empleado>() {
                    @Override
                    public boolean test(Empleado empleado) {
                        return empleado.esMujer();
                    }
                })*/
                .forEach(empleado -> System.out.println(empleado.getNombre() + "\t " + empleado.getGenero() + "\t " + empleado.getIngresos() + "\t " + empleado.getEdad()  ));

        System.out.println("\nEmpleados mayores de 25 años");
        empleados
                .stream()
                .filter(n -> n.getEdad() > 25)
                .forEach(s -> System.out.println(s.getNombre() + "\t " + s.getEdad() + "\t " + s.getGenero()));

        System.out.println("\nPersonal Masculino y Nombre que comience con la letra 'A'");
        empleados
                .stream()
                .filter(Empleado::esHombre)
                .filter(n -> n.getNombre().startsWith("A"))
                .forEach(a -> System.out.println(a.getNombre() + "\t " + a.getEdad() + "\t" + a.getGenero()));

        System.out.println("\nPersonal Masculino que Gana Arriba de 500");
        empleados
                .stream()
                .filter(f -> f.esHombre() && f.getIngresos() > 20000)
                .forEach(w -> System.out.println(w.getNombre() + "\t " + w.getIngresos()));

        System.out.println("\nPersonal Femenino mayor de 25 años con ingresos por encima de los 500");
        Predicate<Empleado> empFemenino =  empleado -> empleado.esMujer();
        Predicate<Empleado> empMayor25 = empleado -> empleado.getEdad() > 25;
        Predicate<Empleado> empMayor300 = empleado -> empleado.getIngresos() > 300;
        Predicate<Empleado> empFem25300 = empFemenino.and(empMayor25).and(empMayor300);

        empleados
                .stream()
                .filter(empFem25300)
                .forEach(r -> System.out.println(r.getNombre() + "\t " + r.getEdad() + "\t " + r.getIngresos()));

        System.out.println("Count > " + empleados.stream().filter(empFem25300).count());

        System.out.println("\nEmpleado con Mayores Ingresos en la Empresa");
        Empleado maxIngresos = empleados
                .stream()
                .max(Comparator.comparing(Empleado::getIngresos))
                .orElseThrow(NoSuchElementException::new);

        System.out.println(maxIngresos.getNombre() + "\t " + maxIngresos.getEdad() + "\t " + maxIngresos.getGenero() + "\t " +maxIngresos.getIngresos());
    }
}
