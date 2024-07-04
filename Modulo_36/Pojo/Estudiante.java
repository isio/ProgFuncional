package Modulo_36.Pojo;

public class Estudiante {

    private String Identificacion;
    private int edad;
    private double altura;
    private double promedio;

    public Estudiante(String identificacion, int edad, double altura, double promedio) {
        Identificacion = identificacion;
        this.edad = edad;
        this.altura = altura;
        this.promedio = promedio;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String identificacion) {
        Identificacion = identificacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}
