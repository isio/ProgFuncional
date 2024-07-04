package Modulo_27;

import Modulo_27.Utilerias.ProveedorComparaciones;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        List<Persona> personas = Arrays.asList(
                new Persona("Juan  ", 18, "juan@hotmail.com"),
                new Persona("Mario  ", 17, "mario@hotmail.com"),
                new Persona("Arturo", 17, "Arturo@hotmail.com"),
                new Persona("Maria  ", 15, "Maria@hotmail.com"),
                new Persona("Beatriz", 14, "Beatriz@hotmail.com"),
                new Persona("Jhon   ", 12, "jhon@hotmail.com"),
                new Persona("Olivia", 25, "olivia@hotmail.com"),
                new Persona("Àngel  ", 32, "angel@hotmail.com"),
                new Persona("Omar   ", 28, "omar@hotmail.com"),
                new Persona("Pamela", 25, "pamela@hotmail.com"),
                new Persona("Sadee  ", 12, "sadee@hotmail.com"),
                new Persona("Jared  ", 14, "jared@hotmail.com"),
                new Persona("Javier", 18, "javier@hotmail.com"),
                new Persona("Roberto", 20, "roberto@hotmail.com"),
                new Persona("Oyuki  ", 22, "oyuki@hotmail.com"),
                new Persona("Linda  ", 25, "linda@hotmail.com"),
                new Persona("Gustavo", 14, "guastavo@hotmail.com"),
                new Persona("Lourdes", 24, "lourdes@hotmail.com"),
                new Persona("Raquel", 23, "ruquel@hotmail.com"),
                new Persona("Abdías", 22, "abdias@hotmail.com"),
                new Persona("JuanPi", 21, "juanpi@hotmail.com")
        );
        System.out.println("Sin Ordenar");
        personas.forEach(pers -> System.out.println(pers));

        // Collections.sort(personas, (pers_01, pers_02) -> pers_01.getEdad().compareTo(pers_02.getEdad()));
        // Collections.sort(personas, (pers_01, pers_02) -> Persona.compararPorEdad(pers_01, pers_02));
        Collections.sort(personas, Persona::compararPorEdad);
        System.out.println("Ordenadas Por Edad");
        personas.forEach(System.out::println);

        ProveedorComparaciones pC = new ProveedorComparaciones();
        // Collections.sort(personas, (pers_01, pers_02) -> pC.compararPorNombre(pers_01, pers_02));
        Collections.sort(personas, pC::compararPorNombre);
        System.out.println("Ordenadas Por Nombre");
        personas.forEach(System.out::println);

        // Collections.sort(personas, (pers_01, pers_02) -> pers_01.compararPorEdad_02(pers_02));
        Collections.sort(personas, Persona::compararPorEdad_02);
        System.out.println("Ordenadas Por Edad");
        personas.forEach(System.out::println);
    }
}
