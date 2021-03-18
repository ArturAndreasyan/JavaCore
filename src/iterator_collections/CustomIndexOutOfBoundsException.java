package iterator_collections;
public class CustomIndexOutOfBoundsException extends Exception {
    public CustomIndexOutOfBoundsException(String message) {
        super(message);
    }

    public CustomIndexOutOfBoundsException(String message, Throwable cause) {
        super(message, cause);
    }
}
