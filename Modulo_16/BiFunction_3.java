package Modulo_16;

import java.util.Arrays;
import java.util.List;

public class BiFunction_3 {

    public static void main(String[] args) {


        List<Empleado> listaEmpleados = Arrays.asList(
          new Empleado("Almeja", 3829.01),
          new Empleado("Tiburón", 8652.02),
          new Empleado("Salamandra", 4637.03),
          new Empleado("Mangosta", 9286.04),
          new Empleado("Pinguino", 4673.05),
          new Empleado("Aguila", 2516.06),
          new Empleado("Poney", 5463.07),
          new Empleado("Tucan", 7161.08)
        );

        Calculadora_2 calculadora_2 = new Calculadora_2();

        List<Double> listaSalarios =
                calculadora_2.calc(
                        (salario_, incremento_) -> salario_ + (salario_ * (incremento_/100)),
                        listaEmpleados,
                        16.0);

        for (Double salario: listaSalarios) {
            System.out.println("salario = " + salario);
        }
    }

}
