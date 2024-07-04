package Modulo_41.Pojos;

import java.util.Arrays;
import java.util.List;

public class Empleado implements Comparable {

    private long id;
    private String nombre;
    private double ingresos;
    private Genero genero;
    private int edad;

    public static enum Genero {
        HOMBRE, MUJER
    }

    public boolean esHombre() {
        return this.genero == Genero.HOMBRE;
    }

    public boolean esMujer() {
        return this.genero == Genero.MUJER;
    }

    public Empleado(long id, String nombre, double ingresos, Genero genero, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.ingresos = ingresos;
        this.genero = genero;
        this.edad = edad;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int compareTo(Object o) {
        return this.getNombre().compareTo(((Empleado)o).getNombre());
    }

    public static List<Empleado> empleados() {
        Empleado empleado_01 = new Empleado(1, "Juan", 1538.01, Genero.HOMBRE, 18);
        Empleado empleado_02 = new Empleado(2, "Mario  ", 1672.01, Genero.HOMBRE, 34);
        Empleado empleado_03 = new Empleado(3, "Arturo", 992.77, Genero.HOMBRE, 21);
        Empleado empleado_04 = new Empleado(4, "Maria  ", 2675.12, Genero.MUJER, 23);
        Empleado empleado_05 = new Empleado(5, "Beatriz", 3875.11, Genero.MUJER, 20);
        Empleado empleado_06 = new Empleado(6, "Jhon   ", 1232.55, Genero.HOMBRE, 19);
        Empleado empleado_07 = new Empleado(7, "Olivia", 47653.43, Genero.MUJER, 25);
        Empleado empleado_08 = new Empleado(8, "Àngel  ", 19022.66, Genero.HOMBRE, 31);
        Empleado empleado_09 = new Empleado(9, "Omar   ", 6478.21, Genero.HOMBRE, 35);
        Empleado empleado_10 = new Empleado(10, "Pamela", 4833.10, Genero.MUJER, 31);
        Empleado empleado_11 = new Empleado(11, "Sadee  ", 4873.44, Genero.MUJER, 28);
        Empleado empleado_12 = new Empleado(12, "Jared  ", 75843.12, Genero.HOMBRE, 23);
        Empleado empleado_13 = new Empleado(13, "Javier", 97484.88, Genero.HOMBRE, 22);
        Empleado empleado_14 = new Empleado(14, "Roberto", 38272.76, Genero.HOMBRE, 27);
        Empleado empleado_15 = new Empleado(15, "Oyuki  ", 5463.88, Genero.MUJER, 30);
        Empleado empleado_16 = new Empleado(16, "Linda  ", 49484.66, Genero.MUJER, 26);
        Empleado empleado_17 = new Empleado(17, "Gustavo", 37368.76, Genero.HOMBRE, 29);
        Empleado empleado_18 = new Empleado(18, "Lourdes", 76454.84, Genero.MUJER, 24);
        Empleado empleado_19 = new Empleado(19, "Raquel", 48367.77, Genero.MUJER, 33);
        Empleado empleado_20 = new Empleado(20, "Abdías", 54637.78, Genero.HOMBRE, 18);
        Empleado empleado_21 = new Empleado(21, "JuanPi", 43449.00, Genero.HOMBRE, 31);

        return Arrays.asList(empleado_01, empleado_02, empleado_03, empleado_04, empleado_05, empleado_06,
                empleado_07, empleado_08, empleado_09, empleado_10, empleado_11, empleado_12, empleado_13,
                empleado_14, empleado_15, empleado_16, empleado_17, empleado_18, empleado_19, empleado_20,
                empleado_21);
    }
}
