package no.haakonjahre.restassured.exception.mapper;

import no.haakonjahre.restassured.exception.DebugException;
import no.haakonjahre.restassured.model.ErrorObject;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * Created by hakonj on 07/04/16.
 */
@Provider
@Produces(MediaType.APPLICATION_JSON)
public class DebugExceptionMapper implements ExceptionMapper<DebugException> {
    @Override
    public Response toResponse(final DebugException e) {
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                .entity(new ErrorObject(e))
                .build();
    }
}
