package no.haakonjahre.restassured.rest;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import no.haakonjahre.restassured.model.Todo;
import org.apache.commons.lang3.StringUtils;
import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static com.jayway.restassured.RestAssured.given;

/**
 * Created by hakonj on 07/04/16.
 */
public class EndpointsIT {

    @Before
    public void setUp() {
        RestAssured.baseURI = "http://localhost:8080";
    }

    @Test
    public void hentListeDeserialiser() throws Exception {
        final Response response = given()
                .get();

        response.then()
                .assertThat()
                .statusCode(javax.ws.rs.core.Response.Status.OK.getStatusCode());

        final Todo[] liste = response.getBody()
                .as(Todo[].class);

        Assert.assertNotNull(liste);
        Assert.assertTrue(liste.length == 2);

        Assert.assertTrue(
                Arrays.asList(liste)
                        .stream()
                        .allMatch(todo -> StringUtils.isNotEmpty(todo.getTodo()))
        );
    }

    @Test
    public void hentListe() throws Exception {
        final Response response = given()
                .get();

        response.then()
                .assertThat()
                .statusCode(javax.ws.rs.core.Response.Status.OK.getStatusCode())
                .and()
                .body("[1].todo", IsEqual.equalTo("Hello World"));
    }

    @Test
    public void forventError() throws Exception {
        final Response response = given()
                .get("error");

        response.then()
                .assertThat()
                .statusCode(javax.ws.rs.core.Response.Status.INTERNAL_SERVER_ERROR.getStatusCode());
    }
}
