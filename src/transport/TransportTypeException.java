package transport;

public class TransportTypeException extends RuntimeException {

    public TransportTypeException() {
        super();
    }

    public TransportTypeException(String message) {
        super(message);
    }

    public TransportTypeException(String message, Throwable cause) {
        super(message, cause);
    }

    public TransportTypeException(Throwable cause) {
        super(cause);
    }
}
