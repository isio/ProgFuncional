package Modulo_20.accept_estudiantes;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Principal {

    public static void main(String[] args) {

        List<Estudiante> listaEstudiantes = Arrays.asList(
                new Estudiante("Rafa", 9.1),
                new Estudiante("León", 8.1),
                new Estudiante("Fer", 7.1),
                new Estudiante("Yacob", 6.1),
                new Estudiante("Ivan", 9.2),
                new Estudiante("Víctor", 8.2),
                new Estudiante("Isra", 7.2),
                new Estudiante("Coca", 6.2),
                new Estudiante("Aranza", 9.3),
                new Estudiante("Raúl", 8.3),
                new Estudiante("Irving", 7.3),
                new Estudiante("Miriam", 6.3),
                new Estudiante("Ana", 9.4)
        );

        OperacionEstudiantes operacionEstudiantes = new OperacionEstudiantes();

        /*System.out.println("Estudiantes Sin Calificación Actualizada . . . ");
        Consumer<Estudiante> const01 = e -> System.out.println("Nombre : " + e.getNombre() + " Calificación : " + e.getCalificacion());
        operacionEstudiantes.aceptaTodos(listaEstudiantes, const01);

        Consumer<Estudiante> const02 = e -> e.setCalificacion(e.getCalificacion() * 1.15);
        operacionEstudiantes.aceptaTodos(listaEstudiantes, const02);

        System.out.println("\nEstudiantes Con la calificación actualizada");
        operacionEstudiantes.aceptaTodos(listaEstudiantes, const01);*/

        System.out.println("Estudiantes Sin Calificación Actualizada . . . ");
        Consumer<Estudiante> const01 = e -> System.out.println("Nombre : " + e.getNombre() + " Calificación : " + e.getCalificacion());
        operacionEstudiantes.aceptaTodos(listaEstudiantes, const01);

        Consumer<Estudiante> const02 = e -> e.setCalificacion(e.getCalificacion() * 1.15);

        Consumer<Estudiante> const03 = const02.andThen(const01);

        System.out.println("\nEstudiantes Con la calificación actualizada");
        operacionEstudiantes.aceptaTodos(listaEstudiantes, const03);
    }
}
