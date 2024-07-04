package Modulo_53.models;

public class Employee {
    private String email;
    private String nombre;
    private String apellido;
    private String direccion;
    private String puesto;

    public Employee(String email, String nombre, String apellido, String direccion, String puesto) {
        this.email = email;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.puesto = puesto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Employee{");
        stringBuilder.append("nombre = ").append(nombre);
        stringBuilder.append(", apellido = ").append(apellido);
        stringBuilder.append(", dirección  = ").append(direccion);
        stringBuilder.append(", puesto = ").append(puesto);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
