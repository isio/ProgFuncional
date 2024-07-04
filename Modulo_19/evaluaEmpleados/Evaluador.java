package Modulo_19.evaluaEmpleados;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class Evaluador {

    public List<Empleado> evaluar(List<Empleado> listaEmp, BiPredicate<Integer, String> biPredicate) {

        List<Empleado> listaNueva = new ArrayList<>();

        for (Empleado empleado : listaEmp) {
            if( biPredicate.test(empleado.getEdad(), empleado.getDepartamento()) ) {
                listaNueva.add(empleado);
            }
        }
        return listaNueva;
    }
}
