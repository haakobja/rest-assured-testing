package no.haakonjahre.restassured.rest;

import no.haakonjahre.restassured.exception.DebugException;
import no.haakonjahre.restassured.service.TodoService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by hakonj on 07/04/16.
 */
@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class Endpoints {

    private TodoService todoService = new TodoService();

    @GET
    public Response hentListe() {
        return Response.ok(todoService.hentListe())
                .build();
    }

    @GET
    @Path("error")
    public Response castException() throws DebugException {
        throw new DebugException("Helt feil");
    }
}
