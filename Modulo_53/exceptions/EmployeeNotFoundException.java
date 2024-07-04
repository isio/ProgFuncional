package Modulo_53.exceptions;

public class EmployeeNotFoundException extends Exception{

    public EmployeeNotFoundException(String termino) {
        super("No se encontró el empleado solicitado con el término : " + termino);
    }
}
