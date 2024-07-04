package Modulo_15;

import java.util.function.Function;

public class DatosComensal {

    public static void main(String[] args) {
        Comensal comensal_01 = new Comensal("Israel", 123.00, 8);
        String nombreComensal = (String)getDatoComensal(comensal_01, x -> x.getNombre());

        int mesa = (int)getDatoComensal(comensal_01, x -> x.getMesa());

        System.out.println("nombreComensal = " + nombreComensal);
        System.out.println("mesa = " + mesa);
    }

    public static Object getDatoComensal(Comensal comensal, Function<Comensal, Object> function) {
        return function.apply(comensal);
    }
}
