package Modulo_38;

import Modulo_36.Pojo.Estudiante;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CrearStream_03 {
    public static void main(String[] args) {

        IntStream numStream = Arrays.stream(new int[]{1,2,3,4,5,6});
        numStream.forEach(System.out::println);

        Stream<String> nombres = Arrays.stream(new String[]{"Juan", "Pedro", "Santiago", "Aurelio", "Eufracia"});
        nombres.forEach(System.out::println);

        Set<String> lenguajesSet = new HashSet<>();
        lenguajesSet.add("Java");
        lenguajesSet.add("C#");
        lenguajesSet.add("C++");

        Stream<String> lenguajesStream = lenguajesSet.stream();
        lenguajesStream.forEach(System.out::println);

        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Es_01", 32, 43, 54));
        estudiantes.add(new Estudiante("Es_02", 33, 44, 55));
        estudiantes.add(new Estudiante("Es_03", 34, 45, 56));
        estudiantes.add(new Estudiante("Es_04", 35, 46, 57));
        estudiantes.add(new Estudiante("Es_05", 36, 47, 58));
        estudiantes.add(new Estudiante("Es_06", 37, 48, 59));
        estudiantes.add(new Estudiante("Es_07", 38, 49, 60));

        Stream<Estudiante> estudianteStream = estudiantes.stream();

        estudianteStream.forEach(n -> System.out.println(n.getIdentificacion()));


    }
}
