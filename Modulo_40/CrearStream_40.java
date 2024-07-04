package Modulo_40;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class CrearStream_40 {
    public static void main(String[] args) {

        Path path_01 = Paths.get("Modulo_40/Parrafo.txt");

        try (Stream<String> lineas = Files.lines(path_01)) {
            lineas.forEach(linea -> {
                System.out.println("Línea");
                System.out.println(linea);
            });
        } catch (IOException e) {
            e.printStackTrace();
        }

        Path dir = Paths.get(".");
        System.out.printf("%nEl Arbol de Archivos del Proyecto para : %s es %n ", dir.toAbsolutePath());

        try (Stream<Path> paths = Files.walk(dir)) {
            paths.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
