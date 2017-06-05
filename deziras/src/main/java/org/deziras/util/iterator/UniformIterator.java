package org.deziras.util.iterator;

import org.deziras.util.NoSuchElementException;
import org.deziras.util.Iterator;

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
