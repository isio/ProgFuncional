package Modulo_52.service;

import Modulo_52.models.Guitarist;

import java.util.Optional;

public class GuitaristService {

    public Optional<Guitarist> findByLastName(String lastName) {
        if(lastName.equalsIgnoreCase("Hendrix")) {
            return Optional.of(new Guitarist("Jimi", "Hendrix", "Purple Haze"));
        }
        return Optional.empty();
    }

}
