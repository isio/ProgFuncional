package Modulo_53.service;

import Modulo_53.models.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class AlternativeEmployeeService {
    public static List<Employee> getEmployeeFromBD() {
        return Arrays.asList(
                new Employee("romina01@gmail.com", "Romina01", "Martinez", "Dirección Conocida", "Programador"),
                new Employee("claudia01@gmail.com", "Claudia01", "Glez", "Dirección Conocida", "Programador"),
                new Employee("javier01@gmail.com", "Javier01", "Martinez", "Dirección Conocida", "Programador"),
                new Employee("itzel01@gmail.com", "Itzel01", "Flores", "Dirección Conocida", "Scrum Master"),
                new Employee("alonzo01@gmail.com", "Alonzo01", "Zamora", "Dirección Conocida", "Infra"),
                new Employee("mara01@gmail.com", "Mara01", "Santos", "Dirección Conocida", "Redes"),
                new Employee("juan01@gmail.com", "Juan01", "Carlos", "Dirección Conocida", "Leader"),
                new Employee("sofia01@gmail.com", "Sofia01", "De la Vega", "Dirección Conocida", "Gerente"),
                new Employee("nata01@gmail.com", "Nata01", "Pluma", "Dirección Conocida", "Achichincle"),
                new Employee("rio01@gmail.com", "Rio01", "Frio", "Dirección Conocida", "Trainer")
        );
    }

    public Optional<Employee> findEmployeesByEmail(String email) {
        return getEmployeeFromBD()
                .stream()
                .filter(employee -> employee.getEmail().equals(email))
                .findFirst();
    }
}
