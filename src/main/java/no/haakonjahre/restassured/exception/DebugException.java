package no.haakonjahre.restassured.exception;

/**
 * Created by hakonj on 07/04/16.
 */
public class DebugException extends Exception {
    public DebugException() {
    }

    public DebugException(final String message) {
        super(message);
    }

    public DebugException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public DebugException(final Throwable cause) {
        super(cause);
    }

    public DebugException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
