package generics;

class CollectionsFullException extends Exception {
    public CollectionsFullException(String message) {
        super(message);
    }

    public CollectionsFullException(String message, Throwable cause) {
        super(message, cause);
    }
}
