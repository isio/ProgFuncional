package Modulo_17;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Evaluador {
    public List<Empleado> evaluar(List<Empleado> listEmpleado, Predicate<Empleado> empleadoPredicate) {
        List<Empleado> listaNueva = new ArrayList<>();

        for (Empleado empleado : listEmpleado) {
            if (empleadoPredicate.test(empleado)) {
                listaNueva.add(empleado);
            }
        }
        return listaNueva;
    }

    public List<Empleado> evaluarAlContrario(List<Empleado> listEmpleado, Predicate<Empleado> empleadoPredicate) {
        List<Empleado> listaNueva = new ArrayList<>();

        for (Empleado empleado : listEmpleado) {
            if (empleadoPredicate.negate().test(empleado)) {
                listaNueva.add(empleado);
            }
        }
        return listaNueva;
    }
}
