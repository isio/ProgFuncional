package Modulo_39;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class CrearStream_04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();

        IntStream streamChar = entrada.chars();
        // streamChar.forEach(System.out::println);

        streamChar
                .filter(n -> !Character.isDigit((char)n) && !Character.isWhitespace((char)n))
                .forEach(n -> System.out.print((char)n));

        System.out.println(" " );

        System.out.println("\nSplitAsStream");
        String str = "Java, C++, C#, Rust, Angular, React, JS";
        Pattern.compile(", ")
                .splitAsStream(str)
                .forEach(System.out::println);

    }
}
