package Modulo_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class DatosComensales {
    public static void main(String[] args) {
        List<Comensal> listaComensal = Arrays.asList(
                new Comensal("Juan", 343.00, 9),
                new Comensal("Pépe", 234.01, 9),
                new Comensal("Dani", 543.02, 9),
                new Comensal("Yamila", 985.03, 9),
                new Comensal("Michel", 198.04, 9)
        );

        System.out.println(getDatosComensales(listaComensal, x -> x.getNombre()));

        List<Object> nombresComensales = getDatosComensales(listaComensal, x -> x.getNombre());

        System.out.println("El nombre de comensales es el siguiente : ");
        for (Object nombreComensal: nombresComensales) {
            System.out.println("nombreComensal = " + nombreComensal);
        }

        List<Object> montosComensales = getDatosComensales(listaComensal, x -> x.getMonto_pedido());

        System.out.println("El monto por mesa es de ");
        for (Object montoComensal: montosComensales) {
            System.out.println("montoComensal = " + montoComensal);
        }
    }

    public static List<Object> getDatosComensales(
            List<Comensal> listaCom, Function<Comensal, Object> func) {

        // Esta lista guardara datos personalizados de los comensales.
        List<Object> listaDatos = new ArrayList<>();

        // Itera atravez de la lista de los comensales que recibimos
        for (Comensal comensal: listaCom) {
            listaDatos.add(func.apply(comensal));
        }

        return listaDatos;
    }
}
