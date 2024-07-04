package Modulo_53.controllers;

import Modulo_53.models.Employee;
import Modulo_53.service.AlternativeEmployeeService;
import Modulo_53.service.EmployeeService;

import java.util.Optional;
import java.util.Scanner;

public class EmployeeController {

    Optional<Employee> findEmployeeByEmail(String email) {
        Optional<Employee> employeeOptionalService = new EmployeeService().findEmployeesByEmail(email);
        Optional<Employee> employeeOptionalAlternativeService = new AlternativeEmployeeService().findEmployeesByEmail(email);
        return employeeOptionalService.or(() -> employeeOptionalAlternativeService);

        // No aconsejado
        /* Optional<Employee> employeeOptional = new EmployeeService().findEmployeesByEmail(email);
        if(employeeOptional.isPresent()) {
            return employeeOptional.get();
        } else {
            return null;
        }*/
    }

    public static void main(String[] args) {
        EmployeeController employeeController = new EmployeeController();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el Email del Empleado : ");

        String email = scanner.next();

        Optional<Employee> employeeOptional = employeeController.findEmployeeByEmail(email);

        // Se debera hacer una implementación de un metodo consumer
        // ifPresent realiza una acción si el objeto se encuentra dentro del contenedor Optional
        // employeeOptional.ifPresent(employee -> System.out.println("employee = " + employee));

        // ifPresentOrElse realiza una acción  sí el objeto se encuentra dentro del contenedor o una acción alternativa si no se encuentra
        /*employeeOptional.ifPresentOrElse(
                employee -> System.out.println("employee = " + employee),
                () -> System.out.println(" No se encontro el objeto del empleado ")
        );*/

        // Utilizar objeto por defecto si no se encuentra el objeto employee
         Employee employee = employeeOptional.orElse(EmployeeService.defaultByName());
        // Employee employee = employeeOptional.orElseGet(() -> EmployeeService.defaultByName());
        System.out.println("employee = " + employee);



    }

}

