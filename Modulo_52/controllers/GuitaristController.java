package Modulo_52.controllers;

import Modulo_52.models.Guitarist;
import Modulo_52.service.GuitaristService;

import java.util.Optional;

public class GuitaristController {

    public Optional<Guitarist> getGuitarist(String lastName) {
        return new GuitaristService().findByLastName(lastName);
    }

}
