package Modulo_46;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OperacionesDeReduccion_02 {
    public static void main(String[] args) {
        // Arreglo de Números
        int[] numeros_00 = {4, 6, 10, 12, 15, 55, 7, 8, 9, 10, 2, 5, 8, 9, 10, 45, 6, 9, 33, 66, 85, 97, 81, 24, 99, 1, 100};

        int suma = IntStream.of(numeros_00)
                .reduce(0, Integer::sum);
                /*.reduce(0, new IntBinaryOperator() {
                    @Override
                    public int applyAsInt(int left, int right) {
                        return left + right;
                    }
                }*/
        System.out.println("suma = " + suma);

        Path path_00 = Paths.get("Modulo_40/Parrafo.txt");
        String texto = "";

        try(Stream<String> lineas = Files.lines(path_00)) {
            texto = lineas
                    .map(linea -> linea.replace(",", ""))
                    .reduce("", (linea_00, linea_01) -> linea_00.concat("\n").concat(linea_01));

            System.out.println("texto = " + texto);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Modulo_46/Parrafo_02.txt"))) {
            bufferedWriter.write(texto);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
