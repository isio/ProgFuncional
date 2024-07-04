package Modulo_26;

import java.util.*;

public class Ordenacion {
    public static void main(String[] args) {
        // Ordenación natural de String con Comparable
        List<String> nombres = Arrays.asList("Carlos", "Ana", "Abdías", "German");

        System.out.println("Lista Antes de Ordenarse : " + nombres);

        Collections.sort(nombres);

        System.out.println("Lista Despúes de Ordenarse :" + nombres);

        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(1, "Mario"));
        personas.add(new Persona(2, "Fernando"));
        personas.add(new Persona(3, "Omar"));
        personas.add(new Persona(4, "Juana"));
        System.out.println("Desordenadas Por Nombre " + personas);

        Collections.sort(personas);
        System.out.println("Ordenadas Por Nombre " + personas);

        // Collections.sort(personas, new OrdenarPersonaPorId());

        /*Collections.sort(personas, new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                return o1.getIdPersona() - o2.getIdPersona();
            }
        });*/

        Collections.sort(personas, (pers_01, pers_02) -> pers_01.getIdPersona() - pers_02.getIdPersona());

        System.out.println("Ordenadas Por Su Id " + personas);


    }
}
