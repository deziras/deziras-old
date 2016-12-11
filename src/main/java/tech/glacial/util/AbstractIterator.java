package tech.glacial.util;

/**
 * Created by glavo on 17-5-7.
 *
 * @author Glavo
 * @since 1.0.0
 */
public abstract class AbstractIterator<E> implements Iterator<E> {

    @Override
    public String toString() {
        return "non-empty iterator";
    }
}
