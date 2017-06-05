package tech.glacial.util.iterator;

import tech.glacial.util.Iterator;
import tech.glacial.util.NoSuchElementException;

/**
 * Created by glavo on 17-5-7.
 *
 * @author Glavo
 * @since 1.0.0
 */
public abstract class UniformIterator<E> implements Iterator<E> {
    private boolean traversed = false;

    public abstract E get();

    public E next() {
        if (traversed) throw new NoSuchElementException();
        else return get();
    }

    public boolean hasNext() {
        return false;
    }

    public void remove() {
        throw new UnsupportedOperationException("UniformIterator.remove()");
    }
}
