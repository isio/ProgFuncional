package Modulo_50;

import Modulo_41.Pojos.Empleado;
import java.util.Map;
import java.util.stream.Collectors;

public class OperacionesDeReduccion {

    public static void main(String[] args) {

        Map<Long, String> idANombreMapa = Empleado.empleados()
                .stream()
                .collect(
                        Collectors.toMap(
                                Empleado::getId, Empleado::getNombre
                        )
                );

        System.out.println("idANombreMapa = " + idANombreMapa);

        Map<Empleado.Genero, String> generoANombreMapa = Empleado.empleados()
                .stream()
                .collect(
                        Collectors.toMap(
                                Empleado::getGenero,
                                Empleado::getNombre,
                                (nom_00, nom_01) -> String.join(", ", nom_00, nom_01)
                        )
                );

        System.out.println("generoANombreMapa = " + generoANombreMapa);
    }
}
