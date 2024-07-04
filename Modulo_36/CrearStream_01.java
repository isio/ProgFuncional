package Modulo_36;

import Modulo_36.Pojo.Estudiante;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CrearStream_01 {
    public static void main(String[] args) {

        Stream<String> stream_01 = Stream.of("Curso de Programación");
        // stream_01.forEach(n -> System.out.println("n = " + n));
        stream_01.forEach(System.out::println);

        Stream<String> stream_02 = Stream.of("Curso_01", "Curso_02", "Curso_03", "Curso_04", "Curso_05");
        stream_02.forEach(System.out::println);

        String[] arreglo = {"Java", "C#", "Rust", "C++"};
        Stream<String> stream_03 = Stream.of(arreglo);
        stream_03.forEach(System.out::println);

        Stream<Estudiante> streamsEstudiantes = Stream.<Estudiante>builder()
                .add(new Estudiante("n_01", 23, 22, 21))
                .add(new Estudiante("n_02", 33, 32, 31))
                .build();

        streamsEstudiantes.forEach(estudiante -> System.out.println("estudiante.getIdentificacion() = " + estudiante.getIdentificacion()));

        IntStream unoAVeinte = IntStream.rangeClosed(1, 20);
        unoAVeinte.forEach(System.out::println);
    }
}
