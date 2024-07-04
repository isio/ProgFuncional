package Modulo_51;

import Modulo_36.Pojo.Estudiante;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningByClass {

    public static List<Student> getStudents() {
        return Arrays.asList(
                new Student("Jhon", "Smith", "Miami", 7.38, 19),
                new Student("Jane", "Miles", "New YorK", 8.4, 21),
                new Student("Michael", "Peterson", "New YorK", 7.5, 20),
                new Student("Gabriela", "Robertson", "Miami", 9.1, 20),
                new Student("kile", "Miller", "Miami", 9.83, 20)
        );
    }

    public static void main(String[] args) {
        /*List<String> nombres = Arrays.asList("Andrés", "Jaime", "Sara", "César", "Javier", "Rosa", "Maria");

        Map<Boolean, List<String>> nombresMapa = nombres
                .stream()
                .collect(Collectors.partitioningBy(nombre -> nombre.length() > 4));

        System.out.println("nombresMapa = " + nombresMapa);
        System.out.println("nombresMapa.get(true) = " + nombresMapa.get(true));
        System.out.println("nombresMapa.get(false) = " + nombresMapa.get(false));*/

        List<Student> estudiantes = getStudents();

        Map<Boolean, List<Student>> nombresStudent =  estudiantes
                .stream()
                .collect(Collectors.partitioningBy( student -> student.getName().length() > 4));

        System.out.println("estudiantes = " + nombresStudent);
        System.out.println("estudiantes(true) = " + nombresStudent.get(true));
        System.out.println("estudiantes(false) = " + nombresStudent.get(false));


        Map<Boolean, List<Student>> calificacionesStudent = estudiantes
                .stream()
                .collect(Collectors.partitioningBy(Student::calificacionExcelente));

        System.out.println("calificacionesStudent = " + calificacionesStudent);
        System.out.println("calificacionesStudent(true) = " + calificacionesStudent.get(true));
        System.out.println("calificacionesStudent(false) = " + calificacionesStudent.get(false));

    }
}
