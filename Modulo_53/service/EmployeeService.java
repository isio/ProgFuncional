package Modulo_53.service;

import Modulo_53.models.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeService {
    public static List<Employee> getEmployeeFromBD() {
        return Arrays.asList(
                new Employee("romina@gmail.com", "Romina", "Martinez", "Dirección Conocida", "Programador"),
                new Employee("claudia@gmail.com", "Claudia", "Glez", "Dirección Conocida", "Programador"),
                new Employee("javier@gmail.com", "Javier", "Martinez", "Dirección Conocida", "Programador"),
                new Employee("itzel@gmail.com", "Itzel", "Flores", "Dirección Conocida", "Scrum Master"),
                new Employee("alonzo@gmail.com", "Alonzo", "Zamora", "Dirección Conocida", "Infra"),
                new Employee("mara@gmail.com", "Mara", "Santos", "Dirección Conocida", "Redes"),
                new Employee("juan@gmail.com", "Juan", "Carlos", "Dirección Conocida", "Leader"),
                new Employee("sofia@gmail.com", "Sofia", "De la Vega", "Dirección Conocida", "Gerente"),
                new Employee("Nata@gmail.com", "Nata", "Pluma", "Dirección Conocida", "Achichincle"),
                new Employee("rio@gmail.com", "Rio", "Frio", "Dirección Conocida", "Trainer")
        );
    }

    public Optional<Employee> findEmployeesByEmail(String email) {
        return getEmployeeFromBD()
                .stream()
                .filter(employee -> employee.getEmail().equals(email))
                .findFirst();

        // Todas estas líneas retornan lo mismo con el findFirst que en el fondo es un Optional
        /*List<Employee> employeeList = getEmployeeFromBD()
                .stream()
                .filter(employee -> employee.getEmail().equals(email))
                .collect(Collectors.toList());

        Employee employee = employeeList.get(0);

        if( employee != null ) {
            return Optional.of(employee);
        } else {
            return Optional.empty()
        }*/


    }

    public static Employee defaultByName() {
        return new Employee("default@gmail.com", "Default", "Default", "Dirección Conocida", "Programer");
    };
}
