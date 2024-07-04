package Modulo_27.Utilerias;

import Modulo_27.Persona;

public class ProveedorComparaciones {

    public int compararPorNombre(Persona pers_01, Persona pers_02) {
        return pers_01.getNombre().compareTo(pers_02.getNombre());
    }

    public int compararPorEdad(Persona pers_01, Persona pers_02) {
        return pers_01.getEdad().compareTo(pers_02.getEdad());
    }
}
