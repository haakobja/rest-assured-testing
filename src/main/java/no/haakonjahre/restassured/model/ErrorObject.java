package no.haakonjahre.restassured.model;

/**
 * Created by hakonj on 07/04/16.
 */
public class ErrorObject {
    private final String message;
    private final Throwable cause;

    public ErrorObject(final Exception e) {
        this.message = e.getMessage();
        this.cause = e.getCause();
    }

    public Throwable getCause() {
        return cause;
    }

    public String getMessage() {
        return message;
    }
}
