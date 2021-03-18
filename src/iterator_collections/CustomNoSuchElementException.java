package iterator_collections;
public class CustomNoSuchElementException extends Throwable {
    public CustomNoSuchElementException(String message) {
        super(message);
    }

    public CustomNoSuchElementException(String message, Throwable cause) {
        super(message, cause);
    }
}
