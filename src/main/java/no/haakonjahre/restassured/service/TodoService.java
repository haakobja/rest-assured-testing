package no.haakonjahre.restassured.service;

import no.haakonjahre.restassured.model.Todo;

import java.util.Arrays;
import java.util.List;

/**
 * Created by hakonj on 07/04/16.
 */
public class TodoService {
    private final List<Todo> todoliste = Arrays.asList(new Todo("Melding"), new Todo("Hello World"));

    public List<Todo> hentListe() {
        return todoliste;
    }
}
