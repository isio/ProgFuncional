package Modulo_52.clients;

import Modulo_52.controllers.GuitaristController;
import Modulo_52.models.Guitarist;

import java.util.Optional;

public class GuitaristCliente {
    public static void main(String[] args) {
        GuitaristController controller = new GuitaristController();
        Optional<Guitarist> guitarist = controller.getGuitarist("Hendrix");

        // Expresion Lambda con nuestro Consumers
        guitarist.ifPresent(g -> System.out.println("g = " + g));
    }
}
