package iterator_collections;
/**
 *
 *
 * @param <E>
 */

public interface CustomIterator <E> {
    /**
     */
    boolean hasNext();

    /**
     */

    E next() throws CustomNoSuchElementException;

    /**
     */

    void remove() throws CustomIllegalStateException;

    /**
     */

}
